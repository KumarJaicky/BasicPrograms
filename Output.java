package com.java.Object;

class Output {
        public static void main(String args[]) {
        	String s = "ababababa"; 
        	String regex = "aba"; 
        	int count = 0, index = 0; 

        	while (index != -1) { 
        	count++; 
        	index = s.indexOf("aba", index + regex.length() - 1); 
        	}
        	System.out.println("No of occurrence "+count);
        }
}