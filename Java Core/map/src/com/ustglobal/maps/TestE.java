package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {


	public static void main(String[] args) {

		TreeMap<String , Integer> lh = new TreeMap<String , Integer>();


		lh.put("Bangaloer ", 560076);
		lh.put("Hariyana  ", 134203);
		lh.put("patna     ", 800001);
		//	lh.put(     null, 800001); NullPointerException


		for(Map.Entry<String, Integer> m : lh.entrySet()) {

			String key= m.getKey();

			Integer value =m.getValue();
			System.out.println("Key is "+key+"------->"+"\n"+value);

			System.out.println("==============================");
		}
	}
}
