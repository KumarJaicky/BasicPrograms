package com.java.Object;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String args[]){
		change("aabcbdc","abc");
	}
	
		
public static void change(String s, String t){
	int count=0;
	while(s.length()>=t.length()){
	boolean present =  s.contains(t);
	
	if(present){
		count++;
		s=s.replaceAll(t, "");
	}else{
		break;
	}
	
	}
	System.out.println(count);
	
	
}

}
