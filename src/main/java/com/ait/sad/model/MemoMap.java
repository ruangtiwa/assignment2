package com.ait.sad.model;

import java.sql.Date;

public class MemoMap {
	public String topic;

	public String detail;

	public String name;

	public String dateCreate;

	public String dateUpdate;

	public String dateRemind;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(String dateCreate) {
		this.dateCreate = dateCreate;
	}

	public String getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(String dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public String getDateRemind() {
		return dateRemind;
	}

	public void setDateRemind(String dateRemind) {
		this.dateRemind = dateRemind;
	}

}
