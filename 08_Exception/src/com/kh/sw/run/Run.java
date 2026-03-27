package com.kh.sw.run;

import com.kh.sw.view.SwitchView;

public class Run {

	public static void main(String[] args) {
		
		new SwitchView().menu();
		
		
	}

}


/*1절
실행 클래스: Run - 메인 메소드
스위치뷰 클래스: 스위치 메뉴 메소드 - 스위치 온오프 입출력(print, 스위치 누르기 입력 -> 컨트롤러 클래스 호출).
스위치 컨트롤러 클래스: 컨트롤러 + 서비스. 켜 있으면 끄고, 꺼져 있으면 켜고.
스위치vo 클래스: 필드- 불린타입 true면 켜지고, false면 꺼지게.
스위치서비스 인터페이스: toggle(켰다 껐다)

2절
껐다 켰다 하는데 10% 확률로 고장(확률 시스템 필요) -> 프로그램이 강제 종료.
*/