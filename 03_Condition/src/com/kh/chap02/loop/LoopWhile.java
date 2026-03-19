package com.kh.chap02.loop;

public class LoopWhile {
	
	/*while문: 조건식 결과값이 true일 경우 반복적으로 실행하고자 하는 코드를 실행;
	 
	 초기식; 
	 while(조건식){
	 반복적으로 실행하고자 하는 코드;
	 증감식; (필수는 아님)
	 }
	 
	 for와 while의 차이
	 for: 개발자가 반복을 몇 번 해야 할 지 명확하게 일고 있는 경우.
	 while: 개발자가 반복을 몇 번 해야 할 지 명확하게 일고 있지 않은 경우.
	 */
	
	public void method1() {
		
		//초기식 조건식 증감식
		int i = 0; //초기식
		while(i<3) { //조건식
			System.out.println("i가 3보다 작다.");
			i++; //증감식
		}
		
	}
	
	public void method2() {
		
		System.out.println("1부터 10까지 더하는 방법?");
		System.out.println("1. +연산자로 깔끔하게 끝낸다.");
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		System.out.println();
		
		System.out.println("2. while문을 쓴다.");
		int i = 1; //초기식
		int sum1 = 0;
		while(i<=10) { //조건식
			sum1 += i;
			i++; //증감식
		}
		System.out.println(sum1);
		System.out.println();
		
		System.out.println("3. for문을 쓴다.");
		int sum2 = 0;
		for(int j = 1; j <= 10; j++) {
			sum2 += j;
			}
		System.out.println(sum2);
		System.out.println();

	}
	
	
	public void method3() {
		/*1부터 10 사이의 임의의 정수까지를 모두 더한 합계를 출력해보자.
		math라는 클래스가 가지고 있는 random() 메소드를 호출해서 만들어 볼 계획.
		
		Math.random()의 결과값은 0.0부터 0.999999999999
		1~10 사이의 값을 도출하려면 *10을 해줘야지.
		
		하지만 목표는 실수가 아니라 정수. int형으로 강제 형변환 해줘야 한다.
		그러면 0~9의 값이 나오기 때문에 정수값 1을 더해주자. 
		*/
		
		//Math.random(); <= math라는 클래스의 random이란 메소드를 호출할 때는 이렇게 한다.
		double number = Math.random(); // math라는 클래스의 random이란 메소드를 통해 도출되는 값을 double이란 변수 공간에 저장.
		System.out.println((int)(number*10)+1);
		
	}

	
	public void lotto() {
		
		int num1 = (int)(Math.random()*45+1);
		int num2 = (int)(Math.random()*45+1);
		int num3 = (int)(Math.random()*45+1);
		int num4 = (int)(Math.random()*45+1);
		int num5 = (int)(Math.random()*45+1);
		int num6 = (int)(Math.random()*45+1);
		System.out.printf("%d, %d, %d, %d, %d, %d", num1, num2, num3, num4, num5, num6);
		
		


		
	}
}
