package com.kh.chap05.model.service;

import com.kh.chap05.model.vo.Soup;

public class TunaFilter implements SoupFilter {

	@Override
	public boolean test(Soup s) { //찌개 객체를 인자로 받는다.
		return s.getMainMenu().contains("참치");
	}

}
