package com.baobaotao.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectTest {
	public static Car initByDefaultConst() throws Exception{
		//ͨ����װ���� ��ȡCar�����
		ClassLoader loader=Thread.currentThread().getContextClassLoader();
		Class clazz=loader.loadClass("com.baobaotao.reflect.Car");
		
		//��ȡ���Ĭ�Ϲ����� ��ʵ����
		Constructor con=
			clazz.getDeclaredConstructor((Class[])null);
		Car car=(Car) con.newInstance();
		
		//ͨ�����䷽����������
		Method setBrand=clazz.getMethod("setBrand", String.class);
		setBrand.invoke(car, "����");
		Method setColor=clazz.getMethod("setColor", String.class);
		setColor.invoke(car, "��ɫ");
		Method setMaxSpeed=clazz.getMethod("setMaxSpeed", int.class);
		setMaxSpeed.invoke(car, 200);
		return car;
	}
	
	public static void main(String[] args) throws Exception{
		Car car=initByDefaultConst();
		car.introduce();
	}
}
