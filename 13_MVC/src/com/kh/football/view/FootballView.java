package com.kh.football.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.football.controller.FootballController;
import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.vo.FootballPlayer;

 /* View가 해야 할 일 
 * 1) 사용자의 입력값 받기.
 * 2) model에서 만든 값 출력하기.
 */
public class FootballView { //시각적인 부분 - 화면 입출력 (HTML/CSS 안 배워서 일단 View로 만든다.)
	Scanner sc = new Scanner(System.in);
	private FootballController fc = new FootballController();
	
	//프로그램 실행 시 보여 줄 화면을 출력해주는 기능
	public void mainMenu() {
		/* 축구선수 CRUD
		 * C: 사용자에게 축구선수 이름, 포지현, 등번호를 입력 받아 저장.
		 * R: 만들어진 축구선수들을 조회.
		 * U: 정보 수정
		 * D: 정보 삭제.
		 */
		
		while(true) {
			System.out.println("⚽축구선수 관리 프로그램입니다⚽");
			System.out.println("1. 축구선수 전체 조회하기");
			System.out.println("2. 축구선수 추가하기");
			//사용자가 입력한 값을 저장소에 저장하는 게 우리가 해야 할 일. -> 다음 주에 저장소 배운다.
			System.out.println("3. 축구선수 수정하기");
			System.out.println("4. 축구선수 삭제하기");
			System.out.println("0. 프로그램 종료하기");
			//축구선수 검색하기, 축구선수 목록 파일로 저장하기
			System.out.print("⚽어떤 기능을 이용하시겠습니까? > ");
			
			int menu = 0;
			try {
				menu = sc.nextInt();
				sc.nextLine();
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요~");
				sc.nextLine();
				continue;
			}
			switch(menu) {
			case 0 : System.out.println("프로그램을 종료합니다."); sc.close(); return; 
			case 1 : selectAll();
				break;
			case 2 : addFootballPlayer(); 
				break;
			case 3 : updateFootballPlayer();
				break;
			case 4 : deleteFootballPlayer();
				break;
			default : System.out.println("없는 메뉴입니다. 다시 선택해주세요~"); 
			}
			
		}
		
	}
	
	//선수들의 정보를 출력해주는 기능
	private void selectAll() {
		//model에서 만든 값 출력하기.
		List<FootballPlayer> list = fc.selectAll();
		
		//list의 필드로 있는 배열의 인덱스에 있는 VO의 주소값을 참조하여 필드값을 출력
		/*
		String name = list.get(0).getName();
		String position = list.get(0).getPosition();
		Integer backNumber = list.get(0).getBackNumber();
		System.out.println("선수의 정보입니다.");
		System.out.println("이름: "+name);
		System.out.println("포지션: "+position);
		System.out.println("등번호: "+backNumber);
		*/
		
		//list의 필드로 있는 배열의 인덱스에 있는 VO의 주소값을 참조하여 필드값을 출력
		if(!list.isEmpty()) { // 이 블록 안에 들어왔다면 축구선수가 한 명 이상 있다는 뜻
			System.out.println("선수들의 정보를 확인하세요");
			System.out.printf("%-5s | %-10s | %-10s | %-5s%n", "ID", "이름", "포지션", "등번호");
		    System.out.println("--------------------------------------------------");
		    for(FootballPlayer fp : list) {
		        // %-10s : 10칸 공간 확보 후 왼쪽 정렬(-)
		        // %n : 줄바꿈 (System.lineSeparator()와 같음)
		        System.out.printf("%-5d | %-10s | %-10s | %-5d%n", 
		                          fp.getId(), fp.getName(), fp.getPosition(), fp.getBackNumber());
		    }
		    System.out.println("==================================================");
		    System.out.println();
		} else { //축구선수가 한 명도 없는 경우
			System.out.println("등록된 선수가 없습니다.");
			System.out.println("새로운 선수를 추가해보세요~");
		}
		
	}
	
	
	private void addFootballPlayer() {
		/*여기서 해야 할 일은?
		 * 1. 사용자의 입력값 받기
		 * 2. 모델에서 만든 값 출력하기
		 */
		
		// 1. 사용자의 입력값 받기 -> 축구선수를 만들 수 있는 값들의 자료형
		System.out.println("선수 추가하기입니다.");
		System.out.print("선수의 이름을 입력해주세요 > ");
		String name = sc.nextLine();
		System.out.print("선수의 포지션을 입력해주세요 > ");
		String position = sc.nextLine();
		System.out.print("선수의 등번호를 입력해주세요 > ");
		int backNumber = 0; 
		/* int를 쓴 이유: 
		 * 1. int가 짧으니까ㅋㅋ 
		 * 2. Integer는 정수값이 아닌 게 들어 올 수 있다. 
		 * 3. Integer를 쓰면 null값인지 아닌지도 체크해야 함. 번거로워짐.
		 */
		try {
			backNumber = sc.nextInt();
			sc.nextLine();
		} catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("등번호는 숫자만 입력이 가능합니다.");
			return; //-> mainMenu갔다가 while문 시작으로 돌아감.
		}
		// 1. 사용자의 입력값 받기 완료. -> View가 할 일 끝.
		
