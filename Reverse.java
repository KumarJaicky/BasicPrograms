package com.java.Object;
public class Reverse { 
static public void main(String args[]) throws Exception { 
String str = String.valueOf(1234);
while(str.length()>1) {
	int n = Integer.valueOf(str.charAt(0))*(10^(str.length()-1));
	System.out.println(n+"+");
	
	str = str.substring(1);
}
} 
}