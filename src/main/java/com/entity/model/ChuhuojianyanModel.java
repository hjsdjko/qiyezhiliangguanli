package com.entity.model;

import com.entity.ChuhuojianyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 出货检验
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChuhuojianyanModel implements Serializable {
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
     * 检验编号
     */
    private String chuhuojianyanUuidNumber;


    /**
     * 检验标题
     */
    private String chuhuojianyanName;


    /**
     * 检验中心
     */
    private Integer jianyanzhongxinTypes;


    /**
     * 检验仪器
     */
    private Integer jianyanyiqiTypes;


    /**
     * 检验项目
     */
    private Integer jianyanxiangmuTypes;


    /**
     * 出货检验类型
     */
    private Integer chuhuojianyanTypes;


    /**
     * 检验文件
     */
    private String chuhuojianyanFile;


    /**
     * 检验时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date chuhuojianyanTime;


    /**
     * 质量等级
     */
    private Integer zhiliangdengjiTypes;


    /**
     * 缺陷等级
     */
    private Integer quexiandengjiTypes;


    /**
     * 缺陷原因类型
     */
    private Integer quexianyuanyinTypes;


    /**
     * 检测结果
     */
    private Integer jieguoTypes;


    /**
     * 检验结果
     */
    private String chuhuojianyanContent;


    /**
     * 备注
     */
    private String chuhuojianyanBeizhuContent;


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
	 * 获取：检验编号
	 */
    public String getChuhuojianyanUuidNumber() {
        return chuhuojianyanUuidNumber;
    }


    /**
	 * 设置：检验编号
	 */
    public void setChuhuojianyanUuidNumber(String chuhuojianyanUuidNumber) {
        this.chuhuojianyanUuidNumber = chuhuojianyanUuidNumber;
    }
    /**
	 * 获取：检验标题
	 */
    public String getChuhuojianyanName() {
        return chuhuojianyanName;
    }


    /**
	 * 设置：检验标题
	 */
    public void setChuhuojianyanName(String chuhuojianyanName) {
        this.chuhuojianyanName = chuhuojianyanName;
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
	 * 获取：出货检验类型
	 */
    public Integer getChuhuojianyanTypes() {
        return chuhuojianyanTypes;
    }


    /**
	 * 设置：出货检验类型
	 */
    public void setChuhuojianyanTypes(Integer chuhuojianyanTypes) {
        this.chuhuojianyanTypes = chuhuojianyanTypes;
    }
    /**
	 * 获取：检验文件
	 */
    public String getChuhuojianyanFile() {
        return chuhuojianyanFile;
    }


    /**
	 * 设置：检验文件
	 */
    public void setChuhuojianyanFile(String chuhuojianyanFile) {
        this.chuhuojianyanFile = chuhuojianyanFile;
    }
    /**
	 * 获取：检验时间
	 */
    public Date getChuhuojianyanTime() {
        return chuhuojianyanTime;
    }


    /**
	 * 设置：检验时间
	 */
    public void setChuhuojianyanTime(Date chuhuojianyanTime) {
        this.chuhuojianyanTime = chuhuojianyanTime;
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
    public String getChuhuojianyanContent() {
        return chuhuojianyanContent;
    }


    /**
	 * 设置：检验结果
	 */
    public void setChuhuojianyanContent(String chuhuojianyanContent) {
        this.chuhuojianyanContent = chuhuojianyanContent;
    }
    /**
	 * 获取：备注
	 */
    public String getChuhuojianyanBeizhuContent() {
        return chuhuojianyanBeizhuContent;
    }


    /**
	 * 设置：备注
	 */
    public void setChuhuojianyanBeizhuContent(String chuhuojianyanBeizhuContent) {
        this.chuhuojianyanBeizhuContent = chuhuojianyanBeizhuContent;
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
