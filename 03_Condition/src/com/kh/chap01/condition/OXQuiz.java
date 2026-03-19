package com.kh.chap01.condition;

import java.util.Scanner;

public class OXQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 최종 결과를 저장할 변수

	    // --- 1번 문제 구간 ---
	    boolean quiz1Solved = false;
	    while (!quiz1Solved) {
	        System.out.println("[문제 1] 고양이는 호랑이과일까요?");
	        System.out.print("(O / X) > ");
	        char answer1 = sc.next().toUpperCase().charAt(0);

	        if (answer1 == 'X') {
	            System.out.println("정답입니다! 다음 문제로 넘어갑니다.\n");
	            quiz1Solved = true; // 루프 탈출 조건
	        } else if (answer1 == 'O') {
	            System.out.println("오답입니다~ 다시 도전해보세요!\n");
	            // quiz1Solved가 false이므로 다시 while문 처음으로 돌아감
	        } else {
	            System.out.println("O 또는 X로만 입력해주세요.\n");
	        }
	    }

	    // --- 2번 문제 구간 (1번을 맞춰야만 여기로 도달함) ---
	    boolean quiz2Solved = false;
	    while (!quiz2Solved) {
	        System.out.println("[문제 2] 자바(Java)는 객체지향 언어인가요?");
	        System.out.print("(O / X) > ");
	        char answer2 = sc.next().toUpperCase().charAt(0);

	        if (answer2 == 'O') {
	            System.out.println("\n축하합니다! 모든 퀴즈를 맞히셨습니다.");
	            quiz2Solved = true;
	        } else if (answer2 == 'X') {
	            System.out.println("오답입니다~ 다시 생각해보세요!\n");
	        } else {
	            System.out.println("O 또는 X로만 입력해주세요.\n");
	        }
	    }

	    sc.close();
	}

}
