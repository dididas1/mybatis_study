package kr.or.digt.mybatis_study;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.digt.mybatis_study.dto.PhoneNumber;
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

/*	@Test
	public void testselectStudentByAll() {
		List<Student> list =studentservice.selectStudentByAll();
		for(Student e:list){
			System.out.println(e);
		}
		Assert.assertNotNull(list);
	}
	*/
/*	@Test
	public void testinsertStudent() {
		Student std= new Student(2, "이승우", "lsw@naver.com", new Date());
		int res= studentservice.insertStudent(std);
		Assert.assertEquals(1, res);
	}
	*/
	
	@Test
	public void testinsertStudentWithPhone(){
		Student std= new Student(3, "이승우3", "lsw@naver.com", new Date(), new PhoneNumber("010-1234-5678"));
		int res= studentservice.insertStudentWithPhone(std);
		Assert.assertEquals(1, res);
	}
/*	@Test
	public void testselectStudentByNo() {
		Student studnet =studentservice.selectStudentByNo(1);
		Assert.assertNotNull(studnet);
	}*/
/*	@Test
	public void testupdateStudent(){
		int std = studentservice.updateStudent(new Student(1, "천재", "1@3.net", new Date()));
		Assert.assertEquals(1, std);
	}*/
/*	@Test
	public void testdeleteStudnet(){
		int std = studentservice.deleteStudnet(1);
		Assert.assertEquals(1, std);
		System.out.println(std);
	}*/
}
