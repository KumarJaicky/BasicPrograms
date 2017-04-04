package com.java.Object;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class FindTwoNum {

	/**
	 * @param args
	 */
	static void search(int[] arr,int produt) {
		/*int left=0;int right=arr.length-1;
		while(left<right){
			if(arr[left]%2==0){
				left++;
			}
			if(arr[right]%2==1){
				right--;
			}
			if(arr[left]%2!=0 && arr[right]%2!=1){
				int temp=0;
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
		
		for(int i : arr){
			System.out.println(i);
		}*/
		
		HashMap<Integer,String> map = new HashMap();
		int key=0;
		String value="";
		//try{
			for(int k=0;k<arr.length;k++){
			if(map.containsKey(produt/arr[k])){
				System.out.println(arr[k]+":"+produt/arr[k]);
			}else{
				map.put(arr[k], null);
			}
			
			}
		//}
			/*catch(ArithmeticException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={6,4,2,0,1,3,1,0};
		try{
		search(arr,36);
		}catch(ArithmeticException arithmeticException){
			System.out.println("check");
		}
		
			
	}

}
