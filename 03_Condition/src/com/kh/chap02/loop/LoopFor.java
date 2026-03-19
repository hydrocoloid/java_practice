package com.kh.chap02.loop;

import java.util.Scanner;

import com.kh.chap01.condition.ConditionIf;

public class LoopFor {

	public void method0() {
		
		/*for문:
		 * 표현식: for(초기식; 조건식; 증감식){반복적으로 실행하고자 하는 코드}
		
		예시:
		for(int i = 0; // 초기화
		i < 100; 
		i++) 
		{
			System.out.print(i+1);
			System.out.println("회 반복");
		}
		
		if의 조건문()에는 논리값이 들어가고, switch의 조건문에는 비교할 값이 들어 간다.
		for의 조건문에는 초기식; 조건식; 증감식 세 가지의 요소로 구성됨.
		1)초기식: 반복문을 시작할때 초기에 단 한 번만 실행될 구문. 반복할 때 필요한 변수를 선언하고 초기화하는 구문(제어변수).
		2)조건식: 반복문이 실행될 조건을 작성하는 구문. 조건식의 결과값이 true이면 실행, false이면 반복을 멈추고 for문을 빠져 나옴.
		3)증감식: 반복문을 제어하는 변수에 대입된 값을 증감하는 구문. 	=> 대개 초기식에서 선언된 변수를 가지고 증감식 작성. 보편적으로 증감연산자를 사용함. 
		 
		리터럴: 메모리 어딘가에 있어서 불러 올 수 있지만 어딨는지는 알 수 없는 값?
		
		구동 순서:
			for(1번 int i = 0; // 초기화고, 다시는 호출되지 않음.
			2번 i < 100; => 2번의 결과가 true이면 {}안의 코드로 감. = 3번.
			4번 i++ => 4번이 종료되면 '무조건' 2번으로 리턴.) 
			{
				3번 System.out.print(i+1); =>4번으로.
			}
			*/
		
		for(int i = 0; i < 100; i++) {
			System.out.print(i+1);
			System.out.println("회 반복");
		}

	}
	
	public void method1() {
		//드래그 -> Ctrl + /
		//제어변수는 보통 i, j, k 쓴다.
		System.out.println("println 세 번 사용");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		System.out.println("개행문자 사용");
		System.out.println("1\n2\n3");
		
		System.out.println("for문 사용");
		for(int i = 1; i <= 3; i++) {
			System.out.println(i);}
	}
	
	public void evenNumbers() {
		
		System.out.println("10회 반복 후 짝수 찾기)");
		for(int i = 1; i < 10; i++) {
			if(i%2 == 0) {
			System.out.println(i);
			}
		}
		
		System.out.println("2씩 증가시키기");
		for(int i = 2; i < 10; i += 2) {
		    System.out.println(i); // 2, 4, 6, 8 출력
		}
		
	}
	
	public void gugudan() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*구구단을 외우자*");
		System.out.print("몇 단을 검색해볼까요? > ");
		int dan = sc.nextInt();
		System.out.println(dan + "단을 출력하겠습니다.");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan+"X"+i+"="+(dan*i));
			}
		
		sc.close();
		
	}
		
		
	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		
			for(;;) {
				System.out.println("메인메뉴입니다");
				System.out.println("1. 구구단 놀이 시작하기");
				System.out.println("2. OX퀴즈 시작하기");
				System.out.println("3. 프로그램 종료하기");
				
				System.out.print("메뉴를 선택해주세요 > ");
				int menuNo = sc.nextInt();
				sc.nextLine();
				
				if(menuNo==1) {
					gugudan();
					
				} else if(menuNo==2){
					ConditionIf ci = new ConditionIf();
					ci.quiz();
				} else if(menuNo==3) {
					System.out.println("프로그램을 종료합니다.");
					return;
					
				} else {
					System.out.println("없는 메뉴 번호입니다.");
				}
			}
			
	}
			
}
