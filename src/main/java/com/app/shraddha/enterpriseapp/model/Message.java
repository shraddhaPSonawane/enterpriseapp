package com.app.shraddha.enterpriseapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="msg")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer msgId;
	
	private String msg;

	public Integer getMsgId() {
		return msgId;
	}

	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Message(Integer msgId, String msg) {
		super();
		this.msgId = msgId;
		this.msg = msg;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
