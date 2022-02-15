package com.mantou.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mantou.common.utils.PageUtils;
import com.mantou.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * Ʒ
 *
 * @author mantou
 * @email 15027896686@163.com
 * @date 2022-02-15 16:42:34
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

