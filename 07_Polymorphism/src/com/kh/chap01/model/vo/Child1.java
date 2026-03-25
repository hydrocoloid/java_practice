package com.kh.chap01.model.vo;

public class Child1 extends Parent {
	private int n;

	public Child1() {	}

	public Child1(int n) {
		this.n = n;
	}
	
	public void printChild1() {
		System.out.println("자식클래스1 메소드입니다.");
	}
	
	@Override
    public void print() { //반환하는 자료형, 매개변수, 메소드 식별자 등 모두 부모클래스와 동일해야 한다!!
        System.out.println("Child1의 print메소드!");
    }
	
	

}
