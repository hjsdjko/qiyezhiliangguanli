package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ChouyangbiaozhunEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 抽样标准
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("chouyangbiaozhun")
public class ChouyangbiaozhunView extends ChouyangbiaozhunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 检验项目的值
	*/
	@ColumnInfo(comment="检验项目的字典表值",type="varchar(200)")
	private String jianyanxiangmuValue;
	/**
	* 抽样标准类型的值
	*/
	@ColumnInfo(comment="抽样标准类型的字典表值",type="varchar(200)")
	private String chouyangbiaozhunValue;




	public ChouyangbiaozhunView() {

	}

	public ChouyangbiaozhunView(ChouyangbiaozhunEntity chouyangbiaozhunEntity) {
		try {
			BeanUtils.copyProperties(this, chouyangbiaozhunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 检验项目的值
	*/
	public String getJianyanxiangmuValue() {
		return jianyanxiangmuValue;
	}
	/**
	* 设置： 检验项目的值
	*/
	public void setJianyanxiangmuValue(String jianyanxiangmuValue) {
		this.jianyanxiangmuValue = jianyanxiangmuValue;
	}
	//当前表的
	/**
	* 获取： 抽样标准类型的值
	*/
	public String getChouyangbiaozhunValue() {
		return chouyangbiaozhunValue;
	}
	/**
	* 设置： 抽样标准类型的值
	*/
	public void setChouyangbiaozhunValue(String chouyangbiaozhunValue) {
		this.chouyangbiaozhunValue = chouyangbiaozhunValue;
	}




	@Override
	public String toString() {
		return "ChouyangbiaozhunView{" +
			", jianyanxiangmuValue=" + jianyanxiangmuValue +
			", chouyangbiaozhunValue=" + chouyangbiaozhunValue +
			"} " + super.toString();
	}
}
