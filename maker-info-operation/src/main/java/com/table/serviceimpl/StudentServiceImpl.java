package com.table.serviceimpl;

import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.table.dao.StudentDao;
import com.table.pojo.Student;
import com.table.service.StudentService;

/*
 * 作者:付全镇
 * 类名:StudentServiceImpl
 * 作用:student表的增删查改具体实现
 * 日期：2019/6/28
 */
public class StudentServiceImpl implements StudentService {

	// 无参构造器
	public StudentServiceImpl() {
	}

	// 插入
	public void insertStudent(long schoolId, long gradeId, long classId) throws IOException {
		// 创建Student对象
		Student student = new Student();
		// 加载spring配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化StudentDao对象
		StudentDao studentDao = (StudentDao) context.getBean("studentDaoImpl");
		// 随机函数
		Random random = new Random();
		// 随机取90到100个学生数
		int studentIndex = random.nextInt(10) + 90;
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
		for (int i = 0; i <= studentIndex; i++) {
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
			student.setSch_id(schoolId);
			student.setGra_id(gradeId);
			student.setCla_id(classId);
			studentDao.insertStudent(student);
		}
	}

	// 查询
	public List<Long> selectStudent(Map<String, Object> map) throws IOException {
		// 加载spring配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化StudentDao对象
		StudentDao studentDao = (StudentDao) context.getBean("studentDaoImpl");
		// 查询
		List<Long> stuentIdList = studentDao.selectStudent(map);
		return stuentIdList;
	}

}
