package com.yanghaoqi.goods.service;

import com.github.pagehelper.PageInfo;
import com.yanghaoqi.goods.entity.Goods;

/**
 * 
 * @ClassName: GoodsService 
 * @Description: TODO
 * @author:yhq 
 * @date: 2019年9月6日 上午9:12:22
 */
public interface GoodsService {

	int create(Goods goods);
	
	int deleteById(Integer id);
	
	int deleteBatch(Integer[] ids);
	
	int update(Goods goods);
	
	Goods findById(Integer id);
	
	PageInfo<Goods> list(int pageNum,int pageSize);
	
}
