package com.kh.variable;

import java.util.Scanner;

public class InputKeyBoard {

		/* 키보드를 이용해서 사용자에게 값을 입력 받기.
		 * 자바에서 제공하는 Scanner라는 클래스를 사용. -> 메소드를 호출해서.
		 */

	public void inputTest() {
		
		Scanner sc = new Scanner(System.in);
		// System.in: 표준 입력 도구에서 입력하는 값들을 받겠음(바이트 단위).
		
		System.out.println("피자핫에 오신 것을 환영합니다~!");
		System.out.println("--------핏자핫 메뉴판--------");
		System.out.println("치즈/페페로니 핏자");
		System.out.println("블랙 ㅂㅂㅋ 스테이크 뇨끼 핏자");
		System.out.println("이재모 핏자");
		System.out.println("--------------------------");
		System.out.print("주문하실 메뉴를 기입해주세요 > ");
		
		// next(): 사용자가 입력한 값중 공백문자가 있을 경우 공백문자 이전까지만 입력 받음.
		//.은 "직접접근".
		//sc.next();
		// nextLine(): 공백과 무관하게 개행문자(줄바꿈문자) 이전까지 전체를 다 읽어오는 기능.
		
		/*사용자가 어떤 값을 입력하든 입력값을 화면상에 출력해보자.
		 * 입력 -> 저장(변수라는 공간에) -> 출력
		 */
		
		String select = sc.next();
		System.out.println(select + "을(를) 주문하셨습니다.");
		
		//개수: 몇 판이오?
		System.out.print("몇 판 주문하시겠습니까? > ");
		int pizzaNumber = sc.nextInt();
		System.out.println(select + " " + pizzaNumber + "판 주문하셨습니다.");
		
		
		//주소
		//입력버퍼에 남아 있는 개행문자를 날려주어야 함.
		
		System.out.print("배달 받으실 주소를 기입해주세요 > ");
		sc.nextLine(); //입력버퍼에 남아 있는 개행문자를 날려주는 역할.
		String address = sc.nextLine();
		System.out.println(address + "(으)로 배달합니다.");
		
		sc.close(); //스캐너 종료.
	} //블록스코프 끝
	

} // 프로그램 종료.