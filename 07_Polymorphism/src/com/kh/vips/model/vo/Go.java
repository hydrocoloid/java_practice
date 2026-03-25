package com.kh.vips.model.vo;

public class Go {
	
	private String name;
	public Go(String name) {
		this.name = name;
	}
	public void cooking() {
		System.out.println(name + " s2 요리 시작");
	}
	public void breaktime() {
		System.out.println(name + " 쉬는 시간!");
	}

}
