package com.yanghaoqi.goods.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yanghaoqi.goods.entity.AddressEnum;
import com.yanghaoqi.goods.entity.CategoryEnum;
import com.yanghaoqi.goods.entity.Goods;
import com.yanghaoqi.goods.entity.Shop;
import com.yanghaoqi.goods.service.GoodsService;
import com.yanghaoqi.goods.service.ShopService;
@RequestMapping("goods")
@Controller
public class GoodsController {

	@Reference
	private ShopService shopService;
	@Reference
	private GoodsService goodsService;

	@GetMapping("add")
	public String add(HttpServletRequest request) {
		
		List<Shop> shopList = shopService.getShopList();
		
		request.setAttribute("categories", CategoryEnum.values());
		request.setAttribute("addresses", AddressEnum.values());
		
		request.setAttribute("shops", shopList);
		
		return "add";
		
	}
	
	@RequestMapping("add")
	public String add(HttpServletRequest request,Goods goods) {
		
		int create = goodsService.create(goods);
		
		request.setAttribute("create", create);
		
		return "add";
		
		
		
	}
	
}
