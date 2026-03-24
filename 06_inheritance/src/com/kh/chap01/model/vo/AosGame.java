package com.kh.chap01.model.vo;

public class AosGame {
	private String gameName;
	private String publisher;
	private int characterCount;
	public AosGame() {
	}
	public AosGame(String gameName, String publisher, int characterCount) {
		this.gameName = gameName;
		this.publisher = publisher;
		this.characterCount = characterCount;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getCharacterCount() {
		return characterCount;
	}
	public void setCharacterCount(int characterCount) {
		this.characterCount = characterCount;
	}
	
	// 기본생성자, 매개변수 생성자, 게터, 세터
	// 기본생성자 단축키: Alt + Shift + s -> o -> Alt + d -> Alt + g
	// 모든 필드를 매개변수로 갖는 생성자: 기본생성자 단축키: Alt + Shift + s -> o -> Alt + g
	// 게터 세터 생성 단축키: Alt + Shift + s -> r -> Alt + a -> Alt + r
	
	public String info() {
		return "게임정보 = [게임명: " + gameName + " / 운영사: " + publisher + " / 캐릭터 수: " + characterCount + "]";
	}

}
