package com.tcs.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tcs.mapper.UserMapper;
import com.tcs.model.User;


@Repository
public class UserDaoImpl implements UserDao {

Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public User addUser(User user) {
	
		String adduser="insert into user (id,userid,password,roleid,timestamp) values (?,?,?,?,?)";
		   jdbcTemplateObject.update(adduser,user.getId(),user.getUserid(),user.getPassword(),user.getRoleid(),user.getTimestamp());
		return user;
	}

	@Override
	public User deleteUser(Integer id) {
		String deleteuser = "delete from user where id = ?";
		jdbcTemplateObject.update(deleteuser,id);
		return null;
		
	}

	public List getUser(Integer id) {
		// TODO Auto-generated method stub
				String SQL = "select * from user where id ="+id;
				List<User> user = jdbcTemplateObject.query(SQL, new UserMapper());
				logger.debug("value", jdbcTemplateObject.query(SQL, new UserMapper()));
				logger.debug("value of emp-->" + user.toString());
				return user;
	}

}
