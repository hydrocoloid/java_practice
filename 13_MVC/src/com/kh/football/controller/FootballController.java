package com.kh.football.controller;

import java.util.List;

import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.service.FootballService;
import com.kh.football.model.vo.FootballPlayer;

//View와 Model 사이에서 제어.
public class FootballController {
	private FootballService fs = new FootballService();
	
	//view에서 축구선수들 값 출력하기 위해 호출하는 메소드
	public List<FootballPlayer> selectAll() {
		List<FootballPlayer> list = fs.selectAll();
		return list;
	}
	
	
	//View에서 축구선수를 추가하고 싶을 때 호출하는 메소드 만들자.
	public void addFootballPlayer(String name, String position, int backNumber) {
		
		fs.addFootballPlayer(name, position, backNumber);
		//귀찮다면? 
	}
	
	//오버로딩: 하나의 클래스
	public FootballPlayer addFootballPlayer(FootballPlayerDto player) {
		//자료형을 Object로 하면 번거로워짐. FootballPlayerDto로.
		
		//fs의 메소드를 호출해서 인자값을 전달. -> 반환
		return fs.addFootballPlayer(player);
	}
	
	
	
	public boolean idCheck(int id) {
		return fs.idCheck(id);
	}


	public void updateFootballPlayer(int id, FootballPlayerDto player) {
		fs.updateFootballPlayer(id, player);
	}


	public String deleteFootballPlayer(int id) {
		return fs.deleteFootballPlayer(id);
	}
	

}
