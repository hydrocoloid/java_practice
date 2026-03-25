package com.kh.chap03.model.vo;

public class KakaoWebtoon extends Webtoon {
	private boolean free;
	
	

	public KakaoWebtoon(String title, String author, String day, boolean free) {
		super(title, author, day);
		this.free = free;
	}

	public KakaoWebtoon() {
	}

	protected boolean isFree() {
		return free;
	}

	protected void setFree(boolean free) {
		this.free = free;
	}

}
