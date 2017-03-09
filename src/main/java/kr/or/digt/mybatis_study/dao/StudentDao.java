package kr.or.digt.mybatis_study.dao;

import java.util.List;

import kr.or.digt.mybatis_study.dto.Student;

public interface StudentDao {
	int insertStudent(Student student);
	List<Student> selectStudentByAll();
}
