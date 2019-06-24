package org.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.school.pojo.School;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String args[]) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		School school = new School();
		school.setName("汶南二中");
		school.setJbw(true);
		school.setEyy(true);
		session.save(school);
		tx.commit();
		session.close();
	}
}
