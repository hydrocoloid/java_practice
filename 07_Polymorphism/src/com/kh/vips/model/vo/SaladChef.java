package com.kh.vips.model.vo;

public class SaladChef {
	private String name;
	public SaladChef(String name) {
		this.name = name;
	}
	public void saladcooking() {
		System.out.println(name + " 샐러드 요리 시작합니다.");
	}
	public void breaktime() {
		System.out.println(name + " 쉬는 시간!");
	}


}
