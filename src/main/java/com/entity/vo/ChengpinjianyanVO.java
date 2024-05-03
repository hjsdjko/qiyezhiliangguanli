package com.entity.vo;

import com.entity.ChengpinjianyanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 成品检验
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chengpinjianyan")
public class ChengpinjianyanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 工作人员
     */

    @TableField(value = "gongzuorenyuan_id")
    private Integer gongzuorenyuanId;


    /**
     * 检验编号
     */

    @TableField(value = "chengpinjianyan_uuid_number")
    private String chengpinjianyanUuidNumber;


    /**
     * 检验标题
     */

    @TableField(value = "chengpinjianyan_name")
    private String chengpinjianyanName;


    /**
     * 检验中心
     */

    @TableField(value = "jianyanzhongxin_types")
    private Integer jianyanzhongxinTypes;


    /**
     * 检验仪器
     */

    @TableField(value = "jianyanyiqi_types")
    private Integer jianyanyiqiTypes;


    /**
     * 检验项目
     */

    @TableField(value = "jianyanxiangmu_types")
    private Integer jianyanxiangmuTypes;


    /**
     * 成品检验类型
     */

    @TableField(value = "chengpinjianyan_types")
    private Integer chengpinjianyanTypes;


    /**
     * 检验文件
     */

    @TableField(value = "chengpinjianyan_file")
    private String chengpinjianyanFile;


    /**
     * 检验时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "chengpinjianyan_time")
    private Date chengpinjianyanTime;


    /**
     * 质量等级
     */

    @TableField(value = "zhiliangdengji_types")
    private Integer zhiliangdengjiTypes;


    /**
     * 缺陷等级
     */

    @TableField(value = "quexiandengji_types")
    private Integer quexiandengjiTypes;


    /**
     * 缺陷原因类型
     */

    @TableField(value = "quexianyuanyin_types")
    private Integer quexianyuanyinTypes;


    /**
     * 检测结果
     */

    @TableField(value = "jieguo_types")
    private Integer jieguoTypes;


    /**
     * 检验结果
     */

    @TableField(value = "chengpinjianyan_content")
    private String chengpinjianyanContent;


    /**
     * 备注
     */

    @TableField(value = "chengpinjianyan_beizhu_content")
    private String chengpinjianyanBeizhuContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：工作人员
	 */
    public Integer getGongzuorenyuanId() {
        return gongzuorenyuanId;
    }


    /**
	 * 获取：工作人员
	 */

    public void setGongzuorenyuanId(Integer gongzuorenyuanId) {
        this.gongzuorenyuanId = gongzuorenyuanId;
    }
    /**
	 * 设置：检验编号
	 */
    public String getChengpinjianyanUuidNumber() {
        return chengpinjianyanUuidNumber;
    }


    /**
	 * 获取：检验编号
	 */

    public void setChengpinjianyanUuidNumber(String chengpinjianyanUuidNumber) {
        this.chengpinjianyanUuidNumber = chengpinjianyanUuidNumber;
    }
    /**
	 * 设置：检验标题
	 */
    public String getChengpinjianyanName() {
        return chengpinjianyanName;
    }


    /**
	 * 获取：检验标题
	 */

    public void setChengpinjianyanName(String chengpinjianyanName) {
        this.chengpinjianyanName = chengpinjianyanName;
    }
    /**
	 * 设置：检验中心
	 */
    public Integer getJianyanzhongxinTypes() {
        return jianyanzhongxinTypes;
    }


    /**
	 * 获取：检验中心
	 */

    public void setJianyanzhongxinTypes(Integer jianyanzhongxinTypes) {
        this.jianyanzhongxinTypes = jianyanzhongxinTypes;
    }
    /**
	 * 设置：检验仪器
	 */
    public Integer getJianyanyiqiTypes() {
        return jianyanyiqiTypes;
    }


    /**
	 * 获取：检验仪器
	 */

    public void setJianyanyiqiTypes(Integer jianyanyiqiTypes) {
        this.jianyanyiqiTypes = jianyanyiqiTypes;
    }
    /**
	 * 设置：检验项目
	 */
    public Integer getJianyanxiangmuTypes() {
        return jianyanxiangmuTypes;
    }


    /**
	 * 获取：检验项目
	 */

    public void setJianyanxiangmuTypes(Integer jianyanxiangmuTypes) {
        this.jianyanxiangmuTypes = jianyanxiangmuTypes;
    }
    /**
	 * 设置：成品检验类型
	 */
    public Integer getChengpinjianyanTypes() {
        return chengpinjianyanTypes;
    }


    /**
	 * 获取：成品检验类型
	 */

    public void setChengpinjianyanTypes(Integer chengpinjianyanTypes) {
        this.chengpinjianyanTypes = chengpinjianyanTypes;
    }
    /**
	 * 设置：检验文件
	 */
    public String getChengpinjianyanFile() {
        return chengpinjianyanFile;
    }


    /**
	 * 获取：检验文件
	 */

    public void setChengpinjianyanFile(String chengpinjianyanFile) {
        this.chengpinjianyanFile = chengpinjianyanFile;
    }
    /**
	 * 设置：检验时间
	 */
    public Date getChengpinjianyanTime() {
        return chengpinjianyanTime;
    }


    /**
	 * 获取：检验时间
	 */

    public void setChengpinjianyanTime(Date chengpinjianyanTime) {
        this.chengpinjianyanTime = chengpinjianyanTime;
    }
    /**
	 * 设置：质量等级
	 */
    public Integer getZhiliangdengjiTypes() {
        return zhiliangdengjiTypes;
    }


    /**
	 * 获取：质量等级
	 */

    public void setZhiliangdengjiTypes(Integer zhiliangdengjiTypes) {
        this.zhiliangdengjiTypes = zhiliangdengjiTypes;
    }
    /**
	 * 设置：缺陷等级
	 */
    public Integer getQuexiandengjiTypes() {
        return quexiandengjiTypes;
    }


    /**
	 * 获取：缺陷等级
	 */

    public void setQuexiandengjiTypes(Integer quexiandengjiTypes) {
        this.quexiandengjiTypes = quexiandengjiTypes;
    }
    /**
	 * 设置：缺陷原因类型
	 */
    public Integer getQuexianyuanyinTypes() {
        return quexianyuanyinTypes;
    }


    /**
	 * 获取：缺陷原因类型
	 */

    public void setQuexianyuanyinTypes(Integer quexianyuanyinTypes) {
        this.quexianyuanyinTypes = quexianyuanyinTypes;
    }
    /**
	 * 设置：检测结果
	 */
    public Integer getJieguoTypes() {
        return jieguoTypes;
    }


    /**
	 * 获取：检测结果
	 */

    public void setJieguoTypes(Integer jieguoTypes) {
        this.jieguoTypes = jieguoTypes;
    }
    /**
	 * 设置：检验结果
	 */
    public String getChengpinjianyanContent() {
        return chengpinjianyanContent;
    }


    /**
	 * 获取：检验结果
	 */

    public void setChengpinjianyanContent(String chengpinjianyanContent) {
        this.chengpinjianyanContent = chengpinjianyanContent;
    }
    /**
	 * 设置：备注
	 */
    public String getChengpinjianyanBeizhuContent() {
        return chengpinjianyanBeizhuContent;
    }


    /**
	 * 获取：备注
	 */

    public void setChengpinjianyanBeizhuContent(String chengpinjianyanBeizhuContent) {
        this.chengpinjianyanBeizhuContent = chengpinjianyanBeizhuContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
