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
 * 成品检验
 *
 * @author 
 * @email
 */
@TableName("chengpinjianyan")
public class ChengpinjianyanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChengpinjianyanEntity() {

	}

	public ChengpinjianyanEntity(T t) {
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
     * 检验编号
     */
    @ColumnInfo(comment="检验编号",type="varchar(200)")
    @TableField(value = "chengpinjianyan_uuid_number")

    private String chengpinjianyanUuidNumber;


    /**
     * 检验标题
     */
    @ColumnInfo(comment="检验标题",type="varchar(200)")
    @TableField(value = "chengpinjianyan_name")

    private String chengpinjianyanName;


    /**
     * 检验中心
     */
    @ColumnInfo(comment="检验中心",type="int(11)")
    @TableField(value = "jianyanzhongxin_types")

    private Integer jianyanzhongxinTypes;


    /**
     * 检验仪器
     */
    @ColumnInfo(comment="检验仪器",type="int(11)")
    @TableField(value = "jianyanyiqi_types")

    private Integer jianyanyiqiTypes;


    /**
     * 检验项目
     */
    @ColumnInfo(comment="检验项目",type="int(11)")
    @TableField(value = "jianyanxiangmu_types")

    private Integer jianyanxiangmuTypes;


    /**
     * 成品检验类型
     */
    @ColumnInfo(comment="成品检验类型",type="int(11)")
    @TableField(value = "chengpinjianyan_types")

    private Integer chengpinjianyanTypes;


    /**
     * 检验文件
     */
    @ColumnInfo(comment="检验文件",type="varchar(200)")
    @TableField(value = "chengpinjianyan_file")

    private String chengpinjianyanFile;


    /**
     * 检验时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="检验时间",type="timestamp")
    @TableField(value = "chengpinjianyan_time")

    private Date chengpinjianyanTime;


    /**
     * 质量等级
     */
    @ColumnInfo(comment="质量等级",type="int(11)")
    @TableField(value = "zhiliangdengji_types")

    private Integer zhiliangdengjiTypes;


    /**
     * 缺陷等级
     */
    @ColumnInfo(comment="缺陷等级",type="int(11)")
    @TableField(value = "quexiandengji_types")

    private Integer quexiandengjiTypes;


    /**
     * 缺陷原因类型
     */
    @ColumnInfo(comment="缺陷原因类型",type="int(11)")
    @TableField(value = "quexianyuanyin_types")

    private Integer quexianyuanyinTypes;


    /**
     * 检测结果
     */
    @ColumnInfo(comment="检测结果",type="int(11)")
    @TableField(value = "jieguo_types")

    private Integer jieguoTypes;


    /**
     * 检验结果
     */
    @ColumnInfo(comment="检验结果",type="longtext")
    @TableField(value = "chengpinjianyan_content")

    private String chengpinjianyanContent;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="longtext")
    @TableField(value = "chengpinjianyan_beizhu_content")

    private String chengpinjianyanBeizhuContent;


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
	 * 获取：检验编号
	 */
    public String getChengpinjianyanUuidNumber() {
        return chengpinjianyanUuidNumber;
    }
    /**
	 * 设置：检验编号
	 */

    public void setChengpinjianyanUuidNumber(String chengpinjianyanUuidNumber) {
        this.chengpinjianyanUuidNumber = chengpinjianyanUuidNumber;
    }
    /**
	 * 获取：检验标题
	 */
    public String getChengpinjianyanName() {
        return chengpinjianyanName;
    }
    /**
	 * 设置：检验标题
	 */

    public void setChengpinjianyanName(String chengpinjianyanName) {
        this.chengpinjianyanName = chengpinjianyanName;
    }
    /**
	 * 获取：检验中心
	 */
    public Integer getJianyanzhongxinTypes() {
        return jianyanzhongxinTypes;
    }
    /**
	 * 设置：检验中心
	 */

    public void setJianyanzhongxinTypes(Integer jianyanzhongxinTypes) {
        this.jianyanzhongxinTypes = jianyanzhongxinTypes;
    }
    /**
	 * 获取：检验仪器
	 */
    public Integer getJianyanyiqiTypes() {
        return jianyanyiqiTypes;
    }
    /**
	 * 设置：检验仪器
	 */

    public void setJianyanyiqiTypes(Integer jianyanyiqiTypes) {
        this.jianyanyiqiTypes = jianyanyiqiTypes;
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
	 * 获取：成品检验类型
	 */
    public Integer getChengpinjianyanTypes() {
        return chengpinjianyanTypes;
    }
    /**
	 * 设置：成品检验类型
	 */

    public void setChengpinjianyanTypes(Integer chengpinjianyanTypes) {
        this.chengpinjianyanTypes = chengpinjianyanTypes;
    }
    /**
	 * 获取：检验文件
	 */
    public String getChengpinjianyanFile() {
        return chengpinjianyanFile;
    }
    /**
	 * 设置：检验文件
	 */

    public void setChengpinjianyanFile(String chengpinjianyanFile) {
        this.chengpinjianyanFile = chengpinjianyanFile;
    }
    /**
	 * 获取：检验时间
	 */
    public Date getChengpinjianyanTime() {
        return chengpinjianyanTime;
    }
    /**
	 * 设置：检验时间
	 */

    public void setChengpinjianyanTime(Date chengpinjianyanTime) {
        this.chengpinjianyanTime = chengpinjianyanTime;
    }
    /**
	 * 获取：质量等级
	 */
    public Integer getZhiliangdengjiTypes() {
        return zhiliangdengjiTypes;
    }
    /**
	 * 设置：质量等级
	 */

    public void setZhiliangdengjiTypes(Integer zhiliangdengjiTypes) {
        this.zhiliangdengjiTypes = zhiliangdengjiTypes;
    }
    /**
	 * 获取：缺陷等级
	 */
    public Integer getQuexiandengjiTypes() {
        return quexiandengjiTypes;
    }
    /**
	 * 设置：缺陷等级
	 */

    public void setQuexiandengjiTypes(Integer quexiandengjiTypes) {
        this.quexiandengjiTypes = quexiandengjiTypes;
    }
    /**
	 * 获取：缺陷原因类型
	 */
    public Integer getQuexianyuanyinTypes() {
        return quexianyuanyinTypes;
    }
    /**
	 * 设置：缺陷原因类型
	 */

    public void setQuexianyuanyinTypes(Integer quexianyuanyinTypes) {
        this.quexianyuanyinTypes = quexianyuanyinTypes;
    }
    /**
	 * 获取：检测结果
	 */
    public Integer getJieguoTypes() {
        return jieguoTypes;
    }
    /**
	 * 设置：检测结果
	 */

    public void setJieguoTypes(Integer jieguoTypes) {
        this.jieguoTypes = jieguoTypes;
    }
    /**
	 * 获取：检验结果
	 */
    public String getChengpinjianyanContent() {
        return chengpinjianyanContent;
    }
    /**
	 * 设置：检验结果
	 */

    public void setChengpinjianyanContent(String chengpinjianyanContent) {
        this.chengpinjianyanContent = chengpinjianyanContent;
    }
    /**
	 * 获取：备注
	 */
    public String getChengpinjianyanBeizhuContent() {
        return chengpinjianyanBeizhuContent;
    }
    /**
	 * 设置：备注
	 */

    public void setChengpinjianyanBeizhuContent(String chengpinjianyanBeizhuContent) {
        this.chengpinjianyanBeizhuContent = chengpinjianyanBeizhuContent;
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
        return "Chengpinjianyan{" +
            ", id=" + id +
            ", gongzuorenyuanId=" + gongzuorenyuanId +
            ", chengpinjianyanUuidNumber=" + chengpinjianyanUuidNumber +
            ", chengpinjianyanName=" + chengpinjianyanName +
            ", jianyanzhongxinTypes=" + jianyanzhongxinTypes +
            ", jianyanyiqiTypes=" + jianyanyiqiTypes +
            ", jianyanxiangmuTypes=" + jianyanxiangmuTypes +
            ", chengpinjianyanTypes=" + chengpinjianyanTypes +
            ", chengpinjianyanFile=" + chengpinjianyanFile +
            ", chengpinjianyanTime=" + DateUtil.convertString(chengpinjianyanTime,"yyyy-MM-dd") +
            ", zhiliangdengjiTypes=" + zhiliangdengjiTypes +
            ", quexiandengjiTypes=" + quexiandengjiTypes +
            ", quexianyuanyinTypes=" + quexianyuanyinTypes +
            ", jieguoTypes=" + jieguoTypes +
            ", chengpinjianyanContent=" + chengpinjianyanContent +
            ", chengpinjianyanBeizhuContent=" + chengpinjianyanBeizhuContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
