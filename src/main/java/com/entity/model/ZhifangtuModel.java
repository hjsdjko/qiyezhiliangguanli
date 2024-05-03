package com.entity.model;

import com.entity.ZhifangtuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 输出直方图
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhifangtuModel implements Serializable {
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
     * 输出编号
     */
    private String zhifangtuUuidNumber;


    /**
     * 输出标题
     */
    private String zhifangtuName;


    /**
     * 直方图输出类型
     */
    private Integer zhifangtuTypes;


    /**
     * 输出文件
     */
    private String zhifangtuFile;


    /**
     * 输出时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zhifangtuTime;


    /**
     * 输出备注
     */
    private String zhifangtuContent;


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
	 * 获取：输出编号
	 */
    public String getZhifangtuUuidNumber() {
        return zhifangtuUuidNumber;
    }


    /**
	 * 设置：输出编号
	 */
    public void setZhifangtuUuidNumber(String zhifangtuUuidNumber) {
        this.zhifangtuUuidNumber = zhifangtuUuidNumber;
    }
    /**
	 * 获取：输出标题
	 */
    public String getZhifangtuName() {
        return zhifangtuName;
    }


    /**
	 * 设置：输出标题
	 */
    public void setZhifangtuName(String zhifangtuName) {
        this.zhifangtuName = zhifangtuName;
    }
    /**
	 * 获取：直方图输出类型
	 */
    public Integer getZhifangtuTypes() {
        return zhifangtuTypes;
    }


    /**
	 * 设置：直方图输出类型
	 */
    public void setZhifangtuTypes(Integer zhifangtuTypes) {
        this.zhifangtuTypes = zhifangtuTypes;
    }
    /**
	 * 获取：输出文件
	 */
    public String getZhifangtuFile() {
        return zhifangtuFile;
    }


    /**
	 * 设置：输出文件
	 */
    public void setZhifangtuFile(String zhifangtuFile) {
        this.zhifangtuFile = zhifangtuFile;
    }
    /**
	 * 获取：输出时间
	 */
    public Date getZhifangtuTime() {
        return zhifangtuTime;
    }


    /**
	 * 设置：输出时间
	 */
    public void setZhifangtuTime(Date zhifangtuTime) {
        this.zhifangtuTime = zhifangtuTime;
    }
    /**
	 * 获取：输出备注
	 */
    public String getZhifangtuContent() {
        return zhifangtuContent;
    }


    /**
	 * 设置：输出备注
	 */
    public void setZhifangtuContent(String zhifangtuContent) {
        this.zhifangtuContent = zhifangtuContent;
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
