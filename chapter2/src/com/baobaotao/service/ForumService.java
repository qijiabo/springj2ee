package com.baobaotao.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.baobaotao.dao.BoardDao;
import com.baobaotao.dao.LoginLogDao;
import com.baobaotao.dao.PostDao;
import com.baobaotao.dao.TopicDao;
import com.baobaotao.dao.UserDao;
import com.baobaotao.domain.LoginLog;
import com.baobaotao.domain.User;
@Service
public class ForumService{
	//required Ĭ��ֵΪtrue  ��ʾһ��Ҫ�ҵ�ƥ���bean ����ᱨ��
	//					false  �෴����һ��Ҫ�ҵ����bean
	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private TopicDao topicDao;
	
	@Autowired
	private PostDao postDao;
	
	@Autowired
	private UserDao userDao;
	
	
}
