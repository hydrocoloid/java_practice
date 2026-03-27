package com.kh.sw.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.sw.controller.SwitchController;
import com.kh.sw.util.SwitchBoomException;

//뷰클래스? 화면을 만들어 낼 재간이 없어 어쩔 수 없이 쓴다. -> 나중엔 대체될 것.
//오로지 입출력 기능읃 담당하는 역할.
public class SwitchView {
	private Scanner sc = new Scanner(System.in);
	private SwitchController controller = new SwitchController();
	
	public void menu() {
		
		System.out.println("스위치 on/off 프로그램입니다.");
		
		while(true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 스위치 누르기");
			System.out.println("2. 프로그램 종료");
			System.out.print(" > ");
			int menuNo = 0;
			
			try {
				menuNo = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("정확한 메뉴번호를 입력해주세요");
				continue;
			} finally {
				sc.nextLine();
				
			}
			switch(menuNo) {
			case 1 : toggleSwitch(); break;
			case 2 : System.out.println("다음에 또 봐요~"); sc.close(); return;
			default : System.out.println("1, 2 중에 입력해주세요!");
			}
		}
		
	}
	
	
	private void toggleSwitch() {
		//스위치가 꺼져 있는 상태면 -> 스위치를 켠 후에 🔅 출력
		//스위치가 켜져 있는 상태면 -> 스위치를 켠 후에 💤 출력
		
		boolean result = controller.toggleSwitch();
		
			try {
				controller.toggleSwitch();
			}catch(SwitchBoomException e) {
				System.out.println("돔황챠~~!!");
				return;
			}
		
		if(result) {
			System.out.println("불이 켜졌습니다🔅");
		} else {
			System.out.println("불이 꺼졌습니다💤");
		}
	}
		

}
