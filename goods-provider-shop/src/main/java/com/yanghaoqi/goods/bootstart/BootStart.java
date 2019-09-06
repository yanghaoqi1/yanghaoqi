package com.yanghaoqi.goods.bootstart;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStart {

	private static Logger log = Logger.getLogger(BootStart.class);
	
	public static void main(String[] args) {
		
		log.info("商家的客服端  开始启动了....");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		log.info("商家的客服务已经启动成功...");
		
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
