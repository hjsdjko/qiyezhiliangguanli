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
 * 抽样标准
 *
 * @author 
 * @email
 */
@TableName("chouyangbiaozhun")
public class ChouyangbiaozhunEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChouyangbiaozhunEntity() {

	}

	public ChouyangbiaozhunEntity(T t) {
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
     * 标准编号
     */
    @ColumnInfo(comment="标准编号",type="varchar(200)")
    @TableField(value = "chouyangbiaozhun_uuid_number")

    private String chouyangbiaozhunUuidNumber;


    /**
     * 标准标题
     */
    @ColumnInfo(comment="标准标题",type="varchar(200)")
    @TableField(value = "chouyangbiaozhun_name")

    private String chouyangbiaozhunName;


    /**
     * 检验项目
     */
    @ColumnInfo(comment="检验项目",type="int(11)")
    @TableField(value = "jianyanxiangmu_types")

    private Integer jianyanxiangmuTypes;


    /**
     * 抽样标准类型
     */
    @ColumnInfo(comment="抽样标准类型",type="int(11)")
    @TableField(value = "chouyangbiaozhun_types")

    private Integer chouyangbiaozhunTypes;


    /**
     * 依据标准
     */
    @ColumnInfo(comment="依据标准",type="varchar(200)")
    @TableField(value = "chouyangbiaozhun_file")

    private String chouyangbiaozhunFile;


    /**
     * 合格标准
     */
    @ColumnInfo(comment="合格标准",type="longtext")
    @TableField(value = "chouyangbiaozhun_content")

    private String chouyangbiaozhunContent;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="longtext")
    @TableField(value = "chouyangbiaozhun_beizhu_content")

    private String chouyangbiaozhunBeizhuContent;


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
        return "Chouyangbiaozhun{" +
            ", id=" + id +
            ", chouyangbiaozhunUuidNumber=" + chouyangbiaozhunUuidNumber +
            ", chouyangbiaozhunName=" + chouyangbiaozhunName +
            ", jianyanxiangmuTypes=" + jianyanxiangmuTypes +
            ", chouyangbiaozhunTypes=" + chouyangbiaozhunTypes +
            ", chouyangbiaozhunFile=" + chouyangbiaozhunFile +
            ", chouyangbiaozhunContent=" + chouyangbiaozhunContent +
            ", chouyangbiaozhunBeizhuContent=" + chouyangbiaozhunBeizhuContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
