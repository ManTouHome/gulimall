package com.mantou.gulimall.order.dao;

import com.mantou.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author mantou
 * @email 15027896686@163.com
 * @date 2022-02-23 15:47:46
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
