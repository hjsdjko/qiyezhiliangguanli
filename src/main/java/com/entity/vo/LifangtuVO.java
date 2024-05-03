package com.entity.vo;

import com.entity.LifangtuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 输出立方图
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("lifangtu")
public class LifangtuVO implements Serializable {
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

    @TableField(value = "lifangtu_uuid_number")
    private String lifangtuUuidNumber;


    /**
     * 输出标题
     */

    @TableField(value = "lifangtu_name")
    private String lifangtuName;


    /**
     * 立方图输出类型
     */

    @TableField(value = "lifangtu_types")
    private Integer lifangtuTypes;


    /**
     * 输出文件
     */

    @TableField(value = "lifangtu_file")
    private String lifangtuFile;


    /**
     * 输出时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "lifangtu_time")
    private Date lifangtuTime;


    /**
     * 输出备注
     */

    @TableField(value = "lifangtu_content")
    private String lifangtuContent;


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
    public String getLifangtuUuidNumber() {
        return lifangtuUuidNumber;
    }


    /**
	 * 获取：输出编号
	 */

    public void setLifangtuUuidNumber(String lifangtuUuidNumber) {
        this.lifangtuUuidNumber = lifangtuUuidNumber;
    }
    /**
	 * 设置：输出标题
	 */
    public String getLifangtuName() {
        return lifangtuName;
    }


    /**
	 * 获取：输出标题
	 */

    public void setLifangtuName(String lifangtuName) {
        this.lifangtuName = lifangtuName;
    }
    /**
	 * 设置：立方图输出类型
	 */
    public Integer getLifangtuTypes() {
        return lifangtuTypes;
    }


    /**
	 * 获取：立方图输出类型
	 */

    public void setLifangtuTypes(Integer lifangtuTypes) {
        this.lifangtuTypes = lifangtuTypes;
    }
    /**
	 * 设置：输出文件
	 */
    public String getLifangtuFile() {
        return lifangtuFile;
    }


    /**
	 * 获取：输出文件
	 */

    public void setLifangtuFile(String lifangtuFile) {
        this.lifangtuFile = lifangtuFile;
    }
    /**
	 * 设置：输出时间
	 */
    public Date getLifangtuTime() {
        return lifangtuTime;
    }


    /**
	 * 获取：输出时间
	 */

    public void setLifangtuTime(Date lifangtuTime) {
        this.lifangtuTime = lifangtuTime;
    }
    /**
	 * 设置：输出备注
	 */
    public String getLifangtuContent() {
        return lifangtuContent;
    }


    /**
	 * 获取：输出备注
	 */

    public void setLifangtuContent(String lifangtuContent) {
        this.lifangtuContent = lifangtuContent;
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
