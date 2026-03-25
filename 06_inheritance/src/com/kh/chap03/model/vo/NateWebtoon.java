package com.kh.chap03.model.vo;

public class NateWebtoon {
	private String title;
	private String author;
	
	
	public NateWebtoon(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public NateWebtoon() {
		super();
	}
	protected String getTitle() {
		return title;
	}
	protected void setTitle(String title) {
		this.title = title;
	}
	protected String getAuthor() {
		return author;
	}
	protected void setAuthor(String author) {
		this.author = author;
	}
	@Override //@=Annotation 애노테이션
	public String toString() {
		return "NateWebtoon [title=" + title + ", author=" + author + "]";
	}
	//toString 메소드 생성 단축키: Alt + Shift + S -> s -> Alt + g
	
	/*오버라이딩(Overriding)
	 * 자식클래스에서, 상속 받고 있는 부모클래스의 메소드를 재정의하는 것.
	 * 중요!: 자식클래스에 존재하는 오버라이딩 된 메소드가 우선권을 가져서 호출 됨. 
	  
	 * 오버라이딩 성립 조건!
	 * 1) 부모클래스의 메소드와 메소드명이 동일해야 한다.
	 * 2) 매개변수가 같아야 한다. 자료형, 개수, 순서.
	 * 3) 반환형이 같아야 함.
	 * 4) 부모메소드의 접근제한자보다 공유 범위가 같거나 넓어야 함.
	 * 5) 암묵적 약속: 오버라이딩한 메소드에는 반드시 애노테이션 @override를 붙여 주자~.
	 * -> 애노테이션이 존재하지 않더라도 오버라이딩 구현에는 문제가 없음.
	 * -> 하지만 누가 봐도 오버라이딩임을 알 수 있도록 붙여 줌. + 실수를 줄여 줌.
	 *  
	 */

}
