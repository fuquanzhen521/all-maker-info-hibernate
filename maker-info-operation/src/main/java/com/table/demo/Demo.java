package com.table.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.table.pojo.Teacher;
import com.table.service.ClassInfoService;
import com.table.service.CourseService;
import com.table.service.ElectiveService;
import com.table.service.GradeService;
import com.table.service.SchoolService;
import com.table.service.StudentService;
import com.table.service.TeacherService;

/*
 * 作者:付全镇
 * 类名:Demo
 * 作用:执行增删查改
 * 日期:201906/28
 */
public class Demo {

	public static void main(String args[]) throws IOException {
		// 加载spring配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化SchoolService对象
		SchoolService schoolService = (SchoolService) context.getBean("schoolServiceImpl");
		// 实例化GradeService对象
		GradeService gradeService = (GradeService) context.getBean("gradeServiceImpl");
		// 实例化ClassInfoService对象
		ClassInfoService classInfoService = (ClassInfoService) context.getBean("classInfoServiceImpl");
		// 实例化StudentService对象
		StudentService studentService = (StudentService) context.getBean("studentServiceImpl");
		// 实例化CourseService对象
		CourseService courseService = (CourseService) context.getBean("courseServiceImpl");
		// 实例化TeacherService对象
		TeacherService teacherService = (TeacherService) context.getBean("teacherServiceImpl");
		// 实例化ElectiveService对象
		ElectiveService electiveService = (ElectiveService) context.getBean("electiveServiceImpl");

		// 插入school表
		schoolService.insertSchool("合肥", 100);
		// 查询school表id
		List<Long> schoolIdList = schoolService.selectSchool();

		// 插入grade表
		gradeService.insertGrade(4);
		// 查询grade表id
		List<Long> gradeIdList = gradeService.selectGrade();

		// 插入course表
		courseService.insertCourse(10);
		// 查询course表id
		List<Long> courseIdList = courseService.selectCourse();

		// 插入teacher表
		teacherService.insertTeacher();
		// 查询teacher表对象
		List<Teacher> teacherList = teacherService.selectTeacher();

		// 创建map集合,用来存储class表的查询条件
		Map<String, Object> classMap = new HashMap<String, Object>();
		// 创建map集合,用来存储student表的查询条件
		Map<String, Object> studentMap = new HashMap<String, Object>();
		for (long schoolId : schoolIdList) {
			for (long gradeId : gradeIdList) {
				// 插入class表
				classInfoService.insertClass(schoolId, gradeId, 25);
				classMap.put("sch_id", schoolId);
				classMap.put("gra_id", gradeId);
				// 查询班级学校id为schoolId且年级id为gradeId的班级id
				List<Long> classInfoIdList = classInfoService.selectClass(classMap);
				for (long classId : classInfoIdList) {
					// 插入student表
					studentService.insertStudent(schoolId, gradeId, classId);
					studentMap.put("cla_id", classId);
					// 查询student表的id
					List<Long> studentIdList = studentService.selectStudent(studentMap);
					for (long studentId : studentIdList) {
						Random random = new Random();
						// 随机取4到6个数，作为课程数
						int count = random.nextInt(3) + 4;
						// 创建一个compareList集合,用来存courseId
						List<Long> compareList = new ArrayList<Long>();
						for (int r = 0; r < count; r++) {
							int size = teacherList.size();
							// 随机取一个下标值
							int index = random.nextInt(size);
							// 取得这个位置的teacher对象
							Teacher teacher = teacherList.get(index);
							// 取得这个位置的courseId
							long courseId = teacher.getCid();
							// 取得这个位置的teacherId
							long techerId = teacher.getId();
							// 判断集合compareList是否包含courseId,不包含就执行插入操作
							if (!compareList.contains(courseId)) {
								// 插入选课信息
								electiveService.insertElective(studentId, techerId, courseId);
								// 将courseId存入集合compareList中
								compareList.add(courseId);
							} else {
								// 如果compareList集合包含courseId的值,就让count加1
								count = count + 1;
							}
						}
					}
				}
			}
		}

	}
}
