package com.baobaotao.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baobaotao.domain.BBTError;
import com.baobaotao.domain.User;
import com.baobaotao.service.UserService;

//��ע��Ϊһ��SpringMVC�Ŀ�����
@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private BBTError error;

	//����index.html����
	@RequestMapping(value="/index.html")
	public String loginPage(){
		return "login";
	}
	
	//����index.html����
	@RequestMapping(value="/")
	public String loginPage_empty(){
		return "login";
	}
	
	//����loginCheck.html����
	@RequestMapping(value="/loginCheck.html")
	public ModelAndView loginCheck(HttpServletRequest request,LoginCommand loginCommand){
		boolean isValidUser=
			userService.hasMatchUser(loginCommand.getUserName(), loginCommand.getPassword());
		if(!isValidUser){
			error.setText("�û������������");
			return new ModelAndView("login","error",error);
		}else{
			User user=userService.findUserByUserName(loginCommand.getUserName());
			user.setLastIp(request.getRemoteAddr());
			user.setLastVisit(new Date());
			//��¼�ɹ�������־��
			userService.loginSuccess(user);
			request.getSession().setAttribute("user", user);
		}
		//����  return "main";
		return new ModelAndView("main");
	}
	
	//-------------------------------
	

	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public BBTError getError() {
		return error;
	}

	public void setError(BBTError error) {
		this.error = error;
	}
}
