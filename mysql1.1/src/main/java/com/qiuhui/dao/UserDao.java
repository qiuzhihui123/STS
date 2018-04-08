package com.qiuhui.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.qiuhui.entity.User;

@Repository
public class UserDao {

	@Inject
	private JdbcTemplate jdbcTemplate;
	
	/*@Resource
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;*/
	
	public void save(User user) {
		String sql = "insert into t_user (name,age) values (?,?)";
		jdbcTemplate.update(sql,user.getName(),user.getAge());
	}

	public User findUserById(int id) {
		String sql ="select * from t_user where id = ?";
		return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),id);
	}

	public List<User> findAll() {
		String sql ="select * from t_user";
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class));
	}

	public List<Map<String, Object>> findMap() {
		String sql ="select * from t_user";
		return jdbcTemplate.query(sql,new ColumnMapRowMapper());
	}

	public void batchSave(List<User> userList) {
		
		String sql = "insert into t_user (name,age) values (?,?)";
		List<Object[]> params = new ArrayList<>(); 
		
		for(User user : userList) {
			Object[] obj = {user.getName(),user.getAge()};
			params.add(obj);
		}
		
		jdbcTemplate.batchUpdate(sql,params);
		
	}
	
	/*public void namedParameterJdbcTemplateSave(User user) {
		String sql = "insert into t_user (name,age) values (:name,:age)";
		Map<String,Object> map = new HashMap<>();
		map.put("name", user.getName());
		map.put("age", user.getAge());
		
		namedParameterJdbcTemplate.update(sql, map);
		
	}*/
	

}
