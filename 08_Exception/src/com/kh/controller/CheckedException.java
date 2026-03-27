package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	
	public void readString() {
		
		//사용자에게 문자열을 하나 입력 받아서, 입력 받은 문자열의 길이를 출력.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //buffer는 대개 임시 공간이라는 뜻으로 쓰인다.
		
		//ChekedException에 대한 예외 처리 방법
		
		System.out.print("글자 수 계산기 > ");
		try {
		String str = br.readLine(); //Unhandled exception type IOException -> IOException은 컴파일러가 체크해준다.
		System.out.println(str.length());
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		//method();
		
	}
	
	
	private void method() throws IOException {
	
		System.out.println("위험한 코드"); //반드시 예외처리 해주어야 함.
		throw new RuntimeException("예외발생"); //사용자가 예외를 발생시키는 구문
	
	}
	
	
	




}
