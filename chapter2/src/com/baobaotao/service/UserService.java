package com.baobaotao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baobaotao.dao.LoginLogDao;
import com.baobaotao.dao.UserDao;
import com.baobaotao.domain.LoginLog;
import com.baobaotao.domain.User;

@Service //��UserServiceע��Ϊ�����Bean
public interface UserService {
	public boolean hasMatchUser(String userName,String password);
	
	public User findUserByUserName(String userName);
	
	//��¼�ɹ�ִ�в���
	public void loginSuccess(User user );
}
