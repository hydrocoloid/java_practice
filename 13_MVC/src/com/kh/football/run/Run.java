package com.kh.football.run;

import com.kh.football.view.FootballView;

public class Run {

	public static void main(String[] args) {
		
		/* MVC패턴(Model - View - Controller)
		 * 애플리케이션의 구조를 세 가지 요소로 분리하자 -> 라는 소프트웨어 아키텍쳐 디자인 패턴
		 
		 * Model: 데이터 담당. 
		 * VO(Value Object) = 값을 담당.
		 * DAO(Data Access Object) = 데이터를 외부 매체와 상호작용.
		 * Service = 데이터 가지고 연산. 비즈니스 로직.
		 * DTO(Data Transfer Object) = 데이터 전송용도.
		 * Entity = 테이블과의 매핑.
		 
		 * View: 사용자 인터페이스 담당.
		 * 사용자에게 정보 표시, 입력값 받는 용도.
		 * 모델에서 만들어진 데이터를 시각적으로 표현.
		 * 모델과 직접 상호작용하지 않음. 결합도가 높아질수록 모델에서 변화가 커지면 뷰의 수정도 늘어남.
		 
		 * Controller
		 * 모델과 뷰의 중간다리 역할.
		 * 사용자가 View에서 입력한 값을 Model에 전달.
		 * Model에서 일어난 처리작업 결과를 View로 반환. 
		 */
		
		
		// 목표: 축구선수 CRUD 구현. 
		
		/* CRUD
		 * Create(생성): View에서 만들어진 데이터를 축구선수 모양으로 만들고 저장.
		 * Read(조회): 저장되어 있는 축구선수들을 조회해서 출력.
		 * Update(수정): 저장되어 있는 축구선수들의 값을 갱신.
		 * Delete(삭제): 저장되어 있는 축구선수들의 데이터를 삭제.
		  
		 * 예시: 회원 -> C: 회원가입 / R: 마이페이지 / U: 내 정보 수정 / D: 회원탈퇴.
		 * 회원의 C를 구현하겠다. -> 아이디, 비밀번호, 전화번호, 이메일.
		 * 공지사항의 C를 구현하겠다. -> 게시글 제목, 게시글 내용, 게시글 작성자, 게시글 카테고리.
		 * => 이걸 어디에 저장하지? 마땅한 자료형이 없으므로 내가 자료형(Class)을 만들자.
		 * public class Member(){
		 * private String userId;
		 * private String userPwd;
		 * }
		 */
		
		new FootballView().mainMenu();
			
	}

}
