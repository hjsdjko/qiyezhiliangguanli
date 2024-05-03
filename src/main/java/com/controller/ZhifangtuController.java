
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
 * 输出直方图
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zhifangtu")
public class ZhifangtuController {
    private static final Logger logger = LoggerFactory.getLogger(ZhifangtuController.class);

    private static final String TABLE_NAME = "zhifangtu";

    @Autowired
    private ZhifangtuService zhifangtuService;


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
    private KongzhituchushihuaService kongzhituchushihuaService;//控制图初始化
    @Autowired
    private LailiaojianyanService lailiaojianyanService;//来料检验
    @Autowired
    private LifangtuService lifangtuService;//输出立方图
    @Autowired
    private ZhichengjianyanService zhichengjianyanService;//制成检验
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
        PageUtils page = zhifangtuService.queryPage(params);

        //字典表数据转换
        List<ZhifangtuView> list =(List<ZhifangtuView>)page.getList();
        for(ZhifangtuView c:list){
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
        ZhifangtuEntity zhifangtu = zhifangtuService.selectById(id);
        if(zhifangtu !=null){
            //entity转view
            ZhifangtuView view = new ZhifangtuView();
            BeanUtils.copyProperties( zhifangtu , view );//把实体数据重构到view中
            //级联表 工作人员
            //级联表
            GongzuorenyuanEntity gongzuorenyuan = gongzuorenyuanService.selectById(zhifangtu.getGongzuorenyuanId());
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
    public R save(@RequestBody ZhifangtuEntity zhifangtu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zhifangtu:{}",this.getClass().getName(),zhifangtu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("工作人员".equals(role))
            zhifangtu.setGongzuorenyuanId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ZhifangtuEntity> queryWrapper = new EntityWrapper<ZhifangtuEntity>()
            .eq("gongzuorenyuan_id", zhifangtu.getGongzuorenyuanId())
            .eq("zhifangtu_name", zhifangtu.getZhifangtuName())
            .eq("zhifangtu_types", zhifangtu.getZhifangtuTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhifangtuEntity zhifangtuEntity = zhifangtuService.selectOne(queryWrapper);
        if(zhifangtuEntity==null){
            zhifangtu.setInsertTime(new Date());
            zhifangtu.setCreateTime(new Date());
            zhifangtuService.insert(zhifangtu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZhifangtuEntity zhifangtu, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,zhifangtu:{}",this.getClass().getName(),zhifangtu.toString());
        ZhifangtuEntity oldZhifangtuEntity = zhifangtuService.selectById(zhifangtu.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("工作人员".equals(role))
//            zhifangtu.setGongzuorenyuanId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(zhifangtu.getZhifangtuFile()) || "null".equals(zhifangtu.getZhifangtuFile())){
                zhifangtu.setZhifangtuFile(null);
        }

            zhifangtuService.updateById(zhifangtu);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ZhifangtuEntity> oldZhifangtuList =zhifangtuService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        zhifangtuService.deleteBatchIds(Arrays.asList(ids));

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
            List<ZhifangtuEntity> zhifangtuList = new ArrayList<>();//上传的东西
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
                            ZhifangtuEntity zhifangtuEntity = new ZhifangtuEntity();
//                            zhifangtuEntity.setGongzuorenyuanId(Integer.valueOf(data.get(0)));   //工作人员 要改的
//                            zhifangtuEntity.setZhifangtuUuidNumber(data.get(0));                    //输出编号 要改的
//                            zhifangtuEntity.setZhifangtuName(data.get(0));                    //输出标题 要改的
//                            zhifangtuEntity.setZhifangtuTypes(Integer.valueOf(data.get(0)));   //直方图输出类型 要改的
//                            zhifangtuEntity.setZhifangtuFile(data.get(0));                    //输出文件 要改的
//                            zhifangtuEntity.setZhifangtuTime(sdf.parse(data.get(0)));          //输出时间 要改的
//                            zhifangtuEntity.setZhifangtuContent("");//详情和图片
//                            zhifangtuEntity.setInsertTime(date);//时间
//                            zhifangtuEntity.setCreateTime(date);//时间
                            zhifangtuList.add(zhifangtuEntity);


                            //把要查询是否重复的字段放入map中
                                //输出编号
                                if(seachFields.containsKey("zhifangtuUuidNumber")){
                                    List<String> zhifangtuUuidNumber = seachFields.get("zhifangtuUuidNumber");
                                    zhifangtuUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> zhifangtuUuidNumber = new ArrayList<>();
                                    zhifangtuUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("zhifangtuUuidNumber",zhifangtuUuidNumber);
                                }
                        }

                        //查询是否重复
                         //输出编号
                        List<ZhifangtuEntity> zhifangtuEntities_zhifangtuUuidNumber = zhifangtuService.selectList(new EntityWrapper<ZhifangtuEntity>().in("zhifangtu_uuid_number", seachFields.get("zhifangtuUuidNumber")));
                        if(zhifangtuEntities_zhifangtuUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ZhifangtuEntity s:zhifangtuEntities_zhifangtuUuidNumber){
                                repeatFields.add(s.getZhifangtuUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [输出编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        zhifangtuService.insertBatch(zhifangtuList);
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

