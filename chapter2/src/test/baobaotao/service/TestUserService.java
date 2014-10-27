package test.baobaotao.service;

import java.util.Date;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.baobaotao.domain.User;
import com.baobaotao.service.UserService;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//����junit��spring���Կ��
@ContextConfiguration(locations={"/applicationContext.xml"})//����Spring����
public class TestUserService extends TestCase {
	@Autowired
	private UserService userService;
	
	public TestUserService(String name){
		super(name);
	}
	
	@Test
	public void hasMatchUser(){
		boolean b1=userService.hasMatchUser("admin", "123456");
		boolean b2=userService.hasMatchUser("admin", "1111");
		assertTrue(b1);
		//assertTrue(b2);
	}
	
	@Test
	public void findUserByUserName(){
		User user=userService.findUserByUserName("admin");
		assertEquals(user.getUserName(), "admin");
	}
	
	@Test 
	public void loginSuccess(){
		User user=userService.findUserByUserName("admin");
		user.setLastVisit(new Date());
		user.setLastIp("11.11.11.11");
		userService.loginSuccess(user);
	}
	
}
