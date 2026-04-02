package com.kh.football.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.vo.FootballPlayer;

//축구선수 저장된 걸 가지고 이것저것.
public class FootballService { 
	//정석적으로 가려면 DAO클래스가 존재해야 하지만 그러면 규모가 너무 커지므로 Service 단에서 저장.
	private List<FootballPlayer> list = new ArrayList();
	private int id;

	//클래스의 구성 요소: 필드, 생성자, 메소드, 초기화 블럭({})
	//생성자의 주 목적은 필드값 초기화.
	
	{
	list.add(new FootballPlayer(++id, "손흥민", "공격수", 7));
	list.add(new FootballPlayer(++id, "메시", "공격수", 10));
	list.add(new FootballPlayer(++id, "호날두", "공격수", 7));
	}
	
	//view가 축구선수들 정보를 출력하기 위해 이 메소드가 존재. 사실상 getter
	public List<FootballPlayer> selectAll() {
		return list;
	}
	
	
	public void addFootballPlayer(String name, String position, int backNumber) {
		
	}
	
	
	//View가 축구선수를 추가하기 위해서 호출되는 메소드
	public FootballPlayer addFootballPlayer(FootballPlayerDto fpd) {
		/* 비즈니스로직(의사결정코드)
		 * 1. 이름이 두 글자 이상 -> DTO의 name필드의 길이를 봐야 함.
		 * 2. 포지션은 공격수, 미드필더, 수비수, 골키퍼
		 * 3. 등번호는 1 이상(0 초과).
		 */
		
		//유효성 검증: validate
		/*
		if(validateFootballPlayer(fpd)) {
			list.add(new FootballPlayer(++id, fpd.getName(), fpd.getPosition(), fpd.getBackNumber()));
		}
		*/
		if(fpd != null && fpd.getName().length() >= 2){ 
			if("공격수".equals(fpd.getPosition()) || 
				fpd.getPosition().equals("미드필더") || 
				fpd.getPosition().equals("수비수") || 
				fpd.getPosition().equals("골키퍼") ) {
				if(fpd.getBackNumber() >= 0) {
					//축구선수 객체를 만들어서 list의 요소로 추가해보자.
					list.add(new FootballPlayer(++id, fpd.getName(), fpd.getPosition(), fpd.getBackNumber()));
				return list.get(list.size() -1);
				}
			
			}
		}
		return null;
		
		
	}
	
	public boolean idCheck(int id) {
		// 첫 번째 요소부터 비교해보자.
		for(int i = 0; i < list.size(); i++) {
		if(list.get(i).getId() == id) {
			return true;
			}
		}return false;
		
	}


	public void updateFootballPlayer(int id2, FootballPlayerDto player) {
		//id값을 가지고 list를 순회해서 동일한 id값을 가진 fp의 index를 알아내야 함.
		int index = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				index = i;
				break;
				}
			}
		//유효성검사
		boolean result = validateFootballPlayer(player);
		if(result) {
			list.set(index, new FootballPlayer(id, player.getName(), player.getPosition(), player.getBackNumber()));
		}
		
	}
	
	private boolean validateFootballPlayer(FootballPlayerDto fpd) {
		if(fpd != null && fpd.getName().length() >= 2){ 
			if("공격수".equals(fpd.getPosition()) || 
				fpd.getPosition().equals("미드필더") || 
				fpd.getPosition().equals("수비수") || 
				fpd.getPosition().equals("골키퍼") ) {
				if(fpd.getBackNumber() >= 0) {
					return true;
				}
			
			}
		} return false;
		
		
	}
	
	public int indexOf(int id) {
	    // 리스트 전체를 순회하면서
	    for (int i = 0; i < list.size(); i++) {
	        // i번째에 있는 선수의 ID가 내가 찾는 id와 같다면
	        if (list.get(i).getId() == id) {
	            return i; // 해당 인덱스(번호)를 반환하고 메소드 종료
	        }
	    }
	    // 반복문을 다 돌았는데도 못 찾았다면 보통 -1을 반환하는 것이 관례입니다.
	    return -1; 
	}


	public String deleteFootballPlayer(int id2) {
		int index = indexOf(id);
		if(index != -1) {
			return list.remove(index).getName();
		}
		return null;
	}
	
}
