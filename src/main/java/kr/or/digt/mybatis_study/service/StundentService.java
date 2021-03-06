package kr.or.digt.mybatis_study.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.digt.mybatis_study.dao.Studentmapper;
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
		Studentmapper studentdao= sqlsesstion.getMapper(Studentmapper.class);
	//	sqlsesstion.close();
		return studentdao.selectStudentByAll();
		
	}
	
	public int insertStudent(Student student){
		SqlSession sqlsesstion = MybatisSqlSessionFactory.opensesstion();
		Studentmapper studentdao= sqlsesstion.getMapper(Studentmapper.class);
		int res= studentdao.insertStudent(student);
		sqlsesstion.commit();
		return res;
	}
	
	public Student selectStudentByNo(int studNo){
		SqlSession sqlsesstion = MybatisSqlSessionFactory.opensesstion();
		Studentmapper student= sqlsesstion.getMapper(Studentmapper.class);
		return student.selectStudentByNo(studNo);
	}
	
	public int insertStudentWithPhone(Student student){
		int res=-1;
		try(SqlSession sqlsesstion = MybatisSqlSessionFactory.opensesstion();){
			Studentmapper studentdao= sqlsesstion.getMapper(Studentmapper.class);
			res = studentdao.insertStudentWithPhone(student);
			sqlsesstion.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return res;
		
		
	}
	
	public int updateStudent(Student student){
		SqlSession sqlsesstion = MybatisSqlSessionFactory.opensesstion();
		Studentmapper studentdao= sqlsesstion.getMapper(Studentmapper.class);
		int res= studentdao.updateStudent(student);
		sqlsesstion.commit();
		return res;
		
	}
	
	public int deleteStudnet(int stuNo){
		SqlSession sqlsesstion = MybatisSqlSessionFactory.opensesstion();
		Studentmapper studentdao = sqlsesstion.getMapper(Studentmapper.class);
		int res= studentdao.deleteStudnet(stuNo);
		sqlsesstion.commit();
		return res;
		
	}
	
	
}
