package com.java.Object;

import java.util.Vector;

public class NullCheck {

	public void check(String a){
		System.out.println("String");
	}
	
    public void check(Object a){
    	System.out.println("int");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullCheck check = new NullCheck();
		check.check(0);

	}

}
