package com.yanghaoqi.goods.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * 
 * @ClassName: Goods 
 * @Description: TODO
 * @author:yhq 
 * @date: 2019��9��5�� ����4:17:36
 */
public class Goods implements Serializable {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
	
	private	CategoryEnum category; // varchar
	
	private AddressEnum address;// int
	
	private Date createDate;
	
	private String shopIds;
	
	private String shopNames;
	
	//�����Ʒ��ʱ��  ѡ����̼�ID
	private Integer shopIdArr[];

	public Goods(Integer id, String name, CategoryEnum category, AddressEnum address, Date createDate, String shopIds,
			String shopNames, Integer[] shopIdArr) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.address = address;
		this.createDate = createDate;
		this.shopIds = shopIds;
		this.shopNames = shopNames;
		this.shopIdArr = shopIdArr;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CategoryEnum getCategory() {
		return category;
	}

	public void setCategory(CategoryEnum category) {
		this.category = category;
	}

	public AddressEnum getAddress() {
		return address;
	}

	public void setAddress(AddressEnum address) {
		this.address = address;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getShopIds() {
		return shopIds;
	}

	public void setShopIds(String shopIds) {
		this.shopIds = shopIds;
	}

	public String getShopNames() {
		return shopNames;
	}

	public void setShopNames(String shopNames) {
		this.shopNames = shopNames;
	}

	public Integer[] getShopIdArr() {
		return shopIdArr;
	}

	public void setShopIdArr(Integer[] shopIdArr) {
		this.shopIdArr = shopIdArr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(shopIdArr);
		result = prime * result + ((shopIds == null) ? 0 : shopIds.hashCode());
		result = prime * result + ((shopNames == null) ? 0 : shopNames.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (address != other.address)
			return false;
		if (category != other.category)
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(shopIdArr, other.shopIdArr))
			return false;
		if (shopIds == null) {
			if (other.shopIds != null)
				return false;
		} else if (!shopIds.equals(other.shopIds))
			return false;
		if (shopNames == null) {
			if (other.shopNames != null)
				return false;
		} else if (!shopNames.equals(other.shopNames))
			return false;
		return true;
	}

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", category=" + category + ", address=" + address
				+ ", createDate=" + createDate + ", shopIds=" + shopIds + ", shopNames=" + shopNames + ", shopIdArr="
				+ Arrays.toString(shopIdArr) + "]";
	}
}
