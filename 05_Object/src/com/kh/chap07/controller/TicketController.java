package com.kh.chap07.controller;

import com.kh.chap07.model.vo.Ticket;
import com.kh.chap07.service.TicketService;

public class TicketController { //요청처리기. (핸들러)
	// 두 가지 기능 구현
	//1. 티켓 추가하기
	//2. 추가된 티켓 발급해주기
	
	private TicketService ts = new TicketService(); //new는 자원 소모가 큰 명령. 좋은 코드는 new가 적다.
	
	public int saveTicket(Ticket ticket) {
		//System.out.println("Controller: "+ ticket);
		return ts.saveTicket(ticket);
		
	}
	
	/* 주소값을 넘기려면 
	 * 전제조건 1. 주소값이 있어야 한다. -> heap영역에 올라와 있어야 한다. -> 객체가 생성되어 있어야 한다. 
	 */
	
	public Ticket printTicket() {
		//서비스에게 일 시켜야 한다.
		//ts.printTicket();
		Ticket ticket = ts.printTicket();
		return ticket;
	}
	
	
	public Ticket[] findAll() {
		
		Ticket[] tickets = ts.findAll();
		return tickets;
	}
	
}
