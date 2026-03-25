package com.kh.chap03.model.vo;

public class NaverWebtoon extends Webtoon {
		private String payment; //필드(멤버 변수) 선언: 부모클래스에는 없는 자식클래스 고유의 필드값을 대입하기 위한 공간 마련.
		
		
		//생성자는 상속이 안 된다! -> 자식 클래스에서도 기본생성자 만들어줘야 함.
	public NaverWebtoon() { //기본생성자: 객체를 "빈 상태"로 생성할 때 호출됩니다.
	}

	public NaverWebtoon(String title, String author, String day, String payment) { //모든 필드를 매개변수로 갖는 생성자
		super(title, author, day); //부모 생성자 호출: 부모(Webtoon) 클래스에 이미 만들어둔 생성자를 재사용하는 문장.
		this.payment = payment; //자식 필드 초기화: 부모가 처리하지 못하는 NaverWebtoon만의 고유 필드인 payment를 자기 자신(this)의 변수에 저장합니다.
		//역할: 객체를 만듦과 동시에 제목, 작가, 요일, 결제정보까지 한 번에 세팅하기 위한 생성자입니다.
	}
	
	/*
	Getter / Setter 메서드
	protected String getPayment() { return payment; } / protected void setPayment(...)
	역할: private으로 잠가둔 payment 변수에 안전하게 접근하거나 값을 수정하기 위한 통로입니다. 
	protected를 써서 같은 패키지나 상속 관계에 있는 클래스들까지만 접근을 허용했습니다.
	*/

	protected String getPayment() {
		return payment;
	}

	protected void setPayment(String payment) {
		this.payment = payment;
	}
	
	
	

}
