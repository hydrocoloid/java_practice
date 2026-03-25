package com.kh.chap03.controller;

public class Pasta extends Cooking {
	
	private void pastaCooking() {
		System.out.println("파스타 요리~");
	}
	
	private void boilingWater() {
		System.out.println("물 끓이고 소금 넣고 오일 넣자~");
	}
	
	private void fire() {
		System.out.println("볶자~");
	}
	
	@Override
	public void cooking() {
		pastaCooking();
		boilingWater();
		fire();
	}

}
