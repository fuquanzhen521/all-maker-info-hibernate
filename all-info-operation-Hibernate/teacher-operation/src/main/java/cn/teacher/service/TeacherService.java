package cn.teacher.service;

import java.util.List;
import java.util.Map;

public interface TeacherService {

	public Map<Long, Long> insertTeacher(List<Long> courseIdList);

}
