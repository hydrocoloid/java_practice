package com.kh.chap02.model.vo;

public class FpsGame extends Game {
	  //public class AosGame extends 상속해주는 클래스명 {
		private int stress;
		
		public FpsGame() {}
		public FpsGame(String gameName, String publisher, int stress) {
				
				super(gameName, publisher);
				//부모 클래스의 생성자를 호출 = super();
				//setGameName(gameName);
				//setPublisher(publisher);
				this.stress = stress; //쉬운 방법
			}
		

		public FpsGame(int stress) {
			super();
			this.stress = stress;
		}

		protected int getStress() {
			return stress;
		}

		protected void setStress(int stress) {
			this.stress = stress;
		}

}
