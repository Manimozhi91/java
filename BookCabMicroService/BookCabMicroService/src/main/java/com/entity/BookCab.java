package com.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "bookcab")
public class BookCab {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer bookcabid;

public BookCab(Integer bookcabid, String cname, LocalDateTime bookingtime, Double amount, String source,
		String destination, String typeofcab, Integer numberofseats) {
	super();
	this.bookcabid = bookcabid;
	this.cname = cname;
	this.bookingtime = bookingtime;
	this.amount = amount;
	this.source = source;
	this.destination = destination;
	this.typeofcab = typeofcab;
	this.numberofseats = numberofseats;
}
private String cname;
private LocalDateTime bookingtime;		// current data and time.
private Double amount;					// 
private String source;
private String destination;
private String typeofcab;
private Integer numberofseats;			//cname,source,destination, typeofcab,numberofseats

public String getTypeofcab() {
	return typeofcab;
}
public void setTypeofcab(String typeofcab) {
	this.typeofcab = typeofcab;
}
public Integer getNumberofseats() {
	return numberofseats;
}
public void setNumberofseats(Integer numberofseats) {
	this.numberofseats = numberofseats;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public Integer getBookcabid() {
	return bookcabid;
}
public void setBookcabid(Integer bookcabid) {
	this.bookcabid = bookcabid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public LocalDateTime getBookingtime() {
	return bookingtime;
}
public void setBookingtime(LocalDateTime bookingtime) {
	this.bookingtime = bookingtime;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "BookCab [bookcabid=" + bookcabid + ", cname=" + cname + ", bookingtime=" + bookingtime + ", amount="
			+ amount + ", source=" + source + ", destination=" + destination + ", typeofcab=" + typeofcab
			+ ", numberofseats=" + numberofseats + "]";
}
}
