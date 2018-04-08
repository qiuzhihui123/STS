package com.qiuhui.util;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

public class DbHelp {

	private static QueryRunner runner = new QueryRunner();
	
	public static int executeInsert(String sql,Object...params) throws SQLException {
		
		return runner.insert(sql,new ScalarHandler<Long>(),params).intValue();
		
	}
	
	public static void executeUpdate(String sql,Object...params) throws SQLException {
		
		runner.update(sql,params);
	}
	
	public static<T> T executeQuery(String sql,ResultSetHandler<T> rsh,Object...params) throws SQLException {
		
		return runner.query(sql,rsh,params);
		
	}
	
	
	
	
}
