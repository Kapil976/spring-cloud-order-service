/**
 * 
 */
package com.kapil.model;

/**
 * @author HOME PC
 *
 */
public class Stock {

	private Long id;
	private String code;
	private Double cost;
	private Integer qty;

	public Stock(Long id, String code, Double cost, Integer qty) {
		this.id = id;
		this.code = code;
		this.cost = cost;
		this.qty = qty;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", code=" + code + ", cost=" + cost + ", qty=" + qty + "]";
	}

//	

}
