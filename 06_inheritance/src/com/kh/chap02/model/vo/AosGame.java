package com.kh.chap02.model.vo;

public class AosGame extends Game { //public class AosGame extends 상속해주는 클래스명 {
	private int characterCount;

	
	public int getCharacterCount() {
		return characterCount;
	}

	public void setCharacterCount(int characterCount) {
		this.characterCount = characterCount;
	}

	public AosGame(int characterCount) {
		super(); // Game(); = Game클래스의 기본생성자
		this.characterCount = characterCount;
	}

	public AosGame() {
		System.out.println("나는야 자식 클래스");
	}
	

}
