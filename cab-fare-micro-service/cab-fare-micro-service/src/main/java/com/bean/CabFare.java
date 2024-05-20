package com.bean;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cabfare")
public class CabFare implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer cfid;
@Override
public String toString() {
	return "CabFare [cfid=" + cfid + ", fromlocation=" + fromlocation + ", tolocation=" + tolocation + ", typeofcab="
			+ typeofcab + ", amount=" + amount + "]";
}
private String fromlocation;
private String tolocation;
private String typeofcab;
private Double amount;


public Integer getCfid() {
	return cfid;
}
public void setCfid(Integer cfid) {
	this.cfid = cfid;
}
public String getFromlocation() {
	return fromlocation;
}
public void setFromlocation(String fromlocation) {
	this.fromlocation = fromlocation;
}
public String getTolocation() {
	return tolocation;
}
public void setTolocation(String tolocation) {
	this.tolocation = tolocation;
}
public String getTypeofcab() {
	return typeofcab;
}
public void setTypeofcab(String typeofcab) {
	this.typeofcab = typeofcab;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}


public CabFare() {
	super();
	// TODO Auto-generated constructor stub
}
public CabFare(Integer cfid, String fromlocation, String tolocation, String typeofcab, Double amount) {
	super();
	this.cfid = cfid;
	this.fromlocation = fromlocation;
	this.tolocation = tolocation;
	this.typeofcab = typeofcab;
	this.amount = amount;
}

}
