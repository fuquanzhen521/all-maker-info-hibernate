package cn.teacher.serviceImpl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.teacher.daoImpl.TeacherDaoImpl;
import cn.teacher.pojo.Teacher;
import cn.teacher.service.TeacherService;
import cn.teacherMaker.dao.TeacherDao;

/*
 * 作者:付全镇
 * 类名:TeacherServiceImpl
 * 作用:加载核心配置文件,获取连接
 * 日期:2019/06/21
 */

public class TeacherServiceImpl implements TeacherService {

	// 插入
	public Map<Long, Long> insertTeacher(List<Long> courseIdList) {
		// 创建一个key类型为Long,value类型为Long的map
		Map<Long, Long> courseTeacherMap = new HashMap<Long, Long>();
		// 创建TeacherDaoImpl对象
		TeacherDao teacherDaoImpl = new TeacherDaoImpl();
		// 创建Teacher对象
		Teacher teacher = new Teacher();
		// 存入一些姓氏数组元素
		String x[] = { "赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈" };
		// 存入一些名字数组元素
		String m[] = { "华", "夏", "雷", "锋", "好", "榜", "样", "学", "习", "好" };
		// 打乱courseIdList顺序
		Collections.shuffle(courseIdList);
		for (long courseId : courseIdList) {
			// 随机取得数组x的下标值
			int a = (int) Math.abs(x.length * Math.random());
			// 随机取得数组m的下标值
			int b = (int) Math.abs(m.length * Math.random());
			// 取得姓名
			String name = x[a] + m[b];
			teacher.setName(name);
			teacher.setCourseId(courseId);
			// 调用dao层的insertTeacher方法
			teacherDaoImpl.insertTeacher(teacher);
			// 获取id
			long id = teacher.getId();
			// 把courseId作为key值,id作为value值存入map中
			courseTeacherMap.put(courseId, id);
		}
		// 返回集合
		return courseTeacherMap;
	}

}
