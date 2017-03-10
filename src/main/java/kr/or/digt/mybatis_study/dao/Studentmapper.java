package kr.or.digt.mybatis_study.dao;

import java.util.List;

import kr.or.digt.mybatis_study.dto.Student;

public interface Studentmapper {
	int insertStudent(Student student);
	List<Student> selectStudentByAll();
	// 과제 테스트까지 완료 branch이용해서
	Student selectStudentByNo(int studNo);
	int updateStudent(Student student);
	int deleteStudnet(int stuNo);
	int insertStudentWithPhone(Student student);  // 타입핸들러 예제
}
