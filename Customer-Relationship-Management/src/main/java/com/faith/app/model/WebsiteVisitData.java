package com.faith.app.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="website_visit_data")
public class WebsiteVisitData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private LocalDateTime timestamp;
	private int visitCount;
	
	public WebsiteVisitData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WebsiteVisitData(LocalDateTime timestamp, int visitCount) {
		super();
		this.timestamp = timestamp;
		this.visitCount = visitCount;
	}

	public LocalDateTime getDataTime() {
		return timestamp;
	}
	
	public void setDataTime(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
	public int getVisitCount() {
		return visitCount;
	}
	
	public void setVisitCount(int visitCount) {
		this.visitCount = visitCount;
	}
	
	

}
