package com.faith.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_payment")
public class course_payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long paymentId;
	
	@Column(name="Trainee_Id")
	private Long traineeId;
	
	@Column(name="Course_Id")
	private Long courseId;
	
	@Column(name="Payment_Paid")
	private int paymentPaid;
	
	@Column(name="Payment_Due")
	private int paymentDue;
	
	@Column(name="Date")
	private String date;
	
	@Column(name="Total_Amount")
	private int totalAmount;

	public course_payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public course_payment(Long paymentId, Long traineeId, Long courseId, int paymentPaid, int paymentDue, String date,
			int totalAmount) {
		super();
		this.paymentId = paymentId;
		this.traineeId = traineeId;
		this.courseId = courseId;
		this.paymentPaid = paymentPaid;
		this.paymentDue = paymentDue;
		this.date = date;
		this.totalAmount = totalAmount;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public int getPaymentPaid() {
		return paymentPaid;
	}

	public void setPaymentPaid(int paymentPaid) {
		this.paymentPaid = paymentPaid;
	}

	public int getPaymentDue() {
		return paymentDue;
	}

	public void setPaymentDue(int paymentDue) {
		this.paymentDue = paymentDue;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	
	

}
