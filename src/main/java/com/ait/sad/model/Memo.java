package com.ait.sad.model;

import java.sql.Date;

public class Memo {

	private String topic;

	private String detail;

	private String name;

	private Date dateCreate;

	private Date dateUpdate;

	private Date dateRemind;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Date getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateRemind() {
		return dateRemind;
	}

	public void setDateRemind(Date dateRemind) {
		this.dateRemind = dateRemind;
	}

}
