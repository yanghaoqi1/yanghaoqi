package com.yanghaoqi.goods.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.yanghaoqi.goods.entity.Goods;


/**
 * 
 * @ClassName: GoodsMapper 
 * @Description: TODO
 * @author:yhq 
 * @date: 2019��9��6�� ����8:47:03
 */
@Mapper
public interface GoodsMapper {

	int create(Goods goods);
	//�����м��
	int createGoodsShop(@Param("goodsId") Integer goodsId,@Param("shopIds") Integer[] shopIds);
	
	@Delete("delete from tb_goods where id=#{value}")
	int deleteById(Integer id);
	
	@Delete("delete from tb_goods_shop where goodsId=#{value}")
	int deleteGoodsShop(Integer id);
	
	// ����ɾ��
	int deleteBatch(Integer[] ids);
	// ɾ���м��
	int deleteBatchGoodsShop(Integer[] ids);
	
	int update(Goods goods);
	
	
	Goods findById(Integer id);
	
	List<Goods> list();
}
