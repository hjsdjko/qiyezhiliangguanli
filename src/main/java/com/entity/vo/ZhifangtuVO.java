package com.entity.vo;

import com.entity.ZhifangtuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 输出直方图
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhifangtu")
public class ZhifangtuVO implements Serializable {
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
     * 输出编号
     */

    @TableField(value = "zhifangtu_uuid_number")
    private String zhifangtuUuidNumber;


    /**
     * 输出标题
     */

    @TableField(value = "zhifangtu_name")
    private String zhifangtuName;


    /**
     * 直方图输出类型
     */

    @TableField(value = "zhifangtu_types")
    private Integer zhifangtuTypes;


    /**
     * 输出文件
     */

    @TableField(value = "zhifangtu_file")
    private String zhifangtuFile;


    /**
     * 输出时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "zhifangtu_time")
    private Date zhifangtuTime;


    /**
     * 输出备注
     */

    @TableField(value = "zhifangtu_content")
    private String zhifangtuContent;


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
	 * 设置：输出编号
	 */
    public String getZhifangtuUuidNumber() {
        return zhifangtuUuidNumber;
    }


    /**
	 * 获取：输出编号
	 */

    public void setZhifangtuUuidNumber(String zhifangtuUuidNumber) {
        this.zhifangtuUuidNumber = zhifangtuUuidNumber;
    }
    /**
	 * 设置：输出标题
	 */
    public String getZhifangtuName() {
        return zhifangtuName;
    }


    /**
	 * 获取：输出标题
	 */

    public void setZhifangtuName(String zhifangtuName) {
        this.zhifangtuName = zhifangtuName;
    }
    /**
	 * 设置：直方图输出类型
	 */
    public Integer getZhifangtuTypes() {
        return zhifangtuTypes;
    }


    /**
	 * 获取：直方图输出类型
	 */

    public void setZhifangtuTypes(Integer zhifangtuTypes) {
        this.zhifangtuTypes = zhifangtuTypes;
    }
    /**
	 * 设置：输出文件
	 */
    public String getZhifangtuFile() {
        return zhifangtuFile;
    }


    /**
	 * 获取：输出文件
	 */

    public void setZhifangtuFile(String zhifangtuFile) {
        this.zhifangtuFile = zhifangtuFile;
    }
    /**
	 * 设置：输出时间
	 */
    public Date getZhifangtuTime() {
        return zhifangtuTime;
    }


    /**
	 * 获取：输出时间
	 */

    public void setZhifangtuTime(Date zhifangtuTime) {
        this.zhifangtuTime = zhifangtuTime;
    }
    /**
	 * 设置：输出备注
	 */
    public String getZhifangtuContent() {
        return zhifangtuContent;
    }


    /**
	 * 获取：输出备注
	 */

    public void setZhifangtuContent(String zhifangtuContent) {
        this.zhifangtuContent = zhifangtuContent;
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
