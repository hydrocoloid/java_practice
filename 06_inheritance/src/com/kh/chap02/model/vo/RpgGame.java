package com.kh.chap02.model.vo;

public class RpgGame extends Game {
	//부모로부터 상복 받은 부분은 기술하지 않는다.
	
	private int maxLevel;
	
	public RpgGame() {}

	public RpgGame(String gameName, String piublisher, int maxLevel) {
		super(gameName, piublisher);
		this.maxLevel = maxLevel;
	}

	protected int getMaxLevel() {
		return maxLevel;
	}

	protected void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
	
	//메소드를 상속 받았는데 발전시키고 싶다? 다시 쓸 수 있음(재정의).
	public String info() {
		return super.info() + " / 최대 레벨: " + maxLevel;
	}

}
