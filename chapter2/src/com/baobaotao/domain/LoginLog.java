package com.baobaotao.domain;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable{
	private int loginLogId;
	private int userId;//�û�Id
	private String ip;//ip
	private Date loginDate;//��¼����
	
	
	//------------------------------------------
	public int getLoginLogId() {
		return loginLogId;
	}
	public void setLoginLogId(int loginLogId) {
		this.loginLogId = loginLogId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
}
