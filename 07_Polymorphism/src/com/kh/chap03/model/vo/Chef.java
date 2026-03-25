package com.kh.chap03.model.vo;

public abstract class Chef {
	/* 클래스 내부에 추상메소드를 하나라도 선언하는 순간, 클래스 또한 abstract 키워드를 붙여서 추상 클래스로 정의해야 함.
	 * 추상클래스 == 필드 + 메소드 + 추상메소드(생략가능) -> 추상메소드가 존재하지 않아도 추상클래스로 정의할 수 있음. 
	 * 구현 도중 해당 클래스를 구체적으로 구현된 상태는 아닌 것 같다 생각 들면 추상클래스로 선언.
	 * 이 클래스는 부모클래스 역할만 할 것이고 객체 생성은 불가능 해야 한다 생각 들면 추상클래스로 선언.
	 */
	
	
	private String name;
	public Chef(String name) {
		this.name = name;
	}
	public abstract void cooking(); //이 메소드는 자식클래스들이 오버라이딩 하게 만드는 목적. -> 추상화: 추상(abstract) 메소드 
		
	public void breakTime() {}

	
	/* 추상화: 추상(abstract) 메소드 <-> 구현(implement)
	 * public void 사이에 abstract 추가
	 * 하지만 추상 메소드는 추상 클래스 내에서만 생성 가능. -> public class 사이에 abstract 추가.
	 * 추상 클래스가 되면 객체 생성 불가. 하지만 다형성은 적용 할 수 있다.
	 */
}
