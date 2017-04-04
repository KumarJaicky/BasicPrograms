package com.java.Object;

import java.util.Arrays;

public class SumClosetToZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = {0,-1,2,5,7,-3,8};
		// TODO Auto-generated method stub
		int min_sum=0;
		int min_i=0;
		int min_j=0;
		boolean first=true;
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+",");
		}
		
		for(int i=0; i<arr.length;){
			//System.out.println(arr[i]);
			if(arr[i] == 0 && first){
				min_i=arr[i-1];
				min_j=arr[i+1];
				first=false;
			}else if(first){
				i++;
				continue;
			}
			min_sum=min_i+min_j;
				if(min_sum > 0){
					min_i=arr[i-2];
				}else if(min_sum < 0){
					min_j=arr[i+2];
				}else{
					break;
				}
			}
		System.out.println(min_i+":"+min_j);
		}

}
