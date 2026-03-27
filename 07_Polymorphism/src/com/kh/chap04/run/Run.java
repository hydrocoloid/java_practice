package com.kh.chap04.run;

import java.util.Scanner;

import com.kh.chap04.model.service.CookingSkill;
import com.kh.chap04.model.service.HitTheBop;
import com.kh.chap04.model.service.HongkongHouse;

public class Run {

	public static void main(String[] args) {
		//인터페이스를 사용하려면 기능에 대한 설계를 먼저.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("덮밥천국에 오신 것을 환영합니다.");
		System.out.println("주문하실 덮밥 브랜드를 선택해주세요");
		System.out.println("1. 청킹미미");
		System.out.println("2. 힛또밥");
		System.out.print("메뉴 선택 > ");
		int menuNo = sc.nextInt();
		
		CookingSkill cs = null;
		switch(menuNo) {
		case 1 : cs = new HongkongHouse(); break;
		case 2 : cs = new HitTheBop(); break;
		}
		cs.makeDopbap();
		
	}

}
