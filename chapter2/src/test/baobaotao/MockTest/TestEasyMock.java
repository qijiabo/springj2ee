package test.baobaotao.MockTest;

import org.easymock.MockControl;

import com.baobaotao.domain.User;
import com.baobaotao.service.UserService;

import test.baobaotao.superTest.SuperTest;

public class TestEasyMock extends SuperTest{

	public TestEasyMock(String method) {
		super(method);
	}
	
	private UserService mockuserService;
	private MockControl userService_con;
	
	public void setUp(){
		userService_con=MockControl.createControl(UserService.class);
		mockuserService=(UserService) userService_con.getMock();
	}
	
	public void testUserServiceInEasyMock(){
		
		User tmpUser=new User();
		tmpUser.setUserName("admin");
		String admin="admin";
		//�ȵ�����Ҫmock�ķ���
		mockuserService.findUserByUserName(admin);
		//���÷���ֵ
		userService_con.setReturnValue(tmpUser);
		//��mock�л���replay״̬
		userService_con.replay();
		
		User user=mockuserService.findUserByUserName(admin);
		assertEquals(user.getUserName(),"admin");
	}
}