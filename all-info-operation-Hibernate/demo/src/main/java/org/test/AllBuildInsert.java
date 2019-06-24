package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import cn.classInfo.service.ClassService;
import cn.classInfo.serviceImpl.ClassServiceImpl;
import cn.course.service.CourseService;
import cn.course.serviceImpl.CourseServiceImpl;
import cn.elective.service.ElectiveService;
import cn.elective.serviceImpl.ElectiveServiceImpl;
import cn.grade.service.GradeService;
import cn.grade.serviceImpl.GradeServiceImpl;
import cn.school.service.SchoolService;
import cn.school.serviceImpl.SchoolServiceImpl;
import cn.student.service.StudentService;
import cn.student.serviceImpl.StudentServiceImpl;
import cn.teacher.service.TeacherService;
import cn.teacher.serviceImpl.TeacherServiceImpl;

/*
 * 作者:付全镇
 * 类名:AllBuildInsert
 * 作用:插入数据
 * 日期:1029/06/21
 */

public class AllBuildInsert {
	public static void main(String args[]) {
		// 创建SchoolServiceImpl对象
		SchoolService schoolServiceImpl = new SchoolServiceImpl();
		// 创建GradeServiceImpl对象
		GradeService gradeServiceImpl = new GradeServiceImpl();
		// 创建ClassServiceImpl对象
		ClassService classServiceImpl = new ClassServiceImpl();
		// 创建StudentServiceImpl对象
		StudentService studentServiceImpl = new StudentServiceImpl();
		// 创建TeacherServiceImpl对象
		TeacherService teacherServiceImpl = new TeacherServiceImpl();
		// 创建CourseServiceImpl对象
		CourseService courseServiceImpl = new CourseServiceImpl();
		// 创建ElectiveServiceImpl对象
		ElectiveService electiveServiceImpl = new ElectiveServiceImpl();

		Random random = new Random();
		// 插入学校信息
		List<Long> schoolIdList = schoolServiceImpl.insertSchool("合肥", 100);
		// 插入年级信息
		List<Long> gradeIdList = gradeServiceImpl.insertGrade(4);
		// 插入课程信息
		List<Long> courseIdList = courseServiceImpl.insertCourse(10);
		// 插入教师信息
		Map<Long, Long> courseTeacherMap = teacherServiceImpl.insertTeacher(courseIdList);

		for (long schoolId : schoolIdList) {
			for (long gradeId : gradeIdList) {
				for (int i = 1; i <= 25; i++) {
					// 生成班级姓名
					String name = i + "班";
					// 插入班级信息
					long classId = classServiceImpl.insertClass(schoolId, gradeId, name);
					// 插入学生信息
					List<Long> studentIdList = studentServiceImpl.insertStudent(schoolId, gradeId, classId);
					for (long studentId : studentIdList) {
						// 随机取4到6个数，作为课程数
						int count = random.nextInt(3) + 4;
						// 创建一个compareList集合,用来存courseId
						List<Long> compareList = new ArrayList<Long>();
						for (int r = 0; r < count; r++) {
							int size = courseTeacherMap.size();
							// 随机取一个下标值
							int index = random.nextInt(size);
							// 取得这个位置的courseId
							Long courseId = courseIdList.get(index);
							// 在courseTeacherMap集合中,找到courseId对应的values值
							Long teacherId = courseTeacherMap.get(courseId);
							// 判断集合compareList是否包含courseId,不包含就执行插入操作
							if (!compareList.contains(courseId)) {
								// 插入选课信息
								electiveServiceImpl.insertElective(studentId, teacherId, courseId);
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
