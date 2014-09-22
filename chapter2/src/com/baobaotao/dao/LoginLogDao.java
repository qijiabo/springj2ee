package com.baobaotao.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.LoginLog;
import com.baobaotao.domain.User;

@Repository  //ͨ��springע�ⶨ��һ��DAO
public class LoginLogDao {
	@Autowired  //�Զ�ע��  jdbcTemplate��Bean
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * �����¼��־
	 * @param loginLog
	 */
	public void insertLoginLog(LoginLog loginLog){
		String sqlStr=" INSERT INTO t_login_log (user_id,ip,login_datetime)" +
				" VALUES (?,?,?)";
		jdbcTemplate.update(sqlStr, new Object[]{
				loginLog.getUserId(),loginLog.getIp(),loginLog.getLoginDate()});
	}
		
	//------------------------------------
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
}
