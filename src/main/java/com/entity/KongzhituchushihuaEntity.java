package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 控制图初始化
 *
 * @author 
 * @email
 */
@TableName("kongzhituchushihua")
public class KongzhituchushihuaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KongzhituchushihuaEntity() {

	}

	public KongzhituchushihuaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 工作人员
     */
    @ColumnInfo(comment="工作人员",type="int(11)")
    @TableField(value = "gongzuorenyuan_id")

    private Integer gongzuorenyuanId;


    /**
     * 初始化编号
     */
    @ColumnInfo(comment="初始化编号",type="varchar(200)")
    @TableField(value = "kongzhituchushihua_uuid_number")

    private String kongzhituchushihuaUuidNumber;


    /**
     * 初始化标题
     */
    @ColumnInfo(comment="初始化标题",type="varchar(200)")
    @TableField(value = "kongzhituchushihua_name")

    private String kongzhituchushihuaName;


    /**
     * 控制图初始化类型
     */
    @ColumnInfo(comment="控制图初始化类型",type="int(11)")
    @TableField(value = "kongzhituchushihua_types")

    private Integer kongzhituchushihuaTypes;


    /**
     * 初始化前文件
     */
    @ColumnInfo(comment="初始化前文件",type="varchar(200)")
    @TableField(value = "kongzhituchushihua_qian_file")

    private String kongzhituchushihuaQianFile;


    /**
     * 初始化后文件
     */
    @ColumnInfo(comment="初始化后文件",type="varchar(200)")
    @TableField(value = "kongzhituchushihua_hou_file")

    private String kongzhituchushihuaHouFile;


    /**
     * 初始化时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="初始化时间",type="timestamp")
    @TableField(value = "kongzhituchushihua_time")

    private Date kongzhituchushihuaTime;


    /**
     * 初始化内容
     */
    @ColumnInfo(comment="初始化内容",type="longtext")
    @TableField(value = "kongzhituchushihua_content")

    private String kongzhituchushihuaContent;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="longtext")
    @TableField(value = "kongzhituchushihua_beizhu_content")

    private String kongzhituchushihuaBeizhuContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kongzhituchushihua{" +
            ", id=" + id +
            ", gongzuorenyuanId=" + gongzuorenyuanId +
            ", kongzhituchushihuaUuidNumber=" + kongzhituchushihuaUuidNumber +
            ", kongzhituchushihuaName=" + kongzhituchushihuaName +
            ", kongzhituchushihuaTypes=" + kongzhituchushihuaTypes +
            ", kongzhituchushihuaQianFile=" + kongzhituchushihuaQianFile +
            ", kongzhituchushihuaHouFile=" + kongzhituchushihuaHouFile +
            ", kongzhituchushihuaTime=" + DateUtil.convertString(kongzhituchushihuaTime,"yyyy-MM-dd") +
            ", kongzhituchushihuaContent=" + kongzhituchushihuaContent +
            ", kongzhituchushihuaBeizhuContent=" + kongzhituchushihuaBeizhuContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
