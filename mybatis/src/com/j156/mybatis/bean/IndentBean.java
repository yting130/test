package com.j156.mybatis.bean;
/**
 * 订单实体类
 * @author wangyuren
 *
 */

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

public class IndentBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1279317475195983293L;
	/**订单id**/
	private int id;
	/**订单名称**/
	private String indentName;
	/**订单单价**/
	private BigDecimal indentPrice;
	/**订单产生时间**/
	private Date indentDate;
	public IndentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIndentName() {
		return indentName;
	}
	public void setIndentName(String indentName) {
		this.indentName = indentName;
	}
	public BigDecimal getIndentPrice() {
		return indentPrice;
	}
	public void setIndentPrice(BigDecimal indentPrice) {
		this.indentPrice = indentPrice;
	}
	public Date getIndentDate() {
		return indentDate;
	}
	public void setIndentDate(Date indentDate) {
		this.indentDate = indentDate;
	}
	@Override
	public String toString() {
		return "IndentBean [id=" + id + ", indentName=" + indentName + ", indentPrice=" + indentPrice + ", indentDate="
				+ indentDate + "]";
	}
	
}
