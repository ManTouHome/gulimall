package com.mantou.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mantou.common.utils.PageUtils;
import com.mantou.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author mantou
 * @email 15027896686@163.com
 * @date 2022-02-23 14:53:36
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

