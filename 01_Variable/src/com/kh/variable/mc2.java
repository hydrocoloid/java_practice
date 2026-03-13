package com.kh.variable;

import java.util.Scanner;        // 1. 키보드 입력 도구 불러오기
import java.text.DecimalFormat; // 2. 숫자 꾸미기 도구 불러오기

public class mc2 {

	public static void main(String[] args) {
		// 도구 객체 생성
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###");

        // 메뉴판 출력
        System.out.println("========== 맥도날드 메뉴판 ==========");
        System.out.println("1. 트리플치즈버거 세트 : 15,000원");
        System.out.println("2. 빅맥 세트          :  8,000원");
        System.out.println("3. 1955버거 세트      : 11,000원");
        System.out.println("===================================");
        
        // 3. 사용자로부터 수량 입력받기
        System.out.print("트리플치즈버거 세트 수량 입력: ");
        int tripleQty = sc.nextInt(); // 숫자를 입력받아 변수에 저장

        System.out.print("빅맥 세트 수량 입력: ");
        int bigMacQty = sc.nextInt();

        System.out.print("1955버거 세트 수량 입력: ");
        int b1955Qty = sc.nextInt();

        // 가격 설정
        int triplePrice = 15000;
        int bigMacPrice = 8000; 
        int b1955Price = 11000;

        // 계산
        int tripleTotal = triplePrice * tripleQty;
        int bigMacTotal = bigMacPrice * bigMacQty;
        int b1955Total = b1955Price * b1955Qty;
        int finalTotal = tripleTotal + bigMacTotal + b1955Total;

        // 결과 출력
        System.out.println("\n>>>> 주문 결과 <<<<");
        System.out.println("트리플치즈버거 " + tripleQty + "개: " + df.format(tripleTotal) + "원");
        System.out.println("빅맥          " + bigMacQty + "개: " + df.format(bigMacTotal) + "원");
        System.out.println("1955버거      " + b1955Qty + "개: " + df.format(b1955Total) + "원");
        
        System.out.println("------------------------");
        System.out.println("총 주문 금액: " + df.format(finalTotal) + "원");
        System.out.println("------------------------");
        
        sc.close(); // 도구 사용 종료 (좋은 습관!)
    }
}