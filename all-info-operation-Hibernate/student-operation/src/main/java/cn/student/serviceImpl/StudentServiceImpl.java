package cn.student.serviceImpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import cn.student.daoImpl.StudentDaoImpl;
import cn.student.pojo.Student;
import cn.student.service.StudentService;
import cn.studentMaker.dao.StudentDao;

/*
 * 作者:付全镇
 * 类名:StudentServiceImpl
 * 作用:增删查改的具体操作
 * 日期:2019/06/21
 */

public class StudentServiceImpl implements StudentService {

	// 插入
	public List<Long> insertStudent(long schoolId, long gradeId, long classId) {
		// 创建一个Long类型集合
		List<Long> idList = new ArrayList<Long>();
		// 创建StudentDaoImpl对象
		StudentDao studentDaoImpl = new StudentDaoImpl();
		// 创建Student对象
		Student student = new Student();
		// 在数组x里面存入一些姓氏元素
		String x[] = { "孙", "刘", "曹", "关", "张", "赵", "黄", "郭", "吕", "诸葛", "马", "魏", "杨", "付", "王", "吴", "任", "李", "司徒",
				"顾", "易", "万", "马", "谢", "毛", "周" };
		// 在数组m里面存入一些名字元素
		String m[] = { "权", "备", "操", "羽", "飞", "云", "忠", "嘉", "布", "亮", "超", "延", "广", "强", "阳", "广", "静", "龙", "末",
				"未", "川", "可", "珂", "倩", "东", "来" };
		// 获取一个Calendar对象并可以进行时间的计算，时区的指定
		Calendar cal = Calendar.getInstance();
		// 设置时间
		cal.set(1990, 0, 1);
		// 获得时间,并赋值给start
		long start = cal.getTimeInMillis();
		// 设置时间
		cal.set(2002, 12, 12);
		// 获得时间,并赋值给end
		long end = cal.getTimeInMillis();
		Random random = new Random();
		// 随机获得90到100个学生
		int studentIndex = random.nextInt(10) + 90;
		for (int i = 0; i < studentIndex; i++) {
			// 随机取数组x的下标值
			int a = (int) Math.abs(x.length * Math.random());
			// 随机取数组m的下标值
			int b = (int) Math.abs(m.length * Math.random());
			// 生成学生姓名
			String studentName = x[a] + m[b];
			// 生成出生日期
			Date birthday = new Date(start + (long) (random.nextDouble() * (end - start)));
			// 判断性别
			Byte sex = (byte) (random.nextInt(2) + 1);
			student.setName(studentName);
			student.setBirthday(birthday);
			student.setSex(sex);
			student.setSchoolId(schoolId);
			student.setGradeId(gradeId);
			student.setClassId(classId);
			// 调用dao层的insertStudent方法
			studentDaoImpl.insertStudent(student);
			// 获取id
			long id = student.getId();
			// 把id存入集合
			idList.add(id);
		}
		// 返回集合
		return idList;
	}

}
