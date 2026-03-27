package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
	
	/* 프로그램 실행 시 발생하는 예외들
	 * NullPointerException: 주소값이 있을 거라 예상하고 객체를 참조했는데 null값이 들어 있을 경우 발생하는 예외.
	 * ArrayIndexOutOfBoundsException: 배열에 부적절한 인덱스로 접근했을 대 발생하는 예외.
	 * ArithmeticException: 나누기 연산을 0으로 나누면 발생하는 예외.
	 * (ClassCastException: 허용할 수 없는 형변환을 진행할 경우 발생하는 예외.)
	 * InputTypeMissmatchException: 입력버퍼의 값이 자료형과 일치하지 않을 때 발생하는 예외.
	 */
	
	//ArithmeticException
	public void divZero() {
		//사용자에게 두 개의 정수값을 입력 받아서 나눗셈 한 뒤 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나누기 프로그램입니다.");
		System.out.print("첫 번째 정수를 입력해주세요 > ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력해주세요 > ");
		int num2 = sc.nextInt();
		
		/*
		if(num2 != 0) { //예외를 원천 차단. 예외 처리는 아님.
		System.out.println("연산 결과: " + (num1/num2));
		} else {
			System.out.println("0은 나누기 연산을 수행할 수 없습니다.");
		}
		*/
		
		//예외처리: 예외 상황을 감지하고 예외 상황 발생 시 프로그램이 비정상적인 종료가 되는 것을 방지하고 적절한 대응 조치를 취하는 모든 절차
		
		/*예외처리 구문
		  	try ~ catch문. 
			try{
			(num1 / num2) 예외가 발생할 수도 있는 구문
			} catch(발생할_수_있는_예외클래스명 변수명){
				해당 예외가 발생했을 때 실행할 구문
			}
		  		 */
		
		try{
			System.out.println("연산 결과: " + (num1/num2));
			System.out.println("나눗셈 완료!");
			} catch(ArithmeticException e){
				System.out.println("0은 나누기 연산을 수행할 수 없습니다.");
			}
		
		sc.close();
		System.out.println("메소드 호출 끝~");
	}
	
	
	public void code() {
		Scanner sc = new Scanner(System.in);
		
				
		while(true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 추가하기");
			System.out.println("2. 삭제하기");
			System.out.println("3. 종료하기");
			System.out.print("메뉴번호를 입력해주세요 > ");
			int menu = 0;
			
			try {
				menu = sc.nextInt(); //int menu는 지역변수. try 블록 내에서만 사용 가능. 블록 밖에서 초기화해줘야 한다.
			} catch(InputMismatchException ime) {
				System.out.println("숫자만 입력해주세요.");
			}
			
			sc.nextLine();
			
			System.out.println(menu + "번 메뉴를 선택하셨습니다.");
			sc.close();
		}
	}
	
	public int multiCatch() {
		Scanner sc = new Scanner(System.in);
		
		//사용자에게 정수값을 하나 입력 받아서 100을 사용자가 입력한 정수값으로 나눈 결과를 출력
		System.out.println("입력하신 정수로 100을 나눗셈 해드립니다.");
		System.out.print("정수를 입력해주세요 > ");
		
		/*
		try {
		int num = sc.nextInt(); // 자료형이 int형이 아닌 값이 들어 올 시 InputMismatchException이 발생.
		sc.nextLine();
		System.out.println("결과: "+(100/num)); //num의 값이 0일 시 ArithmeticException 발생.
		sc.close();
		*/
		/*
		try {
		int num = sc.nextInt(); sc.nextLine();
		System.out.println("결과: "+(100/num)); //num의 값이 0일 시 ArithmeticException 발생.
		} catch(InputMismatchException ime) {
			System.out.println("정수만 입력해주세요.");
		} catch(ArithmeticException ae) {
			System.out.println("0이 아닌 정수를 입력해주세요.");
		}
		*/
		
		try {
			int num = sc.nextInt(); sc.nextLine();
			return (100/num);
			} catch(InputMismatchException ime) {
				return 0;
			} catch(ArithmeticException ae) {
				return 0;
			} finally {sc.close();}
		
		//중복 코드 제거: finally = 리턴하기 직전에 무조건 finally 블록 안 코드부터 수행함.
		
	}
	
	
		public void orderByCatch() {
			
			/*배열
			 * 사용자에게 정수값 입력받아서
			 * 입력받은 만큼의 크기를 가진 배열을 생성 및 할당하고
			 * 배열의 100번째 인덱스에 대입되어있는 기본값을 출력
			 */
			
			Scanner sc = new Scanner(System.in);
			System.out.print("100보다 큰 정수를 입력해주세요 > ");
			
			/*
			try {
			int size = sc.nextInt(); //int형 값이 아닌 값이 입력된다면 -> InputMismatchException
			int[] arr = new int[size]; //음의 정수가 입력된다면 -> NegativeArraySizeException
			System.out.println(arr[100]); //배열의 크기보다 큰 인덱스에 접근하면 -> ArrayIndexOutOfBoundsException
			} catch(InputMismatchException e) {
				System.out.println("정수값을 입력하세요.");
			} catch(NegativeArraySizeException e) {
				System.out.println("양의 정수를 입력하셔야죠.");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("100보다 큰 수를 입력하셔야죠.");
			} finally { 
				sc.close();
			}
			*/
						
			
			try {
			int size = sc.nextInt(); //int형 값이 아닌 값이 입력된다면 -> InputMismatchException
			int[] arr = new int[size]; //음의 정수가 입력된다면 -> NegativeArraySizeException
			System.out.println(arr[100]); //배열의 크기보다 큰 인덱스에 접근하면 -> ArrayIndexOutOfBoundsException
			} catch(RuntimeException e) {
				e.printStackTrace(); // 개발 단계에서만 사용. 오류 추적 메소드.
				System.out.println("정수값을 입력하세요.");
			} finally { 
				sc.close();
			}
			
			
		}
		
		
	

}
