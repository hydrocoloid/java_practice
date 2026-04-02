package com.kh.chap03.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.chap03.model.vo.Shop;

public class Run {

	public static void main(String[] args) {
		
		// Set: 인터페이스. Collection을 상속함. 
		// Hashset: Value값만 저장. index개념이 없음. 순서 보장 안 됨. 중복 비허용.
		
		
		/*문자열만 담을 수 있는 HashSet 만들어 보자.
		Set<String> set = new HashSet(); //요소 추가 add()는 부모로부터 물려 받음.
		
		set.add("1 하이");
		set.add("2 방가");
		set.add("3 바이");
		//index개념이 없음. 순서 보장 안 됨.
		
		set.add("1 하이"); //중복 비허용.
		set.add(new String("1 하이")); //주소가 다른 같은 문자열도 중복 비허용.
		
		System.out.println(set);
		
		
		//요소 개수 구하기 size()
		System.out.println(set.size());
		*/
		
		
		/* VO 만들기!
		 * 주변 식당들 정보를 set에 담아야겠다. 
		 */
		
		Set<Shop> shops = new HashSet();
		
		Shop gongShop = new Shop("공평동꼼장어", "꼼장어", 33000);
		Shop shakeShop = new Shop("쉑쉑버거", "메가쉑", 23000);
		Shop wooyukShop = new Shop("우육면관", "우육면", 18000);
		
		shops.add(gongShop);
		shops.add(shakeShop);
		shops.add(wooyukShop);
		shops.add(new Shop("공평동꼼장어", "꼼장어", 33000));
		//String 클래스에는 equals()랑 hashCode()가 오버라이딩 돼 있어서 중복을 잡아줌.
		
		/* HashSet -> set에 새로운 요소를 추가할 때마다
		 * equals()랑 hashCode()의 반환값을 기준으로 일치하는 요소가 있는지 없는지 판별함.
		 */
		
		boolean flag = gongShop.equals(new Shop("공평동꼼장어", "꼼장어", 33000));
		//System.out.println(flag);
		
		//for(int i = 0; i < shops.size(); i++) -> 일반 for, while 루프 못 돌린다.
		
		for(Shop shop : shops) {
			System.out.println(shop);
		}
		
		System.out.println("=====================");
		//set의 요소를 List로 옮기기. -> addAll
		//List list = new ArrayList();
		//list.addAll(shops);
		
		//더 편한 방법
		List list = new ArrayList(shops);
		for(int i = 0; i < shops.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=====================");
		
		
		/*Iterator(반복자): StringTokenizer랑 비슷한 느낌.
		  hasNext(), next()
		  
		  ArrayList -> 배열로
		  LinkedList -> 노드를 연결
		  HashSet -> 해시테이블
		  ...
		  => 개발자가 구체적인 자료 구조를 모르더라도 반복시킬 수 있는 방법
		  */
		  
		  Iterator it = shops.iterator();
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
		  
		  // List계열, Set계열 전부 다 iterator()로 호출해서 반복할 수 있음.
		  // Map => 바로 사용은 불가.
		 
		  
		
		
		
		}

}
