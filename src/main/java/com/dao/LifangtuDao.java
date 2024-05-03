package com.dao;

import com.entity.LifangtuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LifangtuView;

/**
 * 输出立方图 Dao 接口
 *
 * @author 
 */
public interface LifangtuDao extends BaseMapper<LifangtuEntity> {

   List<LifangtuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
