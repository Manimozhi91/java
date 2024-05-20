package com.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookcab")
public class Book implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookcabid;
	@Override
	public String toString() {
		return "Book [bookcabid=" + bookcabid + ", cname=" + cname + ", bookingtime=" + bookingtime + ", amount="
				+ amount + ", fromlocation=" + fromlocation + ", tolocaation=" + tolocaation + ", typeofcab="
				+ typeofcab + "]";
	}
	private String cname;
	private LocalDateTime bookingtime;		// current data and time.
	private Double amount;					// 
	private String fromlocation;
	private String tolocaation;
	private String typeofcab;

	public Book() {
		super();
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
	public String getFromlocation() {
		return fromlocation;
	}
	public void setFromlocation(String fromlocation) {
		this.fromlocation = fromlocation;
	}
	public String getTolocaation() {
		return tolocaation;
	}
	public void setTolocaation(String tolocaation) {
		this.tolocaation = tolocaation;
	}
	public Book(Integer bookcabid, String cname, LocalDateTime bookingtime, Double amount, String fromlocation,
			String tolocaation, String typeofcab) {
		super();
		this.bookcabid = bookcabid;
		this.cname = cname;
		this.bookingtime = bookingtime;
		this.amount = amount;
		this.fromlocation = fromlocation;
		this.tolocaation = tolocaation;
		this.typeofcab = typeofcab;
	}

	public String getTypeofcab() {
		return typeofcab;
	}
	public void setTypeofcab(String typeofcab) {
		this.typeofcab = typeofcab;
	}


}
