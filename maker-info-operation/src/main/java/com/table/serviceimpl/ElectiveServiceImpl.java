package com.table.serviceimpl;

import java.io.IOException;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.table.dao.ElectiveDao;
import com.table.pojo.Elective;
import com.table.service.ElectiveService;

public class ElectiveServiceImpl implements ElectiveService {

	// 插入
	public void insertElective(long studentId, long teacherId, long courseId) throws IOException {
		// 加载spring配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化ElectiveDao对象
		ElectiveDao electiveDao = (ElectiveDao) context.getBean("electiveDaoImpl");
		// 创建Elective对象
		Elective elective = new Elective();
		elective.setSid(studentId);
		elective.setTid(teacherId);
		elective.setCid(courseId);
		// 随机函数
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
		// 插入
		electiveDao.insertElective(elective);
	}

}
