package com.java.Object;

import java.io.IOException;

public class A {
	
void check() throws IOException{
	int b=10;
	try{
		int a = b/0;
	}
	/*catch(IOException a){
		System.out.println("catch");
	}*/
    catch(Exception e){
	System.out.println("catch");
	}
	finally{
		System.out.println("Finally");
	}
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	A av = new A();
	try {
		av.check();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
	 
}
