package com.kh.vips.model.vo;

public class Chef {
	private String name;
	private String getName;
	public Chef(String name) {
		this.name = name;
	}
	public void cooking() {
		System.out.println("요리 시작합니다.");
	}
	public void breaktime() {
		System.out.println("요리 끝!");
	}
	
	public String getName() {
		return name;
	}



}
