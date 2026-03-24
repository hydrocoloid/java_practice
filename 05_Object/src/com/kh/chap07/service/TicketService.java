package com.kh.chap07.service; //개발자가 꿈을 펼치는 곳!!

import com.kh.chap07.model.vo.Ticket;

public class TicketService {
	//private int ticketCount;
	/*
	private Ticket firstTicket;
	private Ticket secondTicket;
	private Ticket thirdTicket;
	*/
	private Ticket[] tickets = new Ticket [3];
	
	/*배열 복습 
	특징: 인덱스 개념 존재. 변수의 나열(메모리 연속된 공간에 저장), 선언된 배열의 크기는 불변. 논리 구조와 물리 구조가 동일하다. 동종모음(같은 자료형의 값).
	동종모음이니까 Ticket 자료형의 값들을 한 번에 담을 수 있겠지.
	TicketService 클래스가 주소를 가지고 있다.
	필드로 배열을 만드는 게 좋다.
	*/
	
	/*
	public int getTicketCount() {
		return ticketCount;
	}
	*/
	
	public int saveTicket(Ticket ticket) {
		//1. 티켓 개수 확인
		//2. 티켓 개수가 2 이하라면 티켓 등록 하고 티켓카운트 +1
		
		/* 리턴값 어떻게 돌려줄까?
		 * 1) 정수값
		 * 2) 주소값 
		 
		if(firstTicket == null) {
			//ticketCount++;
			this.firstTicket = ticket;
			return 1;
		} else if(secondTicket == null) {
			//ticketCount++;
			this.secondTicket = ticket;
			return 1;
		} else if(thirdTicket == null) {
			//ticketCount++;
			this.thirdTicket = ticket;
			return 1;
		}
		return 0;
		 */ 
		//객체 배열로 처리해버리기? 필드명이 배열 인덱스로 바뀌면 그만이야~
		
		for(int i = 0; i < tickets.length; i++) {
			if(tickets[i] == null) {
				tickets[i] = ticket;
				return 1;
			}
		}
		return 0;
		
			/*
		if(tickets[0] == null) {
			tickets[0] = ticket;
			return 1;
		}
		if(tickets[1] == null) {
			tickets[1] = ticket;
			return 1;
		}
		if(tickets[2] == null) {
			tickets[2] = ticket;
			return 1;
		}
		return 0;
		*/
	}
	
	
	public Ticket printTicket() {
		/* 뷰에서 시작된 요청이 컨트롤러를 거쳐 도달.
		 * 1) 티켓이 발급된 게 있나 없나 확인 후 -> first티켓 있나? 필드값이 'null만 아니면(조건)' 된다.
		 * 2) 발급된 게 있으면 티켓의 주소값을 반환해주고
		 * 3) 주소값을 담은 필드 비워 주기.
		 */
		
		for(int i = 0; i < tickets.length; i++) {
			if(tickets[i] != null) {
				Ticket temp = tickets[i];
				tickets[i] = null;
				return temp;
			} 
		}
		return null;
		
		/*
		if(firstTicket != null) {
			Ticket ticket = firstTicket;
			firstTicket = null;
			return firstTicket;
		} else if(secondTicket != null) {
			Ticket ticket = secondTicket;
			secondTicket = null;
			return firstTicket;
		} else if(thirdTicket != null) {
			Ticket ticket = thirdTicket;
			thirdTicket = null;
			return firstTicket;
		} 
		return null;
		*/
	}
	
	public Ticket[] findAll() {
		return tickets;
	}

}
