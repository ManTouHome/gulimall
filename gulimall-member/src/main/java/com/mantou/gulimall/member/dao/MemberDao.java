package com.mantou.gulimall.member.dao;

import com.mantou.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author mantou
 * @email 15027896686@163.com
 * @date 2022-02-23 15:35:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
