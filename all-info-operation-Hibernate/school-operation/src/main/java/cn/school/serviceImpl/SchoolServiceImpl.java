package cn.school.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cn.school.daoImpl.SchoolDaoImpl;
import cn.school.pojo.School;
import cn.school.service.SchoolService;
import cn.schoolMaker.dao.SchoolDao;

/*
 * 作者:付全镇
 * 类名:SchoolServiceImpl
 * 作用:增删查改的具体操作
 * 日期:2019/06/21
 */

public class SchoolServiceImpl implements SchoolService {

	// 插入
	public List<Long> insertSchool(String schoolName, Integer size) {
		// 创建一个Long类型集合
		List<Long> idList = new ArrayList<Long>();
		// 创建随机数类对象
		Random random = new Random();
		// 创建学校对象
		School school = new School();
		// 创建SchoolDaoImpl对象
		SchoolDao schoolDaoImpl = new SchoolDaoImpl();

		for (int i = 1; i <= size; i++) {
			// 获取学校名字
			String name = schoolName + "第" + i + "中学";
			school.setName(name);
			// 随机取0到9之间的数
			int r = random.nextInt(10);
			if (r >= 0 && r < 5) {
				// 当大于等于0且小于5时,既不是985,也不是211;
				school.setJbw(false);
				school.setEyy(false);
			} else if (r >= 5 && r < 7) {
				// 当大于等于5且小于7时,是985,但不是211;
				school.setJbw(true);
				school.setEyy(false);
			} else if (r >= 7 && r < 9) {
				// 当大于等于7且小于9时,不是985,但是211;
				school.setJbw(false);
				school.setEyy(true);
			} else {
				// 当等于9时,是985，也是211;
				school.setJbw(true);
				school.setEyy(true);
			}
			// 调用dao层的insertSchool方法
			schoolDaoImpl.insertSchool(school);
			// 获取插入后生成的id
			long id = school.getId();
			// 把id存入集合idList中
			idList.add(id);
		}
		// 返回集合
		return idList;
	}

}
