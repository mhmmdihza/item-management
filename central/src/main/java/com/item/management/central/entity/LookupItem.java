package com.item.management.central.entity;
import javax.persistence.*;

@Entity
@Table(name = "lookup_item")

public class LookupItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "requestid")
	private String requestid;
	
	@Column(name = "sourceoffice")
	private String sourceoffice;
	
	@Column(name = "itemid")
	private String itemid;
	
	public String getRequestid() {
		return requestid;
	}

	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}

	public String getSourceoffice() {
		return sourceoffice;
	}

	public void setSourceoffice(String sourceoffice) {
		this.sourceoffice = sourceoffice;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getSnid() {
		return snid;
	}

	public void setSnid(String snid) {
		this.snid = snid;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	@Column(name = "snid")
	private String snid;
	
	@Column(name = "qty")
	private Integer qty;
}