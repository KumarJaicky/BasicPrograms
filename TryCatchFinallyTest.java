package com.java.Object;

public class TryCatchFinallyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
		// TODO Auto-generated method stub
             int k= test();
             System.out.println(k);
		}catch(Exception e){
			System.out.println("catch main");
		}
	}
	
	public static int test() throws ExceptionCheck{
		int a = 10;
		int b = 0;
		try{
			//a=a/b;
			return 5;
		}catch(Exception e){
			return 6;
		}finally{
			return 7;
			//throw new ExceptionCheck();
			}
		}
	}

