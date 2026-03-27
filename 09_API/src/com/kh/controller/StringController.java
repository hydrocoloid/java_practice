package com.kh.controller;

public class StringController { //String 클래스의 특징이 뭔가요? 불변입니다. immutable.
	
	public void method1() {
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.toString()); // String클래스는 object클래스의 후손. toString()클래스는 String클래스 내에서 오버라이딩.
		// 1. String클래스의 toString()의 경우 실제 담겨 있는 문자열 value값을 반환하게끔 오버라이딩.
		
		//equals() -> String클래스에서 equals 메소드 오버라이딩 했구나.
		System.out.println(str1.equals(str2));
		// 2. 문자열 value를 비교하도록 오버라이딩
		
		//hashcode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("Hello".hashCode()); //String클래스에서 hashcode 메소드를 오버라이딩.
		//3. 주소값을 해싱하는 것이 아니라 실제 담긴 문자열값을 기반으로 해생하게 오버라이딩.
		
		//System.identityHashCode(참조형변수);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		//동등연산자 때려 버리기
		System.out.println(str1 == str2);
	}
	
	
	public void method2() {
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		//toString()
		System.out.println(str1);
		System.out.println(str2);
		
		//equals()
		System.out.println(str1.equals(str2));
		
		//hashcode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//System.identityHashCode(참조형변수);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		//동등연산자 때려 버리기
		System.out.println(str1 == str2);
		
		/*method2: "Hello" (리터럴 방식)
		쌍따옴표만 사용하는 방식을 리터럴(Literal) 방식이라고 합니다. 
		이때 자바는 메모리 효율을 위해 **String Constant Pool(문자열 상수 풀)**이라는 특별한 공간을 사용합니다.
		str1 = "Hello"를 선언하면, 자바는 상수 풀에 "Hello"가 있는지 확인하고 새로 만듭니다.
		그다음 str2 = "Hello"를 선언하면, 자바는 "어? 이미 상수 풀에 'Hello'가 있네? 새로 만들지 말고 저걸 같이 쓰자!"라고 결정합니다.
		결과적으로 str1과 str2는 완전하게 똑같은 주소를 가리키게 됩니다.
		그래서 == 비교에서도 true가 나오고, identityHashCode도 동일하게 찍히는 것입니다.
		 */
		
	}
	
	public void method3() {
		
		String str1 = new String("Hello"); //실무에서 이렇게 쓰면 혼난다 ㅋㅋ.
		String str2 = "Hello"; // 문자열 리터럴은 대입연산자를 사용해 대입할 때 String Pool(heap) 영역에 등록됨.
		// String Pool에는 동일한 내용의 문자열 value가 존재할 수 없음.
		System.out.println(System.identityHashCode(str2));
		
		str2 += "Bye";
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2)); //String은 변하지 않는다. 새로운 배열을 참조할 뿐이다.
		
	}
	
	
	public void method4() {
		
		StringBuffer sb = new StringBuffer(); // StringBuffer -> 문자열 임시공간
		String str = "Hello"+"World";
		System.out.println(str);
		
		sb.append("Hello");
		sb.append("World");
		System.out.println(sb);
		
		/* 문자열 임시공간: 문자열은 불변객체이므로, 내용 변경이 일어나면 새로운 공간을 할당해서 올릴 것.
		 * 이를 해결하기 위해 임시공간(Buffer)를 준비해서 임시공간에 담았다가 한 번에 처리하는 클래스.
		 */
		
		StringBuilder sr = new StringBuilder();
		sr.append("Hello");
		sr.append("World");
		System.out.println(sr);
		/*동시제어기능(Thread-Safe) -> StringBuffer에는 내장되어 있다. 
		하지만 다른 곳에서 다 서비스를 하기 때문에 자바에서는 StringBuilder를 쓴다.
		왜냐? 기능이 빠진만큼 더 빠를테니까. (과연..?) 
		*/
		
	}
	
	
	public void method5() {
		
		String str1 = "은총알은 없다";
		
		//1. 문자열.length() = 문자열의 길이를 반환.
		System.out.println("str1의 길이: "+str1.length());
		
		String userId = "saldkjflsㄴㅁㅇㄻㄴㅇㄹㄴㅇㄹkdjfl;asdkjf;l";
		if(8 <= userId.length() && userId.length() <=20) {
			throw new RuntimeException("ID가 너무 길잖소.");
		}
		
		//2. 문자열.charAt(): char
		
	}
	
}
