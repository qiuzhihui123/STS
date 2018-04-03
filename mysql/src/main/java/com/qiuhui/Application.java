package com.qiuhui;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@PropertySource("classpath:config.properties")
public class Application {
	
	@Inject
	private Environment environment;

	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(environment.getProperty("jdbc.driver"));
		basicDataSource.setUrl(environment.getProperty("jdbc.url"));
		basicDataSource.setUsername(environment.getProperty("jdbc.username"));
		basicDataSource.setPassword(environment.getProperty("jdbc.password"));
		
		basicDataSource.setInitialSize(Integer.parseInt(environment.getProperty("jdbc.init")));
		basicDataSource.setMaxTotal(Integer.parseInt(environment.getProperty("jdbc.max")));
		basicDataSource.setMaxWaitMillis(Integer.parseInt(environment.getProperty("jdbc.maxwait")));
		
		return basicDataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate;
		
	}
	
	
	
}
