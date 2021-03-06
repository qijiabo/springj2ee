package com.baobaotao.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.baobaotao.dao.LoginLogDao;
import com.baobaotao.dao.UserDao;
import com.baobaotao.domain.LoginLog;
import com.baobaotao.domain.User;
@Service
public class UserService{
	//required 默认值为true  表示一定要找到匹配的bean 否则会报错
	//					false  相反，不一定要找到这个bean
	@Autowired(required=false)
	private UserDao userDao;
	
	@Autowired
	private LoginLogDao loginLogDao;
	
	public boolean hasMatchUser(String userName,String password){
		int matchCount=userDao.getMatchCount(userName, password);
		return matchCount>0;
	}
	
	public User findUserByUserName(String userName){
		return userDao.findUserByUserName(userName);
	}
	
	//登录成功执行操作
	public void loginSuccess(User user ){
		user.setCredits(5+user.getCredits());
		LoginLog loginLog=new LoginLog();
		loginLog.setUserId(user.getUserId());
		loginLog.setIp(user.getLastIp());
		loginLog.setLoginDate(user.getLastVisit());
		userDao.updateLoginInfo(user);
		loginLogDao.insertLoginLog(loginLog);
	}
}
