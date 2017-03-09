package kr.or.digt.mybatis_study.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.digt.mybatis_study.dao.StudentDao;
import kr.or.digt.mybatis_study.dao.utill.MybatisSqlSessionFactory;
import kr.or.digt.mybatis_study.dto.Student;

public class StundentService {
	private static final StundentService insetence= new StundentService();

	public static StundentService getInsetence() {
		return insetence;
	}

	private StundentService() {
		
	}
	
	public List<Student> selectStudentByAll(){
		SqlSession sqlsesstion = MybatisSqlSessionFactory.opensesstion();
		StudentDao studentdao= sqlsesstion.getMapper(StudentDao.class);
	//	sqlsesstion.close();
		return studentdao.selectStudentByAll();
		
	}
}