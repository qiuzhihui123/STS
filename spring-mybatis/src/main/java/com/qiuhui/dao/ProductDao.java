package com.qiuhui.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qiuhui.entity.Product;
import com.qiuhui.mapper.KaolaMapper;

@Repository
public class ProductDao {

	@Autowired
	private SqlSessionFactoryBean sqlSessionFactoryBean;
	
	@Autowired
	private KaolaMapper kaolaMapper;
	
	public Product findById(int id) throws Exception {
//		SqlSession sqlSession = sqlSessionFactoryBean.getObject().openSession(true);
//		return sqlSession.selectOne("com.qiuhui.mapper.KaolaMapper.findById",id);
		return kaolaMapper.findById(id);
	}

}
