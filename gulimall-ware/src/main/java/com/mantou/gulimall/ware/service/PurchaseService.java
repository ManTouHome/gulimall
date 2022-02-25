package com.mantou.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mantou.common.utils.PageUtils;
import com.mantou.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author mantou
 * @email 15027896686@163.com
 * @date 2022-02-23 16:08:28
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

