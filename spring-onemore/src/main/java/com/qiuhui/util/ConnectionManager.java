package com.qiuhui.util;


import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionManager {

	private final static String DRIVER = "com.mysql.jdbc.Driver";
	private final static String URL = "jdbc:mysql:///db_25";
	private final static String USER = "root";
	private final static String PASSWORD = "929813";
	
	private static BasicDataSource dataSource = new BasicDataSource();
	
	
	public static DataSource getDataSource() {
		dataSource.setDriverClassName(DRIVER);
		dataSource.setUrl(URL);
		dataSource.setUsername(USER);
		dataSource.setPassword(PASSWORD);
		
		dataSource.setInitialSize(5);
		dataSource.setMaxIdle(20);
		dataSource.setMinIdle(5);
		dataSource.setMaxWaitMillis(5000);
		
		
		return dataSource;
		
	}
	
}
