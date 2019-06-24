package cn.grade.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 * 作者:付全镇
 * 类名:GradeUtils
 * 作用:加载核心配置文件,获取连接
 * 日期:2019/06/21
 */

public class GradeUtils {

	// 定义两个属性
	private static Configuration configuration;

	private static SessionFactory sessionFactory;

	static {
		configuration = new Configuration();
		// 加载核心配置文件
		configuration.configure();
		// 创建session工厂
		sessionFactory = configuration.buildSessionFactory();
	}

	// 获取连接
	public static Session openSession() {
		return sessionFactory.openSession();
	}

}
