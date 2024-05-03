package com.entity.model;

import com.entity.LifangtuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 输出立方图
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LifangtuModel implements Serializable {
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
    private String lifangtuUuidNumber;


    /**
     * 输出标题
     */
    private String lifangtuName;


    /**
     * 立方图输出类型
     */
    private Integer lifangtuTypes;


    /**
     * 输出文件
     */
    private String lifangtuFile;


    /**
     * 输出时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date lifangtuTime;


    /**
     * 输出备注
     */
    private String lifangtuContent;


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
    public String getLifangtuUuidNumber() {
        return lifangtuUuidNumber;
    }


    /**
	 * 设置：输出编号
	 */
    public void setLifangtuUuidNumber(String lifangtuUuidNumber) {
        this.lifangtuUuidNumber = lifangtuUuidNumber;
    }
    /**
	 * 获取：输出标题
	 */
    public String getLifangtuName() {
        return lifangtuName;
    }


    /**
	 * 设置：输出标题
	 */
    public void setLifangtuName(String lifangtuName) {
        this.lifangtuName = lifangtuName;
    }
    /**
	 * 获取：立方图输出类型
	 */
    public Integer getLifangtuTypes() {
        return lifangtuTypes;
    }


    /**
	 * 设置：立方图输出类型
	 */
    public void setLifangtuTypes(Integer lifangtuTypes) {
        this.lifangtuTypes = lifangtuTypes;
    }
    /**
	 * 获取：输出文件
	 */
    public String getLifangtuFile() {
        return lifangtuFile;
    }


    /**
	 * 设置：输出文件
	 */
    public void setLifangtuFile(String lifangtuFile) {
        this.lifangtuFile = lifangtuFile;
    }
    /**
	 * 获取：输出时间
	 */
    public Date getLifangtuTime() {
        return lifangtuTime;
    }


    /**
	 * 设置：输出时间
	 */
    public void setLifangtuTime(Date lifangtuTime) {
        this.lifangtuTime = lifangtuTime;
    }
    /**
	 * 获取：输出备注
	 */
    public String getLifangtuContent() {
        return lifangtuContent;
    }


    /**
	 * 设置：输出备注
	 */
    public void setLifangtuContent(String lifangtuContent) {
        this.lifangtuContent = lifangtuContent;
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
