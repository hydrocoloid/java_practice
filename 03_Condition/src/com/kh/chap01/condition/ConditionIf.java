package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionIf {

	/*(단일) if문 <- 평생 써먹는다!!
	 * 식: if(조건식) {조건식이 true일 경우 실행하고자 하는 코드;}
	 * 조건식의 결과값이 true일 경우: if문 Scope 안의 코드가 수행.
	 * 조건식의 결과값이 false일 경우: if문 Scope를 건너 뜀.
	 * 조건검사: 조건식의 결과값이 t/f인지 검사.
	 * if문의 조건식 자리에는 true나 false가 들어가도록 만들어야 함.
	 */

	public void method1() {
		//System.out.println("잘 출력되니?");
		
		if(0<1) {
			System.out.println("0은 1보다 작습니다.");
		}
		
		if(true) {
			System.out.println("true면 수행된다.");
		}
		
		if(false) {
			System.out.println("false면 수행되지 않는다.");
		} //dead code
		
	}
	
	public void quiz() {
		/* 1. 문제를 출력
		 * 2. 사용자에게 o, x를 입력 받아서
		 * 3. 정답입니다~ / 오답입니다~를 출력
		 */
		System.out.println("문제: 고양이는 호랑이과일까요?");
		System.out.print("(O 또는 X로 기입해주세요~) > ");
		Scanner sc = new Scanner(System.in);
		char answer = sc.nextLine().charAt(0);
		
		//1. 무슨 값을 가지고: 사용자가 입력한 값 = answer
		//2. 무슨 연산을 하지?: == (동등비교 연산)
		
		if(answer == 'x' || answer == 'X') {System.out.println("정답입니다~");}
		//if(answer == 'X') {System.out.println("정답입니다~");}
		//코드의 중복이 발생 -> 유지 보수를 어렵게 함. -> 중복을 제거해주면 좋음.
		if(answer == 'o' || answer == 'O') {System.out.println("오답입니다~");}
		//if(answer == 'O') {System.out.println("오답입니다~");}
		if(answer != 'x' && answer != 'X' && answer != 'o' && answer != 'O') {System.out.println("O 또는 X를 입력해주세요.");}
		//if(!(answer == 'x' || answer == 'X' || answer == 'o' || answer == 'O')) {System.out.println("O 또는 X를 입력해주세요.");}
		
		//총 몇 문제 풀었고, 정답 몇 개, 오답 몇 개 -> 세 가지를 출력!
		//출력이 목표 <- 출력하려면 저장해야 한다. <- 어디에 저장? 변수라는 공간에. 
		int count = 0;
		int wrongCount = 0;
		
		System.out.println("문제: 여우는 개과일까요?");
		System.out.print("(O 또는 X로 기입해주세요~) > ");
		answer = sc.nextLine().charAt(0);
		if(!(answer == 'x' || answer == 'X' || answer == 'o' || answer == 'O')) {System.out.println("O 또는 X를 입력해주세요.");}
		
		if(answer == 'x' || answer == 'X') {System.out.println("오답입니다~");}
		count++;
		if(answer == 'o' || answer == 'O') {System.out.println("정답입니다~");}
		wrongCount++;
		
		System.out.printf("퀴즈 끝~!! 정답 %d개, 오답 %d개 입니다!", count, wrongCount);
		
		//경우의 수 사용자가 입력한 값이 o, O, x, X가 아닌 경우 ---> 빠짐
		//O 또는 X를 입력해주세요.
		//1. 무슨 값을 가지고 -> 사용자가 입력한 값 = (answer)
		//2. 무슨 연산을 할 것인가.
		
		sc.close();
	}
	
}
