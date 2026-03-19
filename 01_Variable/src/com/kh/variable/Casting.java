package com.kh.variable;

public class Casting {  // 오늘의 학습 목표
	
	public void autoCasting() {
	
	/*Type Casting(자료형 변환 / 형변환) <- 매우 중요!!
	 * = 자료형을 바꾸는 개념
	 */

	/* 자바에서 값을 처리하는 규칙
	 * 1. 대입 연산자(=)를 기준으로 좌우항이 같은 자료형이어야 한다. = 같은 자료형에 해당하는 리터럴값만 대입 가능하다.
	 * 자료형이 다를 경우엔 값을 바꿔서 대입해야 한다.
	 * 2. 같은 자료형들끼리만 연산 가능하다.
	 * 자료형이 다른데 연산이 너무 하고 싶다? 둘 중 하나를 형변환하여 같은 자료형으로 맞춰줘야 함.
	 * 3. 연산의 결과물은 동일한 자료형이다.
	 * 정수 + 정수 = 정수 / 실수 + 실수 = 실수
	 */
	
	/*형변환 방법: (바꾸고 싶은 자료형)값;
	 * 형변환연산자 / cast 연산자
	 */
	
	/*형변환의 종류
	 * 1. 자동형변환(Promotion): 자동으로 형변환이 진행됨. ex) 작은 크기의 자료형을 큰 크기의 자료형으로 변환하는 경우.
	 * 2. 강제현변환(Type Casting): 자동형변환이 되지 않는 경우 강제로 형변환시킴. -> (자료형)을 통해 진행.
	 */
	
	/*boolean: 1Byte
	 *char: 2Byte
	 *byte: 1Byte
	 *short: 2Byte
	 *int: 4Byte
	 *long: 8Byte
	 *float: 4Byte
	 *double: 8Byte
	 */
	
	/*double d1 = 0.3;
	double d2 = 0.7;
	double sum = d1+d2;
	
	System.out.println(sum);
	*/
	
	System.out.println("이 내용을 콘솔창에 출력해보세요 실습 시작!");
		
	/*1. int(정수) -> double로 형변환.
	 * 변수 선언과 동시에 초기화 먼저. */
	 int num = 7;
	 System.out.println(num);
	 
	 double dNum = /*(double)*/ num; //형변환 방법: (바꾸고 싶은 자료형)값;
	 System.out.println(dNum);
	 /*방법1: 변수 자료형을 바꾸거나
	  * 방법2: 값의 자료형을 바꾸거나
	  * 방법3: 둘 다 바꾸거나.
	  */
	 System.out.println(num);
	 
	 //2. int -> long으로 변환.
	 int bigNum = 120;
	 long smallLong = bigNum;
	 System.out.println(smallLong);
	 
	 //3. long -> float (특이케이스)
	 long longNum = 1000L;
	 //int i = longNum; => Type mismatch: cannot convert from long to int
	 float floatNum = longNum;
	 System.out.println(floatNum);
	 //float이 longNum을 표현할 수 있는 이유: 4Byte float형이 long형보다 표현할 수 있는 값의 범위가 넓기 때문.
	 
	 //4. char <-> int
	 char ch = 'a';
	 System.out.println(ch);
	 int chNum = ch;
	 System.out.println(chNum);
	 char ch2 = 97;
	 System.out.println(ch2);
	 
	 //퀴즈를 풀어봅시다.
	 System.out.println("----퀴즈쇼----");
	 System.out.println('a');
	 System.out.println((int)'a');
	 System.out.println('a'+3); // char: 2Byte가 int: 4Byte로 변환되어 들어 감.
	 System.out.println('a'+'3'); // 정수와 정수의 연산. '3'가 (int)51로 변환되어 대입.
	 System.out.println((int)'3'); // 아스틱코드에 따라 '3'은 정수 51로 변환됨.
	 System.out.println('a'+"3"); // 문자열이 포함된 연산은 문자열로 변환됨.
	 System.out.println('3'); 
	 System.out.println((char)'3'+(char)3); // (char)'3'은 (int)51이 됨. (char)3는 3.
	 
	 //Byte = 8bit -> 2^8자리는 +-표현 -> -128~127 (256가지 표현)
	 byte byteNum = (byte)128;
	 System.out.println(byteNum); 
	 
	 byte b2 = 126;
	 byte b3 = 3;
	 System.out.println(b2+b3); 
	 //결과값은 int형 = 연산장치가 값을 처리하는 크기가 int형 크기(4Byte)이기 때문
	 
	 //비교연산자(==): 좌우항의 값을 비교하여 결과값을 반환.
	 System.out.println("------------------");
	 System.out.println("비교연산자를 사용해보자.");
	 System.out.println(1==2);
	 System.out.println('a'=='b');
	 System.out.println(2==(int)'2');
	 System.out.println((char)2=='2');
	 System.out.println((int)'2'=='2');
	 
	 /*강제 형 변환: 큰 크기의 자료형을 작은 크기의 자료형으로 변환. (명시적 형 변환이라고도 함.)
	  * 방법: (바꿀 자료형)값*/
	 
	 double dNum1 = 10.123123;
	 int iNum = (int)dNum1;
	 System.out.printf("%.0f%n", dNum1);
	 System.out.println(iNum);
	 
	 double balance = 1234567.89;
	 System.out.printf("잔액: %,.2f원", balance); 
	 // 결과: 잔액: 1,234,567.89원 (소수점 2자리까지)
	 
	}

}