
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
 * 成品检验
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/chengpinjianyan")
public class ChengpinjianyanController {
    private static final Logger logger = LoggerFactory.getLogger(ChengpinjianyanController.class);

    private static final String TABLE_NAME = "chengpinjianyan";

    @Autowired
    private ChengpinjianyanService chengpinjianyanService;


    @Autowired
    private TokenService tokenService;

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
        PageUtils page = chengpinjianyanService.queryPage(params);

        //字典表数据转换
        List<ChengpinjianyanView> list =(List<ChengpinjianyanView>)page.getList();
        for(ChengpinjianyanView c:list){
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
        ChengpinjianyanEntity chengpinjianyan = chengpinjianyanService.selectById(id);
        if(chengpinjianyan !=null){
            //entity转view
            ChengpinjianyanView view = new ChengpinjianyanView();
            BeanUtils.copyProperties( chengpinjianyan , view );//把实体数据重构到view中
            //级联表 工作人员
            //级联表
            GongzuorenyuanEntity gongzuorenyuan = gongzuorenyuanService.selectById(chengpinjianyan.getGongzuorenyuanId());
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
    public R save(@RequestBody ChengpinjianyanEntity chengpinjianyan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,chengpinjianyan:{}",this.getClass().getName(),chengpinjianyan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("工作人员".equals(role))
            chengpinjianyan.setGongzuorenyuanId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ChengpinjianyanEntity> queryWrapper = new EntityWrapper<ChengpinjianyanEntity>()
            .eq("gongzuorenyuan_id", chengpinjianyan.getGongzuorenyuanId())
            .eq("chengpinjianyan_name", chengpinjianyan.getChengpinjianyanName())
            .eq("jianyanzhongxin_types", chengpinjianyan.getJianyanzhongxinTypes())
            .eq("jianyanyiqi_types", chengpinjianyan.getJianyanyiqiTypes())
            .eq("jianyanxiangmu_types", chengpinjianyan.getJianyanxiangmuTypes())
            .eq("chengpinjianyan_types", chengpinjianyan.getChengpinjianyanTypes())
            .eq("zhiliangdengji_types", chengpinjianyan.getZhiliangdengjiTypes())
            .eq("quexiandengji_types", chengpinjianyan.getQuexiandengjiTypes())
            .eq("quexianyuanyin_types", chengpinjianyan.getQuexianyuanyinTypes())
            .eq("jieguo_types", chengpinjianyan.getJieguoTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChengpinjianyanEntity chengpinjianyanEntity = chengpinjianyanService.selectOne(queryWrapper);
        if(chengpinjianyanEntity==null){
            chengpinjianyan.setInsertTime(new Date());
            chengpinjianyan.setCreateTime(new Date());
            chengpinjianyanService.insert(chengpinjianyan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ChengpinjianyanEntity chengpinjianyan, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,chengpinjianyan:{}",this.getClass().getName(),chengpinjianyan.toString());
        ChengpinjianyanEntity oldChengpinjianyanEntity = chengpinjianyanService.selectById(chengpinjianyan.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("工作人员".equals(role))
//            chengpinjianyan.setGongzuorenyuanId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(chengpinjianyan.getChengpinjianyanFile()) || "null".equals(chengpinjianyan.getChengpinjianyanFile())){
                chengpinjianyan.setChengpinjianyanFile(null);
        }

            chengpinjianyanService.updateById(chengpinjianyan);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ChengpinjianyanEntity> oldChengpinjianyanList =chengpinjianyanService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        chengpinjianyanService.deleteBatchIds(Arrays.asList(ids));

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
            List<ChengpinjianyanEntity> chengpinjianyanList = new ArrayList<>();//上传的东西
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
                            ChengpinjianyanEntity chengpinjianyanEntity = new ChengpinjianyanEntity();
//                            chengpinjianyanEntity.setGongzuorenyuanId(Integer.valueOf(data.get(0)));   //工作人员 要改的
//                            chengpinjianyanEntity.setChengpinjianyanUuidNumber(data.get(0));                    //检验编号 要改的
//                            chengpinjianyanEntity.setChengpinjianyanName(data.get(0));                    //检验标题 要改的
//                            chengpinjianyanEntity.setJianyanzhongxinTypes(Integer.valueOf(data.get(0)));   //检验中心 要改的
//                            chengpinjianyanEntity.setJianyanyiqiTypes(Integer.valueOf(data.get(0)));   //检验仪器 要改的
//                            chengpinjianyanEntity.setJianyanxiangmuTypes(Integer.valueOf(data.get(0)));   //检验项目 要改的
//                            chengpinjianyanEntity.setChengpinjianyanTypes(Integer.valueOf(data.get(0)));   //成品检验类型 要改的
//                            chengpinjianyanEntity.setChengpinjianyanFile(data.get(0));                    //检验文件 要改的
//                            chengpinjianyanEntity.setChengpinjianyanTime(sdf.parse(data.get(0)));          //检验时间 要改的
//                            chengpinjianyanEntity.setZhiliangdengjiTypes(Integer.valueOf(data.get(0)));   //质量等级 要改的
//                            chengpinjianyanEntity.setQuexiandengjiTypes(Integer.valueOf(data.get(0)));   //缺陷等级 要改的
//                            chengpinjianyanEntity.setQuexianyuanyinTypes(Integer.valueOf(data.get(0)));   //缺陷原因类型 要改的
//                            chengpinjianyanEntity.setJieguoTypes(Integer.valueOf(data.get(0)));   //检测结果 要改的
//                            chengpinjianyanEntity.setChengpinjianyanContent("");//详情和图片
//                            chengpinjianyanEntity.setChengpinjianyanBeizhuContent("");//详情和图片
//                            chengpinjianyanEntity.setInsertTime(date);//时间
//                            chengpinjianyanEntity.setCreateTime(date);//时间
                            chengpinjianyanList.add(chengpinjianyanEntity);


                            //把要查询是否重复的字段放入map中
                                //检验编号
                                if(seachFields.containsKey("chengpinjianyanUuidNumber")){
                                    List<String> chengpinjianyanUuidNumber = seachFields.get("chengpinjianyanUuidNumber");
                                    chengpinjianyanUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> chengpinjianyanUuidNumber = new ArrayList<>();
                                    chengpinjianyanUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("chengpinjianyanUuidNumber",chengpinjianyanUuidNumber);
                                }
                        }

                        //查询是否重复
                         //检验编号
                        List<ChengpinjianyanEntity> chengpinjianyanEntities_chengpinjianyanUuidNumber = chengpinjianyanService.selectList(new EntityWrapper<ChengpinjianyanEntity>().in("chengpinjianyan_uuid_number", seachFields.get("chengpinjianyanUuidNumber")));
                        if(chengpinjianyanEntities_chengpinjianyanUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ChengpinjianyanEntity s:chengpinjianyanEntities_chengpinjianyanUuidNumber){
                                repeatFields.add(s.getChengpinjianyanUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [检验编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        chengpinjianyanService.insertBatch(chengpinjianyanList);
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

