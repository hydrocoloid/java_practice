package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionElse {
	
	/*if ~ else <- 실과 바늘
	 * 식: if(조건식){조건식의 결과가 true일 경우 실행할 코드;}
	 		else{조건식의 결과가 false일 경우 실행할 코드;}
	 * if문의 조건식 결과가 참이면 else Scope를 건너 뜀, 거짓이면 if Scope를 건너 뛰고 else Scope로 진입. -> 불필요한 연산 줄어들어 처리 속도 향상. 
	 */

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("핸드폰 번호 뒤의 네 자리를 입력해주세요 > ");
		String phoneNumber = sc.nextLine();
		//System.out.println(phoneNumber);
		
		if(phoneNumber.equals("7777")) {System.out.println("오 당첨입니다~~!!!");}
		//문자열 값을 비교하고 싶을 때: == 동등비교연산자는 기본타입 자료형 8개끼리만 가능하기 때문에 equals()라는 메소드를 호출해서 비교해야 함.
		else {System.out.println("앗 낙첨입니다..");}
		//if(!(phoneNumber.equals("7777"))) {System.out.println("앗 낙첨입니다..");}와 동일.
		
		sc.close();
	}
	
	
	public void method2() {
	
	/*if ~ else if 
	 * 식: if(조건식1){조건식1의 결과가 true일 경우 실행할 코드;}
	 		else if(조건식2){조건식2의 결과가 true일 경우 실행할 코드;}
	 		else if(조건식3){조건식3의 결과가 true일 경우 실행할 코드;}
	 		else{기술한 모든 조건들이 false일 경우 실행할 코드;}
	 * if문의 조건식 결과가 참이면 else Scope를 건너 뜀, 거짓이면 if Scope를 건너 뛰고 else Scope로 진입. -> 불필요한 연산 줄어들어 처리 속도 향상. 
	 */
	
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 번호 뒤의 네 자리를 입력해주세요 > ");
		String phoneNumber = sc.nextLine();
		
		String message = "등 당첨입니다~~!!!";
		if(phoneNumber.equals("7777")) {
			System.out.println(phoneNumber + "은(는) 1" + message);
			} else if(phoneNumber.equals("6666")) {
				System.out.println(phoneNumber + "은(는) 2" + message);	
			} else if(phoneNumber.equals("5555")) {
				System.out.println(phoneNumber + "은(는) 3" + message);
			} else {
				System.out.println("다음 기회에...");
			}
		
		sc.close();
	}
	
	public void ageCheck() {
		
		/*조건
		 *1) 사용자에게 나이를 입력 받음.
		 *2) 나이에 따라 각기 다른 내용을 출력.
		 *3) 1~12: 어린이입니다. / 13~17: 청소년입니다. / 18~: 성인입니다.
		 *4) 0, 음수 등: 잘못 입력하셨습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 > ");
		int age = sc.nextInt();
		//System.out.println(age);
		
		/*ver_1.0
		if(1 <= age && age <= 12) {
			System.out.println("어린이입니다.");
		} else if(13 <= age && age <= 17) {
			System.out.println("청소년입니다.");
		} else if(18 <= age) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		} */
		
		//ver_2.0
		if(age <= 0) {
			System.out.println("잘못 입력하셨습니다.");
		} else if(18 <= age) {
			System.out.println("성인입니다.");
		} else if(age <= 12) {
			System.out.println("어린이입니다.");
		} else {
			System.out.println("청소년입니다.");
		}
		
		sc.close();
	}
	
}
