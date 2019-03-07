package com.ait.sad.model;

import java.sql.Date;

public class MemoBuilder {

	private String topic;

	private String detail;

	private String name;

	private Date dateCreate;

	private Date dateUpdate;
 
	private Date dateRemind;
	 
	public MemoBuilder() {

	}

	public MemoBuilder setTopic(String topic) {
		this.topic = topic;
		return this;
	}

	public MemoBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public MemoBuilder setDetail(String detail) {
		this.detail = detail;
		return this;
	}

	public MemoBuilder setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
		return this;
	}

	public MemoBuilder setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
		return this;
	}
	
	public MemoBuilder setDateRemind(Date dateRemind) {
		this.dateRemind = dateRemind;
		return this;
	}

	public Memo build() {
		Memo memo = new Memo();
		memo.setTopic(this.topic);
		memo.setDetail(this.detail);
		memo.setName(this.name);
		memo.setDateCreate(this.dateCreate);
		memo.setDateUpdate(this.dateUpdate);
		memo.setDateRemind(this.dateRemind);
		
		return memo;
	}
}
