package com.java.Object;

public class UniqueString {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		merge("{[)}");
	
	

	}
	
		public static void merge(String str) 
		{
			
			int i = 0;
			int j = 0;
		 if(str.contains("{")|| str.contains("[") || str.contains("(")){
			 i++;
			 
		 }
		 if(str.contains("}")|| str.contains("]") || str.contains(")")){
			 j++;
		}
		if(i==j){
			System.out.println("true");
		}else{
			System.out.println("false");	
		}
		}
}