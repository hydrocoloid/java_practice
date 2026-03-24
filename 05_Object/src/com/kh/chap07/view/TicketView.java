package com.kh.chap07.view;

import java.util.Scanner;

import com.kh.chap07.controller.TicketController;
import com.kh.chap07.model.vo.Ticket;

public class TicketView { 
	//필드부입니다.
	private Scanner sc = new Scanner(System.in); //필드 선언
	private TicketController tc = new TicketController(); 
	//TicketController 생성자를 호출하여 tc라는 필드에 대입. tc에는 주소값이 담김.
	
	
	//메소드부입니다.
	public void mainMenu() {
		while(true) {
		System.out.println("티켓 발권 서비스입니다~");
		System.out.println("0. 티켓 전체 조회하기");
		System.out.println("1. 티켓 추가하기");
		System.out.println("2. 티켓 발급 받기");
		System.out.println("3. 프로그램 종료");
		System.out.print("원하시는 메뉴를 선택해주세요 > ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		//System.out.println(menuNo);
		
		//3번부터 구현해보자.
		switch(menuNo) {
		case 0 : findAll(); 
		break;
		case 1 : saveView(); 
			break;
		case 2 : printTicket();
			break;
		case 3 : System.out.println("프로그램을 종료합니다."); sc.close(); 
			return;
		default : System.out.println("없는 메뉴를 선택하셨습니다.");
		} //스위치문 블록
	  } //와일문 블록
	} //메인메뉴 메소드 블록
	
		//티켓을 추가할 수 있는 화면을 출력해주는 기능
	private void saveView() {
		
		System.out.print("티켓 가격을 입력해주세요 > ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("기내식을 입력해주세요 > ");
		String meal = sc.nextLine();
		System.out.print("좌석번호를 입력해주세요 > ");
		String seatNumber = sc.nextLine();
		System.out.print("서비스를 입력해주세요 > ");
		String service = sc.nextLine();
		
		Ticket ticket = new Ticket(meal, service, seatNumber, price); 
		//매개변수 생성자를 호출하여 객체 생성하고 객체가 가지고 있는 필드의 값을 전달 받은 값으로 대입.
		System.out.println(ticket.info());
		
		//이 내용을 heap에 올릴까, stack에 올릴까, MethodArea에 올릴까.
		//stack에 올리면 메소드 끝나면 메모리 날아 간다. 안 된다. heap으로 가자.
		//근데 무슨 자료형으로 heap에 올리지? 마땅한 게 없네. 그럼 자료형(class)을 만들자. = Ticket 클래스.
		
		/* 등록된 티켓이 세 장이 아니라면 어딘가에 저장해둬야지~ -> 서비스 클래스 -> 컨트롤러 클래스는 쿠션.
		 * 뷰 객체가 자신이 만든 주소값을 컨트롤러에게 넘기고 싶은 상황.
		 * TicketController tc = new TicketController();
		 * 생성자를 만들어서 넘깁시다. -> 안 돼~ -> 일단 필드부로 보내자.
		 * 객체에서 다른 객체로 값을 전달할 때는 메소드를 호출해서 넘겨준다. 
		 * -> 전달 받을 객체에 메소드 생성.
		 */
		
		//tc.saveTicket(ticket); 전달할 값을 ()안에 넣는다. = 인자
		int result = tc.saveTicket(ticket); // 컨트롤러로부터 결과를 받으며 좌항이 생김.
		//System.out.println("view: " + ticket); = 확인용 출력.
		
		//티켓 추가 성공 실패 여부 출력
		if(result == 1) {
		System.out.println("티켓 등록 성공!");
		} else {
		System.out.println("티켓 등록 실패...");
		}
	
	}
		
	
	private void printTicket() {
		
		Ticket ticket = tc.printTicket();
		
		if(ticket != null) {
		System.out.println(ticket.info());
		/* TicketServie 클래스의 필드에 저장된 firstTicket의 값을 출력하자.
		 * 티켓들의 주소값은 서비스 객체에 있다. -> 다이렉트로 못 가니까 컨트롤러를 거쳐야 한다. -> 뷰는 서비스의 정보를 모르는 게 좋다. 의존성 감소.
		 * 티켓이 있을 수도 있고 없을 수도 있다.
		 * -> 없으면 null을 참조해서 info()메소드를 실행시키는 에러가 남.
		 */
		} else {
			System.out.println("티켓이 존재하지 않습니다.");
		}
		
	}
	
	
	private void findAll() {
		
		//tc.findAll();
		Ticket[] tickets = tc.findAll();
		boolean hasTicket = false; // 티켓이 있는지 체크할 깃발!
		//System.out.println(tickets[0].info());
		
		/*
		if(tickets[0] != null) {
			System.out.println(tickets[0].info());
		}
		if(tickets[1] != null) {
			System.out.println(tickets[1].info());
		}
		if(tickets[2] != null) {
			System.out.println(tickets[2].info());
		}
		*/
		
		for(int i = 0; i < tickets.length; i++) {
			if(tickets[i] != null) {
				System.out.println(tickets[i].info());
				hasTicket = true; // 티켓을 하나라도 발견하면 깃발을 올림!
			}
		}
		
		if(!hasTicket) {
	        System.out.println("현재 등록된 티켓이 하나도 없네요! 1번을 눌러 추가해보세요.");
	    }
	}

}
