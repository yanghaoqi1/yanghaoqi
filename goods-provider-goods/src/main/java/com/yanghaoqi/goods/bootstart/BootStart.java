package com.yanghaoqi.goods.bootstart;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @ClassName: BootStart 
 * @Description: TODO
 * @author:yhq 
 * @date: 2019��9��6�� ����8:46:56
 */
public class BootStart {

	
	public static void main(String[] args) throws IOException {
		
		System.out.println("��ʼ...");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		
		/*GoodsService gs = context.getBean(GoodsService.class);
		PageInfo<Goods> pageInfo = gs.list(1, 3);
		System.out.println("pageinfo is " + pageInfo);
		
		Goods goods = new Goods();
		goods.setAddress(AddressEnum.����);
		goods.setCategory(CategoryEnum.����);
		goods.setName("skii");
		goods.setCreateDate(new Date(102,3,23));
		gs.create(goods);
		*/
		
		
		
		System.in.read();
	}
	
}
