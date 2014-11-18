package com.baobaotao.domain;

import java.util.Date;
import java.util.Set;

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
	private String userType;//�û����
	private Set mainBoards;//��Ҫ���
	
	

	
	//-------------------------------------
	public Set getMainBoards() {
		return mainBoards;
	}
	public void setMainBoards(Set mainBoards) {
		this.mainBoards = mainBoards;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
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
