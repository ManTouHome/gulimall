package com.mantou.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mantou.common.utils.PageUtils;
import com.mantou.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author mantou
 * @email 15027896686@163.com
 * @date 2022-02-23 14:53:37
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

