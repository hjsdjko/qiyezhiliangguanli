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
 * 输出直方图
 *
 * @author 
 * @email
 */
@TableName("zhifangtu")
public class ZhifangtuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhifangtuEntity() {

	}

	public ZhifangtuEntity(T t) {
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
     * 输出编号
     */
    @ColumnInfo(comment="输出编号",type="varchar(200)")
    @TableField(value = "zhifangtu_uuid_number")

    private String zhifangtuUuidNumber;


    /**
     * 输出标题
     */
    @ColumnInfo(comment="输出标题",type="varchar(200)")
    @TableField(value = "zhifangtu_name")

    private String zhifangtuName;


    /**
     * 直方图输出类型
     */
    @ColumnInfo(comment="直方图输出类型",type="int(11)")
    @TableField(value = "zhifangtu_types")

    private Integer zhifangtuTypes;


    /**
     * 输出文件
     */
    @ColumnInfo(comment="输出文件",type="varchar(200)")
    @TableField(value = "zhifangtu_file")

    private String zhifangtuFile;


    /**
     * 输出时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="输出时间",type="timestamp")
    @TableField(value = "zhifangtu_time")

    private Date zhifangtuTime;


    /**
     * 输出备注
     */
    @ColumnInfo(comment="输出备注",type="longtext")
    @TableField(value = "zhifangtu_content")

    private String zhifangtuContent;


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
        return "Zhifangtu{" +
            ", id=" + id +
            ", gongzuorenyuanId=" + gongzuorenyuanId +
            ", zhifangtuUuidNumber=" + zhifangtuUuidNumber +
            ", zhifangtuName=" + zhifangtuName +
            ", zhifangtuTypes=" + zhifangtuTypes +
            ", zhifangtuFile=" + zhifangtuFile +
            ", zhifangtuTime=" + DateUtil.convertString(zhifangtuTime,"yyyy-MM-dd") +
            ", zhifangtuContent=" + zhifangtuContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
