package com.kh.chap02.run;

import com.kh.chap02.model.vo.AosGame;
import com.kh.chap02.model.vo.FpsGame;
import com.kh.chap02.model.vo.RpgGame;

public class Run {

	public static void main(String[] args) {
		
		AosGame ag = new AosGame();
		ag.setGameName("롤");
		System.out.println(ag.getGameName());
		
		FpsGame fg = new FpsGame("배그","크래프톤",50);
		//fg.setGameName("배그");
		System.out.println(fg.info());
		
		RpgGame rg = new RpgGame("와우","블리자드",50);
		//fg.setGameName("배그");
		System.out.println(rg.info());
		//자식클래스에 메소드를 재정의 했을 경우
		//자식클래스에 재정의한 메소드가 우선권을 가져서 호출됨!! (매우 중요!)

	}

}
