package com.baobaotao.domain;

import java.util.Date;

public class User extends BaseDomain{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;//�û�Id
	private String userName;//�û���
	private String password;//����
	private String credits;//���֤��
	private String lastIp;//�ϴε�¼ip
	private Date lastVisit;//�ϴε�¼����
	
	
	

	//-------------------------------------
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	public Date getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
	
}
