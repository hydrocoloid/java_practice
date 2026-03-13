package com.kh.variable;

import java.text.DecimalFormat; // 1. 포맷 도구 임포트

public class Mcdonalds {
    public static void main(String[] args) {
    	
    	DecimalFormat df = new DecimalFormat("###,###"); // 2. 콤마 포맷 설정 객체 생성
    	
        System.out.println(">>메뉴판<<");
        System.out.println("1. 트리플치즈버거 세트(15,000원)");
        System.out.println("2. 빅맥 세트(8,000원)");
        System.out.println("3. 1955버거 세트(11,000원)");
        System.out.println("------------------------");
        
        // 수량 설정
        int tripleQty = 4;
        int bigMacQty = 9;
        int b1955Qty = 4;

        // 단가 설정
        int triplePrice = 15000;
        int bigMacPrice = 8000; 
        int b1955Price = 11000;

        // 각 항목별 금액 계산
        int tripleTotal = triplePrice * tripleQty;
        int bigMacTotal = bigMacPrice * bigMacQty;
        int b1955Total = b1955Price * b1955Qty;

        // 전체 총액 계산
        int finalTotal = tripleTotal + bigMacTotal + b1955Total;

        System.out.println(">>주문결과<<");
        System.out.println("트리플치즈버거 세트 " + tripleQty + "개 주문: " + df.format(tripleTotal) + "원");
        System.out.println("빅맥 세트 " + bigMacQty + "개 주문: " + df.format(bigMacTotal) + "원");
        System.out.println("1955버거 세트 " + b1955Qty + "개 주문: " + df.format(b1955Total) + "원");
        
        System.out.println("------------------------");
        System.out.println("총 주문 금액: " + df.format(finalTotal) + "원");
    }
}