package com.item.management.client.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock {
	@Id
	@Column(name="serial_number")
	private String serialNumber;
	
	
	@Column(name = "itemid")
	private String itemid;


	public String getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	public String getItemid() {
		return itemid;
	}


	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
}