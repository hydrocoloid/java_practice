package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.Arrays;

import com.kh.chap02.model.vo.Plant;

public class Run {
	
	public static void main(String[] args) {
	
		ArrayList plants = new ArrayList(3);
		Plant[] plantss = new Plant[3];
		
		System.out.println(plantss);
		System.out.println(plants);
		
		plantss[0] = new Plant("서양란", "호접란");
		plantss[1] = new Plant("동양란", "황룡관");
		plantss[2] = new Plant("관엽", "금전수");
		System.out.println(Arrays.toString(plantss));
		
		plants.add(new Plant("서양란", "호접란"));
		System.out.println(plants);
		
		plants.add(0, "식물 시작~");
		/*
		String hongkongTree = ((Plant)plants.get(0)).getType();
		System.out.println(hongkongTree);
		*/
		
		for(Object plant: plants) {
			System.out.println(plant);
		}
		
		System.out.println(plants.isEmpty());
		
		
		
		
	}

}
