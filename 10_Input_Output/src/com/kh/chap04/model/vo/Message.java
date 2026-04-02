package com.kh.chap04.model.vo;

import java.io.Serializable;

public class Message implements Serializable{ //직렬화
	
	private String content;
	private String to;
	
	public Message() {
	}
	
	public Message(String content, String to) {
		super();
		this.content = content;
		this.to = to;
	}
	
	public String getContent() {
		return content;
	}
	public String getTo() {
		return to;
	}

	@Override
	public String toString() {
		return "Message: " + content + to;
	}
	
	

}
