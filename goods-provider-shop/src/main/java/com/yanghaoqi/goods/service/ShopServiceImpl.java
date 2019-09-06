package com.yanghaoqi.goods.service;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.yanghaoqi.goods.dao.ShopMapper;
import com.yanghaoqi.goods.entity.Shop;

@Service(interfaceClass=ShopService.class)
public class ShopServiceImpl implements ShopService {

	@Resource
	private ShopMapper shopMapper;
	
	@Override
	public List<Shop> getShopList() {
		// TODO Auto-generated method stub
		return shopMapper.getAllShops();
	}

}
