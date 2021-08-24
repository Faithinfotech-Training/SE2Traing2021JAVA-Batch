package com.faith.app.model;

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
	private String dataTime;
	private int visitCount;
	
	
	
	
	
	public WebsiteVisitData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public WebsiteVisitData(String dataTime, int visitCount) {
		super();
		this.dataTime = dataTime;
		this.visitCount = visitCount;
	}



	public String getDataTime() {
		return dataTime;
	}
	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}
	public int getVisitCount() {
		return visitCount;
	}
	public void setVisitCount(int visitCount) {
		this.visitCount = visitCount;
	}
	
	

}
