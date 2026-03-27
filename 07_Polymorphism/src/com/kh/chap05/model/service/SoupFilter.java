package com.kh.chap05.model.service;

import com.kh.chap05.model.vo.Soup;

public interface SoupFilter {
	
	boolean test(Soup s);
	//인터페이스는 해야 할 일만 적어 놓은 설계도라서 반드시 인터페이스를 구현할 클래스가 필요함.

}
