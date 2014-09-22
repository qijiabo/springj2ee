package com.baobaotao.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.User;

@Repository  //ͨ��springע�ⶨ��һ��DAO
public class UserDao {
	@Autowired  //�Զ�ע��  jdbcTemplate��Bean
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * ��ѯ�û����������Ӧ���û���
	 * @param userName
	 * @param password
	 * @return
	 */
	public int getMatchCount(String userName,String password){
		String sqlStr=" SELECT count(1) FROM t_user "
			+"WHERE user_name=? and password=? ";
		return jdbcTemplate.queryForInt(sqlStr,new Object[]{userName,password});
	}
	/**
	 * ͨ���û��������û�
	 * @param userName
	 * @return
	 */
	public User findUserByUserName(final String userName){
		String sqlStr="SELECT user_id,user_name,credits " +
				"FROM t_user WHERE user_name=? ";
		final User user=new User();
		jdbcTemplate.query(sqlStr, new Object[]{userName},
				new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException{
				user.setUserId(rs.getInt("user_id"));
				user.setUserName(userName);
				user.setCredits(rs.getInt("credits"));
			}
		});
		return user;
	}
	
	/**
	 * �����û���Ϣ
	 * @param user
	 */
	public void updateLoginInfo(User user){
		String sqlStr=" UPDATE t_user SET last_visit=?," +
										"last_ip=?," +
										"credits=?  WHERE user_id=?";
		jdbcTemplate.update(sqlStr, new Object[]{
				user.getLastVisit(),user.getLastIp(),
				user.getCredits(),user.getUserId()});
	}
	
	
	
	
	
	//------------------------------------
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
}
