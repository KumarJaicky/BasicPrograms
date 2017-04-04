package com.java.Object;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCAC";
		StringBuilder builder = new StringBuilder();
		boolean[] char_set = new boolean[256];
		HashSet<Character> hset = new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++){
			
				hset.add(str.charAt(i));
				
		}
		System.out.println(hset.toString());
	}
}
