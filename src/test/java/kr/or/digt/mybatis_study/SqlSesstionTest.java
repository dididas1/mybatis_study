package kr.or.digt.mybatis_study;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.digt.mybatis_study.dao.utill.MybatisSqlSessionFactory;

public class SqlSesstionTest {
	private static SqlSessionFactory sqlSessionFactory;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sqlSessionFactory= MybatisSqlSessionFactory.getSqlSesstionFactory();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		sqlSessionFactory = null;
	}

	@Test
	public void testSqlSession() {
		Assert.assertNotNull(sqlSessionFactory.openSession());
	}

}
