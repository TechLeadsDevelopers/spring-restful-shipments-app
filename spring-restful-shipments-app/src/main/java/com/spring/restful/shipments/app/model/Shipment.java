package com.spring.restful.shipments.app.model;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Shipment {
	private long id;
	private String name;
	private String srcloc;
	private String destloc;
	private String status;
	private String description;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SS", timezone = "IST")
	private Date cratedate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SS", timezone = "IST")
	private Timestamp lastmodified;
	
	public Shipment() {
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSrcloc() {
		return srcloc;
	}
	public void setSrcloc(String srcloc) {
		this.srcloc = srcloc;
	}
	public String getDestloc() {
		return destloc;
	}
	public void setDestloc(String destloc) {
		this.destloc = destloc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCratedate() {
		return cratedate;
	}
	public void setCratedate(Date cratedate) {
		this.cratedate = cratedate;
	}
	public Timestamp getLastmodified() {
		return lastmodified;
	}
	public void setLastmodified(Timestamp lastmodified) {
		this.lastmodified = lastmodified;
	}
	@Override
	public String toString() {
		return "Shipment [id=" + id + ", name=" + name + ", srcloc=" + srcloc + ", destloc=" + destloc + ", status="
				+ status + ", description=" + description + ", cratedate=" + cratedate + ", lastmodified="
				+ lastmodified + "]";
	}
	
}
