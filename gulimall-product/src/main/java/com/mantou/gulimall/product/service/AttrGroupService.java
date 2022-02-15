package com.mantou.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mantou.common.utils.PageUtils;
import com.mantou.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 
 *
 * @author mantou
 * @email 15027896686@163.com
 * @date 2022-02-15 16:42:35
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

