package com.mantou.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mantou.common.utils.PageUtils;
import com.mantou.common.utils.Query;

import com.mantou.gulimall.product.dao.CategoryDao;
import com.mantou.gulimall.product.entity.CategoryEntity;
import com.mantou.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1.查出所有的分类信息
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //2.组装成父子的属性结构
        //2.1找到所有的一级分类
        List<CategoryEntity> MenusOnes = categoryEntities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map((menu) -> {
                menu.setChildren(getChildrens(menu,categoryEntities));
                return menu ;
        }).sorted((menu1,menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort()) ;
        }).collect(Collectors.toList());
        return MenusOnes;
    }

    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all) {
        List<CategoryEntity> childrens = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId() ;
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildrens(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu1,menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort()) ;
        }).collect(Collectors.toList());
        return childrens;
    }

}