package com.service.impl;

import com.utils.StringUtil;
import com.service.DictionaryService;
import com.utils.ClazzDiff;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import com.dao.ZhichengjianyanDao;
import com.entity.ZhichengjianyanEntity;
import com.service.ZhichengjianyanService;
import com.entity.view.ZhichengjianyanView;

/**
 * 制成检验 服务实现类
 */
@Service("zhichengjianyanService")
@Transactional
public class ZhichengjianyanServiceImpl extends ServiceImpl<ZhichengjianyanDao, ZhichengjianyanEntity> implements ZhichengjianyanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<ZhichengjianyanView> page =new Query<ZhichengjianyanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
