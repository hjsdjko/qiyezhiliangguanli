
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 抽样标准
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/chouyangbiaozhun")
public class ChouyangbiaozhunController {
    private static final Logger logger = LoggerFactory.getLogger(ChouyangbiaozhunController.class);

    private static final String TABLE_NAME = "chouyangbiaozhun";

    @Autowired
    private ChouyangbiaozhunService chouyangbiaozhunService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private ChengpinjianyanService chengpinjianyanService;//成品检验
    @Autowired
    private ChuhuojianyanService chuhuojianyanService;//出货检验
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private GongzuorenyuanService gongzuorenyuanService;//工作人员
    @Autowired
    private KongzhituchushihuaService kongzhituchushihuaService;//控制图初始化
    @Autowired
    private LailiaojianyanService lailiaojianyanService;//来料检验
    @Autowired
    private LifangtuService lifangtuService;//输出立方图
    @Autowired
    private ZhichengjianyanService zhichengjianyanService;//制成检验
    @Autowired
    private ZhifangtuService zhifangtuService;//输出直方图
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("工作人员".equals(role))
            params.put("gongzuorenyuanId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = chouyangbiaozhunService.queryPage(params);

        //字典表数据转换
        List<ChouyangbiaozhunView> list =(List<ChouyangbiaozhunView>)page.getList();
        for(ChouyangbiaozhunView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChouyangbiaozhunEntity chouyangbiaozhun = chouyangbiaozhunService.selectById(id);
        if(chouyangbiaozhun !=null){
            //entity转view
            ChouyangbiaozhunView view = new ChouyangbiaozhunView();
            BeanUtils.copyProperties( chouyangbiaozhun , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ChouyangbiaozhunEntity chouyangbiaozhun, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,chouyangbiaozhun:{}",this.getClass().getName(),chouyangbiaozhun.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ChouyangbiaozhunEntity> queryWrapper = new EntityWrapper<ChouyangbiaozhunEntity>()
            .eq("chouyangbiaozhun_name", chouyangbiaozhun.getChouyangbiaozhunName())
            .eq("jianyanxiangmu_types", chouyangbiaozhun.getJianyanxiangmuTypes())
            .eq("chouyangbiaozhun_types", chouyangbiaozhun.getChouyangbiaozhunTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChouyangbiaozhunEntity chouyangbiaozhunEntity = chouyangbiaozhunService.selectOne(queryWrapper);
        if(chouyangbiaozhunEntity==null){
            chouyangbiaozhun.setInsertTime(new Date());
            chouyangbiaozhun.setCreateTime(new Date());
            chouyangbiaozhunService.insert(chouyangbiaozhun);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ChouyangbiaozhunEntity chouyangbiaozhun, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,chouyangbiaozhun:{}",this.getClass().getName(),chouyangbiaozhun.toString());
        ChouyangbiaozhunEntity oldChouyangbiaozhunEntity = chouyangbiaozhunService.selectById(chouyangbiaozhun.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(chouyangbiaozhun.getChouyangbiaozhunFile()) || "null".equals(chouyangbiaozhun.getChouyangbiaozhunFile())){
                chouyangbiaozhun.setChouyangbiaozhunFile(null);
        }

            chouyangbiaozhunService.updateById(chouyangbiaozhun);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ChouyangbiaozhunEntity> oldChouyangbiaozhunList =chouyangbiaozhunService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        chouyangbiaozhunService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer gongzuorenyuanId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<ChouyangbiaozhunEntity> chouyangbiaozhunList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ChouyangbiaozhunEntity chouyangbiaozhunEntity = new ChouyangbiaozhunEntity();
//                            chouyangbiaozhunEntity.setChouyangbiaozhunUuidNumber(data.get(0));                    //标准编号 要改的
//                            chouyangbiaozhunEntity.setChouyangbiaozhunName(data.get(0));                    //标准标题 要改的
//                            chouyangbiaozhunEntity.setJianyanxiangmuTypes(Integer.valueOf(data.get(0)));   //检验项目 要改的
//                            chouyangbiaozhunEntity.setChouyangbiaozhunTypes(Integer.valueOf(data.get(0)));   //抽样标准类型 要改的
//                            chouyangbiaozhunEntity.setChouyangbiaozhunFile(data.get(0));                    //依据标准 要改的
//                            chouyangbiaozhunEntity.setChouyangbiaozhunContent("");//详情和图片
//                            chouyangbiaozhunEntity.setChouyangbiaozhunBeizhuContent("");//详情和图片
//                            chouyangbiaozhunEntity.setInsertTime(date);//时间
//                            chouyangbiaozhunEntity.setCreateTime(date);//时间
                            chouyangbiaozhunList.add(chouyangbiaozhunEntity);


                            //把要查询是否重复的字段放入map中
                                //标准编号
                                if(seachFields.containsKey("chouyangbiaozhunUuidNumber")){
                                    List<String> chouyangbiaozhunUuidNumber = seachFields.get("chouyangbiaozhunUuidNumber");
                                    chouyangbiaozhunUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> chouyangbiaozhunUuidNumber = new ArrayList<>();
                                    chouyangbiaozhunUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("chouyangbiaozhunUuidNumber",chouyangbiaozhunUuidNumber);
                                }
                        }

                        //查询是否重复
                         //标准编号
                        List<ChouyangbiaozhunEntity> chouyangbiaozhunEntities_chouyangbiaozhunUuidNumber = chouyangbiaozhunService.selectList(new EntityWrapper<ChouyangbiaozhunEntity>().in("chouyangbiaozhun_uuid_number", seachFields.get("chouyangbiaozhunUuidNumber")));
                        if(chouyangbiaozhunEntities_chouyangbiaozhunUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ChouyangbiaozhunEntity s:chouyangbiaozhunEntities_chouyangbiaozhunUuidNumber){
                                repeatFields.add(s.getChouyangbiaozhunUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [标准编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        chouyangbiaozhunService.insertBatch(chouyangbiaozhunList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




}

