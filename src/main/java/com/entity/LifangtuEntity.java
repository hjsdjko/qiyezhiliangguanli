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
 * 输出立方图
 *
 * @author 
 * @email
 */
@TableName("lifangtu")
public class LifangtuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LifangtuEntity() {

	}

	public LifangtuEntity(T t) {
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
    @TableField(value = "lifangtu_uuid_number")

    private String lifangtuUuidNumber;


    /**
     * 输出标题
     */
    @ColumnInfo(comment="输出标题",type="varchar(200)")
    @TableField(value = "lifangtu_name")

    private String lifangtuName;


    /**
     * 立方图输出类型
     */
    @ColumnInfo(comment="立方图输出类型",type="int(11)")
    @TableField(value = "lifangtu_types")

    private Integer lifangtuTypes;


    /**
     * 输出文件
     */
    @ColumnInfo(comment="输出文件",type="varchar(200)")
    @TableField(value = "lifangtu_file")

    private String lifangtuFile;


    /**
     * 输出时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="输出时间",type="timestamp")
    @TableField(value = "lifangtu_time")

    private Date lifangtuTime;


    /**
     * 输出备注
     */
    @ColumnInfo(comment="输出备注",type="longtext")
    @TableField(value = "lifangtu_content")

    private String lifangtuContent;


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
        return "Lifangtu{" +
            ", id=" + id +
            ", gongzuorenyuanId=" + gongzuorenyuanId +
            ", lifangtuUuidNumber=" + lifangtuUuidNumber +
            ", lifangtuName=" + lifangtuName +
            ", lifangtuTypes=" + lifangtuTypes +
            ", lifangtuFile=" + lifangtuFile +
            ", lifangtuTime=" + DateUtil.convertString(lifangtuTime,"yyyy-MM-dd") +
            ", lifangtuContent=" + lifangtuContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
