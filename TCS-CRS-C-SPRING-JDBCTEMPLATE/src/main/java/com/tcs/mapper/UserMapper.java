package com.tcs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.tcs.model.User;

/**
 * @author springuser19
 *
 */
public class UserMapper  implements RowMapper<User> {
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		User user = new User();
		user.setUserid(rs.getString("userid"));
		user.setPassword(rs.getString("password"));
		user.setRoleid(rs.getInt("roleId"));
		user.setTimestamp(rs.getTimestamp("timestamp"));

        return user;
	}


}