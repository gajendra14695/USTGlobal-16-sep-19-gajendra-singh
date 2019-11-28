package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

		
		public static void main(String[] args) {
			
			LinkedHashMap<String , Integer> lh = new LinkedHashMap<String , Integer>();
		
		lh.put("Bangaloer", 560076);
		lh.put(
				 "Hariyana", 134203);
		lh.put("patna", 800001);
		System.out.println(lh);
		
		Set<String> s = lh.keySet();
		for (String string : s) {
			System.out.println("Key "+string);
		}
		
		Collection<Integer> c=lh.values();
		for (Integer integer : c) {
			System.out.println("values "+integer);
		}
		
		
		
		
		
		
		
		
		}
}
