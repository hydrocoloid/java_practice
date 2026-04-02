package com.kh.chap02.model;

public class Box<T> { //T는 아무 의미 없다. 뭘 적든 괜찮아...? ㄴㄴ. 암묵적 약속 존재.
			//E -> Element: 요소로 적을 때는 E로 적자.
			//T -> Type: 아무 타입이나 오케이
			//K -> Key: 맵의 키 타입.
			//V -> Value: 맵의 밸류값.
			//N -> Number: 숫자 타입.
			//R -> Return: 반환 타입.
	
	private T item;
	public void set(T item) {this.item = item;}
	public T get() {return item;}
	
}