		/* 2의 방향 정하기: 모델에서 만든 값 출력하기
		   추가 성공시 추가된 데이터 출력해주기, 실패 시엔 실패 알림.
		*/
		
		FootballPlayer fp = fc.addFootballPlayer(new FootballPlayerDto(name, position, backNumber));
		/* 3개의 값을 넘기는 게 번거롭다.
		 * 1) FootballPlayer VO 탈락 => 객체 생성할 때 무조건 id가 있어야 해서.
		 * 2) ArrayList 되는데 index를 알아야 함.
		 * 3) HashMap => Generic<>을 <String, Object>로 해야 해서 번거로움.
		 * 4) Object[] 배열 => 이걸 쓸 바엔 리스트 씀 ㅋㅋ.
		 * 5) 클래스 생성: DTO. 값 전송 객체 만들어서 전달하기.
		 */
		
		// 추가 성공시 추가된 데이터 출력해주기, 실패 시엔 실패 알림.
		if(fp != null) {
			selectAll();
		} else {
			System.out.println("선수 등록에 실패했습니다.");
		}
		
	}
	
	
	private void updateFootballPlayer() {
		/* 어떤 요소들을 수정할 수 있게 할 것인가 -> 이름, 포지션, 등번호 모두.
		 * 선수를 어떻게 식별할 것인가 -> id값을 기준으로.
		 */
		selectAll();
		System.out.println("어떤 선수의 정보를 수정하시겠습니까?");
		System.out.print("선수의 ID를 입력해주세요 > ");
		//String id = sc.nextLine();
		//int idNum = Integer.parseInt(id);
		try {
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("변경하실 이름을 입력해주세요 > ");
			String name = sc.nextLine();
			System.out.print("변경하실 포지션을 입력해주세요 > ");
			String position = sc.nextLine();
			System.out.print("변경하실 등번호를 입력해주세요 > ");
			int backNumber = Integer.parseInt(sc.nextLine());
			//기존 데이터 수정 위해 id값 입력 받고 수정값 받음.
			
			/* 다음 단계
			 * 1) 입력 받은 id값을 가지고 서비스까지 가서 id가 있는지 확인.
			 * 	-> 있으면 아래 코드 수행. 없으면 return. => id 중복체크
			 * 2) 이미 우리는 축구선수 주소 가지고 있는 List의 주소를 반환하는 메소드를 구현해놓음 
			 * = Service
			 * 3) id값을 들고 서비스까지 가서 서비스에 검증 로직 작성.
			 *  -> id가 있나 없나 검증하는 코드는 비즈니스로직이니까 서비스로 가라.
			 *  어떻게? 메소드 호출로.
			 */
			
			// 받은 내용 세 가지를 update시 새로운 id값으로 만들어서 넣어주기
			fc.updateFootballPlayer(id, new FootballPlayerDto(name, position, backNumber));
			
			
			boolean result = fc.idCheck(id);
			if(!result) {
				System.out.println("존재하지 않는 아이디입니다.");
				return; 
				}
			
		}catch(NumberFormatException e) {
			System.out.println("올바른 값을 입력해주세요.");
			System.out.println("메인 메뉴로 돌아갑니다.");
		}
		//무엇을 입력 받아야 하는가 > id, name, position, backNumber
		
	}
	
	
	private void deleteFootballPlayer() {
		System.out.println("등록된 축구선수 데이터를 삭제하겠습니다.");
		selectAll();
		System.out.print("어떤 선수를 해지하시겠습니까? (아이디 입력) > ");
		int id = 0;
		try {
			id = sc.nextInt();
			sc.nextLine();
		} catch(InputMismatchException e) {
			System.out.println("아이디값은 숫자만 입력 가능합니다.");
			sc.nextLine();
			return;
		}
		
		fc.deleteFootballPlayer(id);
	}

}
