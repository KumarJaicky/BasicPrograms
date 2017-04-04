package com.java.Object;

public class OperatorTest {

	public OperatorTest() {
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {0,1,1,0,1};
		for(int i = 0; i< arr.length; i++){
			int j=arr.length-1;
			int temp=0;
			while(j>i){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
				else{
					j--;
				}
			}
				
			
		}
		for(int i = 0; i< arr.length; i++){
			System.out.println(arr[i]);
		}
		
	}

}
