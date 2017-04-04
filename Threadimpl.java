package com.java.Object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Threadimpl implements Runnable {
	

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
new Thread(new Threadimpl()).start();
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("a");
		
		
		
	}

}
