package com.dao;

import com.entity.ChuhuojianyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuhuojianyanView;

/**
 * 出货检验 Dao 接口
 *
 * @author 
 */
public interface ChuhuojianyanDao extends BaseMapper<ChuhuojianyanEntity> {

   List<ChuhuojianyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
