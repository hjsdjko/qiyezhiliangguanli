package com.entity.model;

import com.entity.KongzhituchushihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 控制图初始化
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KongzhituchushihuaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 工作人员
     */
    private Integer gongzuorenyuanId;


    /**
     * 初始化编号
     */
    private String kongzhituchushihuaUuidNumber;


    /**
     * 初始化标题
     */
    private String kongzhituchushihuaName;


    /**
     * 控制图初始化类型
     */
    private Integer kongzhituchushihuaTypes;


    /**
     * 初始化前文件
     */
    private String kongzhituchushihuaQianFile;


    /**
     * 初始化后文件
     */
    private String kongzhituchushihuaHouFile;


    /**
     * 初始化时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date kongzhituchushihuaTime;


    /**
     * 初始化内容
     */
    private String kongzhituchushihuaContent;


    /**
     * 备注
     */
    private String kongzhituchushihuaBeizhuContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：工作人员
	 */
    public Integer getGongzuorenyuanId() {
        return gongzuorenyuanId;
    }


    /**
	 * 设置：工作人员
	 */
    public void setGongzuorenyuanId(Integer gongzuorenyuanId) {
        this.gongzuorenyuanId = gongzuorenyuanId;
    }
    /**
	 * 获取：初始化编号
	 */
    public String getKongzhituchushihuaUuidNumber() {
        return kongzhituchushihuaUuidNumber;
    }


    /**
	 * 设置：初始化编号
	 */
    public void setKongzhituchushihuaUuidNumber(String kongzhituchushihuaUuidNumber) {
        this.kongzhituchushihuaUuidNumber = kongzhituchushihuaUuidNumber;
    }
    /**
	 * 获取：初始化标题
	 */
    public String getKongzhituchushihuaName() {
        return kongzhituchushihuaName;
    }


    /**
	 * 设置：初始化标题
	 */
    public void setKongzhituchushihuaName(String kongzhituchushihuaName) {
        this.kongzhituchushihuaName = kongzhituchushihuaName;
    }
    /**
	 * 获取：控制图初始化类型
	 */
    public Integer getKongzhituchushihuaTypes() {
        return kongzhituchushihuaTypes;
    }


    /**
	 * 设置：控制图初始化类型
	 */
    public void setKongzhituchushihuaTypes(Integer kongzhituchushihuaTypes) {
        this.kongzhituchushihuaTypes = kongzhituchushihuaTypes;
    }
    /**
	 * 获取：初始化前文件
	 */
    public String getKongzhituchushihuaQianFile() {
        return kongzhituchushihuaQianFile;
    }


    /**
	 * 设置：初始化前文件
	 */
    public void setKongzhituchushihuaQianFile(String kongzhituchushihuaQianFile) {
        this.kongzhituchushihuaQianFile = kongzhituchushihuaQianFile;
    }
    /**
	 * 获取：初始化后文件
	 */
    public String getKongzhituchushihuaHouFile() {
        return kongzhituchushihuaHouFile;
    }


    /**
	 * 设置：初始化后文件
	 */
    public void setKongzhituchushihuaHouFile(String kongzhituchushihuaHouFile) {
        this.kongzhituchushihuaHouFile = kongzhituchushihuaHouFile;
    }
    /**
	 * 获取：初始化时间
	 */
    public Date getKongzhituchushihuaTime() {
        return kongzhituchushihuaTime;
    }


    /**
	 * 设置：初始化时间
	 */
    public void setKongzhituchushihuaTime(Date kongzhituchushihuaTime) {
        this.kongzhituchushihuaTime = kongzhituchushihuaTime;
    }
    /**
	 * 获取：初始化内容
	 */
    public String getKongzhituchushihuaContent() {
        return kongzhituchushihuaContent;
    }


    /**
	 * 设置：初始化内容
	 */
    public void setKongzhituchushihuaContent(String kongzhituchushihuaContent) {
        this.kongzhituchushihuaContent = kongzhituchushihuaContent;
    }
    /**
	 * 获取：备注
	 */
    public String getKongzhituchushihuaBeizhuContent() {
        return kongzhituchushihuaBeizhuContent;
    }


    /**
	 * 设置：备注
	 */
    public void setKongzhituchushihuaBeizhuContent(String kongzhituchushihuaBeizhuContent) {
        this.kongzhituchushihuaBeizhuContent = kongzhituchushihuaBeizhuContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
