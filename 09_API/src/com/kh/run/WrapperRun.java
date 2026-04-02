package com.kh.run;

public class WrapperRun {

	public static void main(String[] args) {
		
		/* Wrapper Class: 기본자료형을 참조자료형으로 포장하는 클래스.
		 * boolean -> Boolean
		 * char -> Char
		 * byte -> Byte
		 * short -> Short
		 * int -> Integer
		 * long -> Long
		 * float -> Float
		 * double -> Double
		 */
		
		/* Wrapper Class의 이론적 쓰임: 
		 * 1) 기본자료형을 객체로 취급해야 하는 경우에 씀.
		 * 2) 다형성을 적용해야 하는 경우
		 * 3) 매개변수 자료형이 기본자료형은 못 받는 경우.
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		/*The constructor Integer(int) has been deprecated since version 9 and marked for removal: Integer(int) 생성자는 버전 9부터 사용이 권장되지 않으며 삭제될 예정입니다.
		Integer i1 = new Integer(num1);
		System.out.println(i1);
		*/
		
		Integer i1 = num1;
		Integer i2 = num2;
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); // a.compareTo -> a가 b보다 크면 1 반환, a가 b보다 작으면 -1을 반환, a와 b가 같으면 0 반환.
		
		
		
		//파싱(Parsing): 특정 데이터를 일정 규칙에 따라 분석하고 해석하는 과정.
		String str1 = "11";
		String str2 = "1.1";
		System.out.println(str1 + str2); // 12.1이 아니라 111.1이 나옴.
		
		//해당 Wrapper클래스이름.parseXXX(데이터);
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		System.out.println(i + d); //12.1
		
		String intNum = String.valueOf(i);
		

	}

}
