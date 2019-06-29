package com.table.serviceimpl;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.table.dao.SchoolDao;
import com.table.pojo.School;
import com.table.service.SchoolService;

/*
 * 作者:付全镇
 * 类名:SchoolServiceImpl
 * 作用:school表的增删查改的具体实现
 * 日期:2019/6/28
 */
public class SchoolServiceImpl implements SchoolService {

	// 无参构造器
	public SchoolServiceImpl() {
	}

	// 插入
	public void insertSchool(String schoolName, Integer size) throws IOException {
		// 创建School对象
		School school = new School();
		// 加载spring的xml文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化SchoolDaoImpl对象
		SchoolDao schoolDao = (SchoolDao) context.getBean("schoolDaoImpl");
		// 随机函数
		Random random = new Random();
		// 遍历传入的学校数
		for (int i = 1; i <= size; i++) {
			// 生成姓名
			String name = schoolName + "第" + i + "中学";
			// 传入姓名
			school.setName(name);
			// 随机生成十个数
			int count = random.nextInt(10);
			if (count >= 0 && count < 5) { // 当大于等于0,且小于5时,既不是985,也不是211
				school.setJbw(false);
				school.setEyy(false);
			} else if (count >= 5 && count < 7) { // 当大于等于5,且小于7时,是985,不是211
				school.setJbw(true);
				school.setEyy(false);
			} else if (count >= 7 && count < 9) { // 当大于等于7,且小于9时,不是985,是211
				school.setJbw(false);
				school.setEyy(true);
			} else { // 当等于9时,是985,也是211
				school.setJbw(true);
				school.setEyy(true);
			}
			// 插入
			schoolDao.insertSchool(school);
		}
	}

	// 查询
	public List<Long> selectSchool() throws IOException {
		// 加载spring的xml文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化SchoolDaoImpl对象
		SchoolDao schoolDao = (SchoolDao) context.getBean("schoolDaoImpl");
		// 查询
		List<Long> schoolIdList = schoolDao.selectSchool();
		// 返回集合
		return schoolIdList;
	}

}
