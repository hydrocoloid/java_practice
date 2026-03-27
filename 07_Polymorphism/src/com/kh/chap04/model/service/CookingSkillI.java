package com.kh.chap04.model.service;

public interface CookingSkillI {
	
	int NUM = 1; //값이 변하면 안 돼. 상수 선언. 바로 초기화해줘야 함.
	
	void makeDopbap(); 
	
	
	
	default void close() {
		System.out.println("가게 문 닫습니다~");
	}

}
