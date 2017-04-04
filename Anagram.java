package com.java.Object;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {

	/**
	 * @param args
	 * sys
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anagram("ABCD","ACBD");

	}
	
	public static void anagram(String s, String t) {
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		Arrays.sort(tArray);
	    Arrays.sort(sArray);
	    
	   System.out.println(tArray==sArray);
		 }

}
