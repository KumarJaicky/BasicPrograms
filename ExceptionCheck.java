package com.java.Object;

public class ExceptionCheck extends Exception {
	
	static final int i=0;
	
	public int getIn(){
		int b =10;
		int c= 0;
		try{
			c = b/0;
			return 1;
			 
		}catch(Exception e){
			return 2;
		}finally{
			return 3;
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	int a=	new ExceptionCheck().getIn();
	System.out.println(a);
		// TODO Auto-generated method stub

	}

}
