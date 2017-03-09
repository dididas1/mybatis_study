package kr.or.digt.mybatis_study;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


import kr.or.digt.mybatis_study.dto.Student;
import kr.or.digt.mybatis_study.service.StundentService;

public class StudentServiceTest {
	private static StundentService studentservice;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentservice = StundentService.getInsetence();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentservice=null;
	}

	@Test
	public void testselectStudentByAll() {
		List<Student> list =studentservice.selectStudentByAll();
		for(Student e:list){
			System.out.println(e);
		}
		Assert.assertNotNull(list);
	}
	
	@Test
	public void testinsertStudent() {
		Student std= new Student(2, "이승우", "lsw@naver.com", new Date());
		int res= studentservice.insertStudent(std);
		Assert.assertEquals(1, res);
	}

}
