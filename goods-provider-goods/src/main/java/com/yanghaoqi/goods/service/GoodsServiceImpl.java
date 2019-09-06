package com.yanghaoqi.goods.service;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yanghaoqi.goods.dao.GoodsMapper;
import com.yanghaoqi.goods.entity.Goods;

/**
 * 
 * @ClassName: GoodsServiceImpl 
 * @Description: TODO
 * @author:yhq 
 * @date: 2019年9月6日 上午8:47:16
 */
@Service(interfaceClass=GoodsService.class)
@Transactional
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private GoodsMapper goodsMapper;
	
	@Override
	public int create(Goods goods) {
		// TODO Auto-generated method stub
		
		int create = goodsMapper.create(goods);
		
		create += goodsMapper.createGoodsShop(goods.getId(), goods.getShopIdArr());
		
		return create;
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return goodsMapper.deleteById(id) + goodsMapper.deleteGoodsShop(id);
	}

	@Override
	public int deleteBatch(Integer[] ids) {
		// TODO Auto-generated method stub
		return goodsMapper.deleteBatch(ids) + goodsMapper.deleteBatchGoodsShop(ids);
	}

	@Override
	public int update(Goods goods) {
		// TODO Auto-generated method stub
		
		int update = goodsMapper.update(goods);
		
		update += goodsMapper.deleteGoodsShop(goods.getId());
		
		update += goodsMapper.createGoodsShop(goods.getId(), goods.getShopIdArr());
		
		return update;
	}

	@Override
	public Goods findById(Integer id) {
		// TODO Auto-generated method stub
		return goodsMapper.findById(id);
	}

	@Override
	public PageInfo<Goods> list(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		
		PageHelper.startPage(pageNum, pageSize);
		
		return new PageInfo<Goods>(goodsMapper.list());
	}

}
