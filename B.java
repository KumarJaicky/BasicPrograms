package com.java.Object;

import java.util.ArrayList;
import java.util.List;

public class B extends C{
	List<?> listraw = new ArrayList<>();
	List<String> str = new ArrayList<String>();
	
	
	public Long getName(int a,int b){
		listraw = str;
		str = listraw;
		System.out.println("in B");
		return 1;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c = new B();
c.getName(1, 2);
	}

}

class C{
	public Long getName(int a , int b){
		System.out.println("in c");
		return 0L;
	}
	
}
