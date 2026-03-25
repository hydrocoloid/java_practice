package com.kh.chap03.model.vo;

public class MainChef extends Chef {

	public MainChef(String name) {
		super(name);
	}
	
	@Override
	public void cooking() {
		System.out.println("고기 요리합니다!");
	}

}
