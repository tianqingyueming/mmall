package com.mmall.dao;

import com.mmall.pojo.Cart;
//处理数据的接口  具体实现是通过对应的xml文件
public interface CartMapper {
    int deleteByPrimaryKey(Integer id);//根据主键删除

    int insert(Cart record);//插入一个购物车

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}