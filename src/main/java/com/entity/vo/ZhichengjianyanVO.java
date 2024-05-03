package com.entity.vo;

import com.entity.ZhichengjianyanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 制成检验
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhichengjianyan")
public class ZhichengjianyanVO implements Serializable {
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

    @TableField(value = "zhichengjianyan_uuid_number")
    private String zhichengjianyanUuidNumber;


    /**
     * 检验标题
     */

    @TableField(value = "zhichengjianyan_name")
    private String zhichengjianyanName;


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
     * 制成检验类型
     */

    @TableField(value = "zhichengjianyan_types")
    private Integer zhichengjianyanTypes;


    /**
     * 检验文件
     */

    @TableField(value = "zhichengjianyan_file")
    private String zhichengjianyanFile;


    /**
     * 检验时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "zhichengjianyan_time")
    private Date zhichengjianyanTime;


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

    @TableField(value = "zhichengjianyan_content")
    private String zhichengjianyanContent;


    /**
     * 备注
     */

    @TableField(value = "zhichengjianyan_beizhu_content")
    private String zhichengjianyanBeizhuContent;


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
    public String getZhichengjianyanUuidNumber() {
        return zhichengjianyanUuidNumber;
    }


    /**
	 * 获取：检验编号
	 */

    public void setZhichengjianyanUuidNumber(String zhichengjianyanUuidNumber) {
        this.zhichengjianyanUuidNumber = zhichengjianyanUuidNumber;
    }
    /**
	 * 设置：检验标题
	 */
    public String getZhichengjianyanName() {
        return zhichengjianyanName;
    }


    /**
	 * 获取：检验标题
	 */

    public void setZhichengjianyanName(String zhichengjianyanName) {
        this.zhichengjianyanName = zhichengjianyanName;
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
	 * 设置：制成检验类型
	 */
    public Integer getZhichengjianyanTypes() {
        return zhichengjianyanTypes;
    }


    /**
	 * 获取：制成检验类型
	 */

    public void setZhichengjianyanTypes(Integer zhichengjianyanTypes) {
        this.zhichengjianyanTypes = zhichengjianyanTypes;
    }
    /**
	 * 设置：检验文件
	 */
    public String getZhichengjianyanFile() {
        return zhichengjianyanFile;
    }


    /**
	 * 获取：检验文件
	 */

    public void setZhichengjianyanFile(String zhichengjianyanFile) {
        this.zhichengjianyanFile = zhichengjianyanFile;
    }
    /**
	 * 设置：检验时间
	 */
    public Date getZhichengjianyanTime() {
        return zhichengjianyanTime;
    }


    /**
	 * 获取：检验时间
	 */

    public void setZhichengjianyanTime(Date zhichengjianyanTime) {
        this.zhichengjianyanTime = zhichengjianyanTime;
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
    public String getZhichengjianyanContent() {
        return zhichengjianyanContent;
    }


    /**
	 * 获取：检验结果
	 */

    public void setZhichengjianyanContent(String zhichengjianyanContent) {
        this.zhichengjianyanContent = zhichengjianyanContent;
    }
    /**
	 * 设置：备注
	 */
    public String getZhichengjianyanBeizhuContent() {
        return zhichengjianyanBeizhuContent;
    }


    /**
	 * 获取：备注
	 */

    public void setZhichengjianyanBeizhuContent(String zhichengjianyanBeizhuContent) {
        this.zhichengjianyanBeizhuContent = zhichengjianyanBeizhuContent;
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
