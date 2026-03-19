package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionSwitch {

	public void method0() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 층 가세요? (B1, B2, B3) > ");
		String floor = sc.nextLine();
		//System.out.println(floor);
		
		switch(floor){
		case "B1": System.out.println("지하 1층입니다.");
		break;
		case "B2": System.out.println("지하 2층입니다.");
		break;
		case "B3": System.out.println("지하 3층입니다.");
		}
		//switch는 동등비교한다.
		
		/*switch문
		   표현식: switch(case문에 기술할 동등비교 대상){
		   case 정수, 실수, 문자, 문자열 : 실행할 코드;
		   }
		   
		   switch(정수 || 실수 || 문자 || 문자열){
		   case 값1: 실행할 코드 a; // 등등비교 대상 == 값1 true일 경우 코드a를 수행
		   */
		
		sc.close();
	}
	
	public void findByName() {
		Scanner sc = new Scanner(System.in);
		
		/* 목표: 사용자에게 사람이름을 입력 받아서 정보를 출력할 것.
		 * 고길동, 짱구, 둘리, 도라에몽,
		 * 고길동: 남성, 서울특별시 도봉구 쌍문동, 좋아하는 것 = 술, 싫어하는 것 = 둘리 일당.
		 * 짱구: 남성, 서울특별시 초록구 떡잎마을, 좋아하는 것 = 가족, 싫어하는 것 = 피망.
		 * 둘리: 수컷, 서울특별시 도봉구 쌍문동, 좋아하는 것 = 장난치기, 싫어하는 것 = 고길동.
		 * 도라에몽: 없음, 도쿄도 네리마구 츠키미다이, 좋아하는 것 = 노진구, 싫어하는 것 = 쥐. 
		 */ 
		
		System.out.print("누구의 정보가 궁금하세요? (고길동, 짱구, 둘리, 도라에몽) > ");
		String name = sc.nextLine();
		//System.out.println(name);
		
		
		//ver_1.0
		/*
		switch(name){
		case "고길동": System.out.println("남성 / 서울특별시 도봉구 쌍문동 / 좋아하는 것 = 술 / 싫어하는 것 = 둘리 일당");
		break;
		case "짱구": System.out.println("남성 / 서울특별시 초록구 떡잎마을 / 좋아하는 것 = 가족 / 싫어하는 것 = 피망");
		break;
		case "둘리": System.out.println("수컷 / 서울특별시 도봉구 쌍문동 / 좋아하는 것 = 장난치기 / 싫어하는 것 = 고길동");
		break;
		case "도라에몽": System.out.println("없음 / 도쿄도 네리마구 츠키미다이 / 좋아하는 것 = 노진구, 싫어하는 것 = 쥐");
		default: System.out.println("넷 중 하나의 이름을 정확히 기입해주세요.");
	    break;
		}
		*/
		
		//ver_2.0
		//1) 모던스위치 문법
		String address = switch(name) {
		case "고길동", "둘리" -> "서울특별시 도봉구 쌍문동";
		case "짱구" -> "서울특별시 초록구 떡잎마을";
		case "도라에몽" -> "도쿄도 네리마구 츠키미다이";
		default -> "검색결과 없음";
		};
		//System.out.println(address);
		
		//2) 중복 제거
		String favorite = "";
		switch(name) {
		case "고길동" : favorite = "술"; break;
		case "짱구" : favorite = "가족"; break;
		case "둘리" : favorite = "장난치기"; break;
		case "도라에몽" : favorite = "노진구"; break;
		default : System.out.println("검색결과 없음");
		return; // 현재 메소드 영역을 아예 빠져 나가는 구문 -> 나를 호출한 곳으로 돌아감.
		} //break 구문을 만나면 빠져 나오는 부분
		//System.out.println(favorite);
		
		System.out.println(name + " = " + "거주지: " + address + "/ 좋아하는 것: " + favorite);
	}
	
	public void logIn() {
		
		//웹개발자는 결국 웹사이트 만들고 유지 보수하는 사람 -> 회원가입, 로그인, 로그아웃, 정보 확인, 수정, 탈퇴 처리 등 등 등.
		
		/* 웹사이트 만들기의 단계
		 * 기획 / 설계
		 * 기획 -> 뭘 만들지?
		 * 설계 -> 어떻게 만들지?
		 
		 * 기획: 로그인 기능 구현
		 * 설계: DB = 회원가입으로 id와 pw 생성 (생략).
		  -> String이란 변수에 id와 pw를 저장해놓고 사용자의 입력값과 동등 비교. 
		  -> id, pw 일치하면 로그인 전 화면과 다른 화면을 출력.
		  실제: 저장소 바꾸고, 유효성 검증하고, 비밀번호 암호화.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String id = "user01";
		String pw = "pw01";
		String name = "홍길동";
		
		/*구현
		 * 1) 로그인 화면 출력.
		 * 2) 아이디, 패스워드 입력 받음.
		 * 3) 아이디, 패스워드 둘 다 정확히 입력한다면 로그인 성공 화면 출력.
		 * 4) 아이디, 패스워드 둘 중 하나라도 잘못 입력한다면 로그인 실패 화면 출력.
		 */
		
		System.out.println("배달의 KH입니다.");
		System.out.print("아이디 > ");
		String logId = sc.nextLine();
		System.out.print("패스워드 > ");
		String logPw = sc.nextLine();
		
		int count = 0;
		if(id.equals(logId) && pw.equals(logPw) && count<6) {
			System.out.println(name + "님 반갑습니다~");
			count=0;
		} else {System.out.println("로그인 실패: 아이디 혹은 비밀번호가 일치하지 않습니다."); count++;}
		
		sc.close();
		
	}
	
	//기본자료형: boolean, char, byte, short, int, long, float, double. => 동등비교연산자를 사용해서 비교연산을 수행함.
	//참조자료형: 나머지 전부 => 동등비교연산자를 사용해서 비교연산을 수행하지 못함. ex) 문자열 비교 .equals()
	//=> 실제 변수에 담기는 값이 주소값이기 때문.
	
	
	
}
