package com.table.demo;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.table.service.AllBuildOperationService;

/*
 * 作者:付全镇
 * 类名:Demo
 * 作用:执行插入
 * 日期:201906/28
 */

public class Demo {

	public static void main(String args[]) throws IOException {
		System.out.println("-----Start ");
		// 加载spring配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化AllBuildOperationService对象
		AllBuildOperationService allBuildOperationService = (AllBuildOperationService) context
				.getBean("allBuildOperationService");
		System.out.println("-----Start to insert data");
		// 插入
		allBuildOperationService.insertAll();
		System.out.println("-----finish insert data");
	}
}
