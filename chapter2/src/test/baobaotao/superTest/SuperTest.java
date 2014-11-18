package test.baobaotao.superTest;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.dao.LoginLogDao;
import com.baobaotao.dao.UserDao;

public class SuperTest extends TestCase{
	/**
	 * ����spring�����ļ���������ȡ����  
	 * ͨ��beanFactory����Ioc����ʱ�����ʼ������
	 * ��ʼ������ֻ�����ڵ�һ�ε���ʱ
	 */
	private BeanFactory beanFactory;
	protected  Object getEntity(String daoName) {  
		beanFactory = new ClassPathXmlApplicationContext("/applicationContext.xml");  
		return beanFactory.getBean(daoName);  
	} 
	
	/**
	 * �û�dao
	 */
	protected UserDao userDao=(UserDao) getEntity("userDao");
	
	/**
	 * ��¼ϵͳdao
	 */
	protected LoginLogDao loginLogDao=(LoginLogDao) getEntity("loginLogDao");
	
	
	/**
	 * ���췽��  ����TestFinder  �ҵ�����Ĳ�������
	 */
	public SuperTest (String method){
		super(method);
	}
	
	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public void setBeanFactory(BeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}
}
