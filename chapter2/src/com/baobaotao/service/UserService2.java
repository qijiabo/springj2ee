package com.baobaotao.service;

import com.baobaotao.domain.User;

public interface UserService2 {
	public boolean hasMatchUser(String userName,String password);
	
	public User findUserByUserName(String userName);
	
	//��¼�ɹ�ִ�в���
	public void loginSuccess(User user );
}
