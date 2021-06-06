package com.imooc.mall.service;

/**
 * @author Bixby
 * @create 2021-05-09
 */

import com.github.pagehelper.PageInfo;
import com.imooc.mall.model.pojo.Category;
import com.imooc.mall.model.request.AddCategoryReq;
import com.imooc.mall.model.vo.CategoryVO;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * 描述：     分类目录Service
 */
public interface CategoryService {


    void add(AddCategoryReq addCategoryReq);

    void update(Category updateCategory);

    void delete(Integer id);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    @Cacheable(value = "listCategoryForCustomer")
    List<CategoryVO> listCategoryForCustomer(Integer parentId);
}
