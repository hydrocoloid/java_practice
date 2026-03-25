package com.kh.chap03.model.vo;

public class Webtoon {
	private String title;
	private String author;
	private String day;
	
	public Webtoon() { //기본생성자
		super();
	}
	public Webtoon(String title, String author, String day) { //모든 필드를 매개변수로 갖는 생성자
		super();
		this.title = title;
		this.author = author;
		this.day = day;
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
	protected String getDay() {
		return day;
	}
	protected void setDay(String day) {
		this.day = day;
	}
	
	
	public String info() {
		return "웹툰 정보 = [웹툰 제목: " + title + " / 작가: " + author + " / 업로드: " + day + "]";
	}
	

}
