package com.baobaotao.reflect;

import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class FileSourceExample {
	public static void main(String[] args) throws Exception{
		String filePath="C:/Users/Administrator/Desktop/����Ԥ����.sql";
		//ʹ��ϵͳ�ļ�·����ʽ�����ļ�
		Resource res1=new FileSystemResource(filePath);
		
		Resource res2=new ClassPathResource("");
		
		InputStream ins1=res1.getInputStream();
		
		InputStream ins2=res2.getInputStream();
		System.out.print("res1:"+res1.getFilename());
	}
}
