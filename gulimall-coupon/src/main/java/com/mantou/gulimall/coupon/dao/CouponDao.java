package com.mantou.gulimall.coupon.dao;

import com.mantou.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author mantou
 * @email 15027896686@163.com
 * @date 2022-02-23 14:53:37
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
