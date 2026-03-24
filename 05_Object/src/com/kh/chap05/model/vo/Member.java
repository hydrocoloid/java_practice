package com.kh.chap05.model.vo; //Value Object

public class Member {

	// 필드부: 아이디, 비밀번호, 닉네임
	// 웹사이트 만들 거임. 회원가입 받을 때 회원 정보를 저장할 객체 생성 필요.
	// 요새는 소셜 로그인으로 대체. 정보 받는 게 리스크 크고 돈 나갈 게 많음.
	// Spring 뭐시기... 가 요즘 추세.
	
	private String userId;
	private String userPwd;
	private String nickName;
	
	
	/* 생성자부
	 * 생성자(Constructor): 객체 생성 시 초기화를 담당하는 특수한 구성 요소.
	 * = 초기화 담당자.
	 * 생성자의 필요?: 객체 생성 시 초기화. 
	 * new까진 객체라고 하지 않음. 초기화 끝난 시점부터 "객체"라 함.
	 * new로 메모리 할당하고, 생성자를 통해 객체를 생성.
	 * 메서드가 아니다! 둘은 다른 개념.
	  
	 * 생성자의 두 가지 역할
	 * 1) 기술적인 관점: 객체가 생성될 때 어떤 상태로 시작해야 하는가.
	 * 2) 개념적인 관점: 객체가 생성될 거면 처음부터 유효한 상태여야지?
	 * 클래스를 만들었는데 생성자를 안 만들었다? 
	 * -> jvm은 실수했다고 여김.
	 * -> 클래스 내부에 생성자가 하나도 없을 시 기본생성자를 자동으로 만들어 줌. 
	 * -> 기본생성자를 하나라도 만들면 의도가 있다고 여김.
	 */
	
	/* 생성자를 만들 때 주의사항
	 * 1. 반드시 생성자의 이름을 클래스의 이름과 동일하게 작성해야 함.(대문자, 소문자)
	 * 2. 반환형이 존재해서는 안 됨.
	 * 3. 매개변수 생성자를 명시적으로 작성하면 기본생성자를 만들어 주지 않음.
	 * => Legacy 기술들은 기본생성자가 필요한 상황이 있음.
	 * 4. 생성자는 동일한 이름으로 여러 개 만들 수 있지만 매개변수는 중복되면 안 됨.
	 * => 생성자 오버로딩
	 */
	
	/* 표현식
	 * 접근제한자 클래스식별자(){
	  		해당 생성자를 통해 객체 생서 시 실행하고자 하는 코드;
	  	}
	 */
	
	public Member() { // <- 매개변수가 없다? 기본생성자
		//보통은 매개변수를 넣는다.
		System.out.println("생성자 호출");
	}
	
	public Member(String userId) { //생성자 오버로딩
		this.userId = userId;
		//매개변수가 있으면 매개변수 생성자
	}
	
	public Member(String userId, String userPwd) { 
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
	public Member(String userId, String userPwd, String nickName) { 
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
	}
	
	/*
	public Member(String userPwd) { 
		 * 이러면 MemberView의 Member member1 = new Member("user01");에서
		 * "user01"이 public Member(String userId)으로 가야 하나
		 * public Member(String userPwd)으로 가야 하나
		 * 컴퓨터는 모른다!!
		 */
	
	/*
	public Member(String nickName) { //생성자 오버로딩
		System.out.println("유저닉네임~");
		this.nickName = nickName;
	}
	*/
	
	/* 예시
	public Member(String userId, String userPwd, String nickname) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
		//세터랑 비슷하게 생겼네~
		//이렇게 쓰면 멤버뷰 클래스에서 난리 남. 멤버뮤 클래스에서 고쳐줘야 함.
	}
	*/
	
	
	
	//메소드부 - 필드가 private으로 접근 제한 되어 있으니 getter(), setter() 필요. 그리고 정보를 인출하는 info() 필요.
	
	
	public String UserId(){
		return userId;
		}
	
	public void setUserId(String userId) { 
		this.userId = userId;
		}
	
	public String userPwd(){
		return userPwd;
		}
	
	public void setUserPwd(String userPwd) { 
		this.userPwd = userPwd;
		}
	
	public String getNickName(){
		return nickName;
		}
	
	public void setNickName(String nickName) { 
		this.nickName = nickName;
		}
	
	//info
	public String info() {
		String info = "아이디: "+userId
					+ " / 비밀번호: "+userPwd
					+ " / 닉네임: "+nickName;
		return info;
		}
	
	
}
