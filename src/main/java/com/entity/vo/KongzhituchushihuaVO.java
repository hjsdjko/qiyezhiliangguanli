package com.entity.vo;

import com.entity.KongzhituchushihuaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 控制图初始化
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kongzhituchushihua")
public class KongzhituchushihuaVO implements Serializable {
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
     * 初始化编号
     */

    @TableField(value = "kongzhituchushihua_uuid_number")
    private String kongzhituchushihuaUuidNumber;


    /**
     * 初始化标题
     */

    @TableField(value = "kongzhituchushihua_name")
    private String kongzhituchushihuaName;


    /**
     * 控制图初始化类型
     */

    @TableField(value = "kongzhituchushihua_types")
    private Integer kongzhituchushihuaTypes;


    /**
     * 初始化前文件
     */

    @TableField(value = "kongzhituchushihua_qian_file")
    private String kongzhituchushihuaQianFile;


    /**
     * 初始化后文件
     */

    @TableField(value = "kongzhituchushihua_hou_file")
    private String kongzhituchushihuaHouFile;


    /**
     * 初始化时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "kongzhituchushihua_time")
    private Date kongzhituchushihuaTime;


    /**
     * 初始化内容
     */

    @TableField(value = "kongzhituchushihua_content")
    private String kongzhituchushihuaContent;


    /**
     * 备注
     */

    @TableField(value = "kongzhituchushihua_beizhu_content")
    private String kongzhituchushihuaBeizhuContent;


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
	 * 设置：初始化编号
	 */
    public String getKongzhituchushihuaUuidNumber() {
        return kongzhituchushihuaUuidNumber;
    }


    /**
	 * 获取：初始化编号
	 */

    public void setKongzhituchushihuaUuidNumber(String kongzhituchushihuaUuidNumber) {
        this.kongzhituchushihuaUuidNumber = kongzhituchushihuaUuidNumber;
    }
    /**
	 * 设置：初始化标题
	 */
    public String getKongzhituchushihuaName() {
        return kongzhituchushihuaName;
    }


    /**
	 * 获取：初始化标题
	 */

    public void setKongzhituchushihuaName(String kongzhituchushihuaName) {
        this.kongzhituchushihuaName = kongzhituchushihuaName;
    }
    /**
	 * 设置：控制图初始化类型
	 */
    public Integer getKongzhituchushihuaTypes() {
        return kongzhituchushihuaTypes;
    }


    /**
	 * 获取：控制图初始化类型
	 */

    public void setKongzhituchushihuaTypes(Integer kongzhituchushihuaTypes) {
        this.kongzhituchushihuaTypes = kongzhituchushihuaTypes;
    }
    /**
	 * 设置：初始化前文件
	 */
    public String getKongzhituchushihuaQianFile() {
        return kongzhituchushihuaQianFile;
    }


    /**
	 * 获取：初始化前文件
	 */

    public void setKongzhituchushihuaQianFile(String kongzhituchushihuaQianFile) {
        this.kongzhituchushihuaQianFile = kongzhituchushihuaQianFile;
    }
    /**
	 * 设置：初始化后文件
	 */
    public String getKongzhituchushihuaHouFile() {
        return kongzhituchushihuaHouFile;
    }


    /**
	 * 获取：初始化后文件
	 */

    public void setKongzhituchushihuaHouFile(String kongzhituchushihuaHouFile) {
        this.kongzhituchushihuaHouFile = kongzhituchushihuaHouFile;
    }
    /**
	 * 设置：初始化时间
	 */
    public Date getKongzhituchushihuaTime() {
        return kongzhituchushihuaTime;
    }


    /**
	 * 获取：初始化时间
	 */

    public void setKongzhituchushihuaTime(Date kongzhituchushihuaTime) {
        this.kongzhituchushihuaTime = kongzhituchushihuaTime;
    }
    /**
	 * 设置：初始化内容
	 */
    public String getKongzhituchushihuaContent() {
        return kongzhituchushihuaContent;
    }


    /**
	 * 获取：初始化内容
	 */

    public void setKongzhituchushihuaContent(String kongzhituchushihuaContent) {
        this.kongzhituchushihuaContent = kongzhituchushihuaContent;
    }
    /**
	 * 设置：备注
	 */
    public String getKongzhituchushihuaBeizhuContent() {
        return kongzhituchushihuaBeizhuContent;
    }


    /**
	 * 获取：备注
	 */

    public void setKongzhituchushihuaBeizhuContent(String kongzhituchushihuaBeizhuContent) {
        this.kongzhituchushihuaBeizhuContent = kongzhituchushihuaBeizhuContent;
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
