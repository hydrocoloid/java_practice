package com.kh.vips.model.vo;

public class MainChef {
	private String name;
	public MainChef(String name) {
		this.name = name;
	}
	public void beefcooking() {
		System.out.println(name + " 고기 굽기 시작합니다.");
	}
	public void breaktime() {
		System.out.println(name + " 쉬는 시간!");
	}

}
