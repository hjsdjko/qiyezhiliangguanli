package com.entity.model;

import com.entity.ChouyangbiaozhunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 抽样标准
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChouyangbiaozhunModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标准编号
     */
    private String chouyangbiaozhunUuidNumber;


    /**
     * 标准标题
     */
    private String chouyangbiaozhunName;


    /**
     * 检验项目
     */
    private Integer jianyanxiangmuTypes;


    /**
     * 抽样标准类型
     */
    private Integer chouyangbiaozhunTypes;


    /**
     * 依据标准
     */
    private String chouyangbiaozhunFile;


    /**
     * 合格标准
     */
    private String chouyangbiaozhunContent;


    /**
     * 备注
     */
    private String chouyangbiaozhunBeizhuContent;


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
	 * 获取：标准编号
	 */
    public String getChouyangbiaozhunUuidNumber() {
        return chouyangbiaozhunUuidNumber;
    }


    /**
	 * 设置：标准编号
	 */
    public void setChouyangbiaozhunUuidNumber(String chouyangbiaozhunUuidNumber) {
        this.chouyangbiaozhunUuidNumber = chouyangbiaozhunUuidNumber;
    }
    /**
	 * 获取：标准标题
	 */
    public String getChouyangbiaozhunName() {
        return chouyangbiaozhunName;
    }


    /**
	 * 设置：标准标题
	 */
    public void setChouyangbiaozhunName(String chouyangbiaozhunName) {
        this.chouyangbiaozhunName = chouyangbiaozhunName;
    }
    /**
	 * 获取：检验项目
	 */
    public Integer getJianyanxiangmuTypes() {
        return jianyanxiangmuTypes;
    }


    /**
	 * 设置：检验项目
	 */
    public void setJianyanxiangmuTypes(Integer jianyanxiangmuTypes) {
        this.jianyanxiangmuTypes = jianyanxiangmuTypes;
    }
    /**
	 * 获取：抽样标准类型
	 */
    public Integer getChouyangbiaozhunTypes() {
        return chouyangbiaozhunTypes;
    }


    /**
	 * 设置：抽样标准类型
	 */
    public void setChouyangbiaozhunTypes(Integer chouyangbiaozhunTypes) {
        this.chouyangbiaozhunTypes = chouyangbiaozhunTypes;
    }
    /**
	 * 获取：依据标准
	 */
    public String getChouyangbiaozhunFile() {
        return chouyangbiaozhunFile;
    }


    /**
	 * 设置：依据标准
	 */
    public void setChouyangbiaozhunFile(String chouyangbiaozhunFile) {
        this.chouyangbiaozhunFile = chouyangbiaozhunFile;
    }
    /**
	 * 获取：合格标准
	 */
    public String getChouyangbiaozhunContent() {
        return chouyangbiaozhunContent;
    }


    /**
	 * 设置：合格标准
	 */
    public void setChouyangbiaozhunContent(String chouyangbiaozhunContent) {
        this.chouyangbiaozhunContent = chouyangbiaozhunContent;
    }
    /**
	 * 获取：备注
	 */
    public String getChouyangbiaozhunBeizhuContent() {
        return chouyangbiaozhunBeizhuContent;
    }


    /**
	 * 设置：备注
	 */
    public void setChouyangbiaozhunBeizhuContent(String chouyangbiaozhunBeizhuContent) {
        this.chouyangbiaozhunBeizhuContent = chouyangbiaozhunBeizhuContent;
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
