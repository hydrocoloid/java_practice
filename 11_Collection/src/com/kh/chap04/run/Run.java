package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Map;

import com.kh.chap04.model.vo.Sandwich;

public class Run {

	public static void main(String[] args) {
		
		/* map
		 * list, set은 주소값만 저장. map은 Key+Value 세트로 저장.
		 * Key는 고유해야 함. 절대 중복 ㄴㄴ.
		 * Value는 중복 돼도 상관 없음.
		 */
		
		/*HashMap
		 * 키 => 식별자 => 샌드위치 이름
		 * 밸류 => 샌드위치 객체
		 */
		
		Map<String, Sandwich> subway = new HashMap();
		//비어 있는 맵에 요소를 추가해보자.
		//HashMap -> put() *꼭 key+value를 함께 요소로 추가해야 함!
		//put(K key, V value):  Map에 key+value 세트로 요소 추가.
		
		subway.put("에그머니마요", new Sandwich("고소함","계란과 마요네즈"));
		subway.put("피자마요", new Sandwich("피자맛","모짜렐라치즈, 햄, 마요네즈"));
		subway.put("페퍼로니", new Sandwich("존나짬","페퍼로니"));
		//순서 보장 안 됨.
		subway.put("빼빼로니", new Sandwich("존나짬","빼빼 마른 페퍼로니"));
		//value값은 중복 저장 허용됨.
		subway.put("페퍼로니", new Sandwich("짭짜리맛","페퍼로니"));
		//key(식별자)에 중복이 발생하면 덮어 씌워짐.
		
		//System.out.println(subway);
		
		
		/*get(Object key): Object
		 * 인자로 전달된 key값에 해당하는 value값을 반환해주는 메소드
		 * key로 value를 찾아 옴.
		 */
		System.out.println(subway.get("피자마요"));
		System.out.println(subway.get("없는 샌드위치"));
		
		System.out.println(subway.size());
		System.out.println(subway.isEmpty());
		
		//replace(K key, V value): key로 요소를 찾아서 value값을 치환해줌.
		//기존하지 않는 키값을 인자로 전달하면 추가하지 않음. (=put과의 차이점).
		subway.replace("에그머니마요", new Sandwich("rich한 맛", "에그, 돈, 마요"));
		System.out.println(subway);
		
		//remove(Object Key)
		subway.remove("빼빼로니");
		System.out.println(subway);
		
		
		/* Map에 들어 있는 모든 요소들에 순차적으로 접근해야 한다면?
		 * addAll(Collection c) 안 됨~
		 * for loop문 안 됨. while문 안 됨. for( : ) 안 됨, Iterator 안 됨.
		 * forEach + 람다
		 */
		 
		subway.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
		
		/*
		Map이 Key-Value를 세트로 가지고 있음.
		Key값들만 Set으로 바꿔줘야 함 -> Set으로 바꾸면 Iterator 사용 가능.
		
		1) Map의 Key들만 Set으로 만들기
		Set<String> subSet = subway.keySet();
		2) Set을 Iterator로 변경.
		3) 반복문 사용하기
		
		entrySet 사용하는 방법도 있다.
		근데 그냥 람다 쓰는 게 제일 편한듯ㅋㅋ.
		*/
		
		
		
	}

}
