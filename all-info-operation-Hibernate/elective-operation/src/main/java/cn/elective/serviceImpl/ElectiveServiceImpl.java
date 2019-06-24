package cn.elective.serviceImpl;

import java.util.Random;

import cn.elective.daoImpl.ElectiveDaoImpl;
import cn.elective.pojo.Elective;
import cn.elective.service.ElectiveService;

/*
 * 作者:付全镇
 * 类名:ElectiveServiceImpl
 * 作用:增删查改的具体操作
 * 日期:2019/06/21
 */

public class ElectiveServiceImpl implements ElectiveService {

	// 插入
	public void insertElective(long studentId, long teacherId, long courseId) {
		// 创建ElectiveDaoImpl对象
		ElectiveDaoImpl electiveDaoImpl = new ElectiveDaoImpl();
		// 创建Elective对象
		Elective elective = new Elective();
		elective.setStudentId(studentId);
		elective.setTeacherId(teacherId);
		elective.setCourseId(courseId);
		Random random = new Random();
		// 随机取十个数
		int a = random.nextInt(10);
		// 当小于等于2时,成绩在60以下;大于2小于等于7时，成绩在60至80之间;大于7时,成绩在80以上
		if (a <= 2) {
			// 如果小于等于2,成绩就在60以下
			int score = random.nextInt(60);
			elective.setScore(score);
		} else if (a > 2 && a <= 7) {
			// 如果大于2,小于等于7,成绩就在60至80之间
			int score = random.nextInt(20) + 60;
			elective.setScore(score);
		} else {
			// 如果大于7,成绩就在80至100之间
			int score = random.nextInt(20) + 80;
			elective.setScore(score);
		}
		// 调用dao的insertElective方法
		electiveDaoImpl.insertElective(elective);
	}

}
