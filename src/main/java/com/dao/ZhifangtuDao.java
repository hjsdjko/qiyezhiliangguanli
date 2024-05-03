package com.dao;

import com.entity.ZhifangtuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhifangtuView;

/**
 * 输出直方图 Dao 接口
 *
 * @author 
 */
public interface ZhifangtuDao extends BaseMapper<ZhifangtuEntity> {

   List<ZhifangtuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
