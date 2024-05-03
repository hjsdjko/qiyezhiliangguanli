
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
 * 控制图初始化
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/kongzhituchushihua")
public class KongzhituchushihuaController {
    private static final Logger logger = LoggerFactory.getLogger(KongzhituchushihuaController.class);

    private static final String TABLE_NAME = "kongzhituchushihua";

    @Autowired
    private KongzhituchushihuaService kongzhituchushihuaService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private ChengpinjianyanService chengpinjianyanService;//成品检验
    @Autowired
    private ChouyangbiaozhunService chouyangbiaozhunService;//抽样标准
    @Autowired
    private ChuhuojianyanService chuhuojianyanService;//出货检验
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private GongzuorenyuanService gongzuorenyuanService;//工作人员
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
        PageUtils page = kongzhituchushihuaService.queryPage(params);

        //字典表数据转换
        List<KongzhituchushihuaView> list =(List<KongzhituchushihuaView>)page.getList();
        for(KongzhituchushihuaView c:list){
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
        KongzhituchushihuaEntity kongzhituchushihua = kongzhituchushihuaService.selectById(id);
        if(kongzhituchushihua !=null){
            //entity转view
            KongzhituchushihuaView view = new KongzhituchushihuaView();
            BeanUtils.copyProperties( kongzhituchushihua , view );//把实体数据重构到view中
            //级联表 工作人员
            //级联表
            GongzuorenyuanEntity gongzuorenyuan = gongzuorenyuanService.selectById(kongzhituchushihua.getGongzuorenyuanId());
            if(gongzuorenyuan != null){
            BeanUtils.copyProperties( gongzuorenyuan , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "gongzuorenyuanId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setGongzuorenyuanId(gongzuorenyuan.getId());
            }
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
    public R save(@RequestBody KongzhituchushihuaEntity kongzhituchushihua, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,kongzhituchushihua:{}",this.getClass().getName(),kongzhituchushihua.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("工作人员".equals(role))
            kongzhituchushihua.setGongzuorenyuanId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<KongzhituchushihuaEntity> queryWrapper = new EntityWrapper<KongzhituchushihuaEntity>()
            .eq("gongzuorenyuan_id", kongzhituchushihua.getGongzuorenyuanId())
            .eq("kongzhituchushihua_name", kongzhituchushihua.getKongzhituchushihuaName())
            .eq("kongzhituchushihua_types", kongzhituchushihua.getKongzhituchushihuaTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        KongzhituchushihuaEntity kongzhituchushihuaEntity = kongzhituchushihuaService.selectOne(queryWrapper);
        if(kongzhituchushihuaEntity==null){
            kongzhituchushihua.setInsertTime(new Date());
            kongzhituchushihua.setCreateTime(new Date());
            kongzhituchushihuaService.insert(kongzhituchushihua);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody KongzhituchushihuaEntity kongzhituchushihua, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,kongzhituchushihua:{}",this.getClass().getName(),kongzhituchushihua.toString());
        KongzhituchushihuaEntity oldKongzhituchushihuaEntity = kongzhituchushihuaService.selectById(kongzhituchushihua.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("工作人员".equals(role))
//            kongzhituchushihua.setGongzuorenyuanId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(kongzhituchushihua.getKongzhituchushihuaQianFile()) || "null".equals(kongzhituchushihua.getKongzhituchushihuaQianFile())){
                kongzhituchushihua.setKongzhituchushihuaQianFile(null);
        }
        if("".equals(kongzhituchushihua.getKongzhituchushihuaHouFile()) || "null".equals(kongzhituchushihua.getKongzhituchushihuaHouFile())){
                kongzhituchushihua.setKongzhituchushihuaHouFile(null);
        }

            kongzhituchushihuaService.updateById(kongzhituchushihua);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<KongzhituchushihuaEntity> oldKongzhituchushihuaList =kongzhituchushihuaService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        kongzhituchushihuaService.deleteBatchIds(Arrays.asList(ids));

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
            List<KongzhituchushihuaEntity> kongzhituchushihuaList = new ArrayList<>();//上传的东西
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
                            KongzhituchushihuaEntity kongzhituchushihuaEntity = new KongzhituchushihuaEntity();
//                            kongzhituchushihuaEntity.setGongzuorenyuanId(Integer.valueOf(data.get(0)));   //工作人员 要改的
//                            kongzhituchushihuaEntity.setKongzhituchushihuaUuidNumber(data.get(0));                    //初始化编号 要改的
//                            kongzhituchushihuaEntity.setKongzhituchushihuaName(data.get(0));                    //初始化标题 要改的
//                            kongzhituchushihuaEntity.setKongzhituchushihuaTypes(Integer.valueOf(data.get(0)));   //控制图初始化类型 要改的
//                            kongzhituchushihuaEntity.setKongzhituchushihuaQianFile(data.get(0));                    //初始化前文件 要改的
//                            kongzhituchushihuaEntity.setKongzhituchushihuaHouFile(data.get(0));                    //初始化后文件 要改的
//                            kongzhituchushihuaEntity.setKongzhituchushihuaTime(sdf.parse(data.get(0)));          //初始化时间 要改的
//                            kongzhituchushihuaEntity.setKongzhituchushihuaContent("");//详情和图片
//                            kongzhituchushihuaEntity.setKongzhituchushihuaBeizhuContent("");//详情和图片
//                            kongzhituchushihuaEntity.setInsertTime(date);//时间
//                            kongzhituchushihuaEntity.setCreateTime(date);//时间
                            kongzhituchushihuaList.add(kongzhituchushihuaEntity);


                            //把要查询是否重复的字段放入map中
                                //初始化编号
                                if(seachFields.containsKey("kongzhituchushihuaUuidNumber")){
                                    List<String> kongzhituchushihuaUuidNumber = seachFields.get("kongzhituchushihuaUuidNumber");
                                    kongzhituchushihuaUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> kongzhituchushihuaUuidNumber = new ArrayList<>();
                                    kongzhituchushihuaUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("kongzhituchushihuaUuidNumber",kongzhituchushihuaUuidNumber);
                                }
                        }

                        //查询是否重复
                         //初始化编号
                        List<KongzhituchushihuaEntity> kongzhituchushihuaEntities_kongzhituchushihuaUuidNumber = kongzhituchushihuaService.selectList(new EntityWrapper<KongzhituchushihuaEntity>().in("kongzhituchushihua_uuid_number", seachFields.get("kongzhituchushihuaUuidNumber")));
                        if(kongzhituchushihuaEntities_kongzhituchushihuaUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(KongzhituchushihuaEntity s:kongzhituchushihuaEntities_kongzhituchushihuaUuidNumber){
                                repeatFields.add(s.getKongzhituchushihuaUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [初始化编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        kongzhituchushihuaService.insertBatch(kongzhituchushihuaList);
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

