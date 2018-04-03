package com.qiuhui.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;

import com.qiuhui.entity.User;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public void save(User user) {
		
		String sql = "insert into t_user (name,age) values (?,?)";
		jdbcTemplate.update(sql, user.getName(),user.getAge());
		
	}
	
	
	public User findById(int id) {
		String sql="select * from t_user where id =?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),id );
	}


	public List<User> findAll() {
		String sql="select * from t_user";
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class));
	}


	public int count() {
		String sql ="select count(*) from t_user";
		return jdbcTemplate.queryForObject(sql,new SingleColumnRowMapper<Long>()).intValue();
	}


	public List<Map<String, Object>> getMap() {
		String sql = "select * from t_user";
		return jdbcTemplate.query(sql,new ColumnMapRowMapper());
	}
	
	
}
