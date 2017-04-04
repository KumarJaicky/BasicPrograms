package com.java.Object;


public class MinAbsThreeNoPair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={-1,3,1,9,10,11,15};
		search(arr);
	}
	
	static void search(int[] arr){
		int sum,min_sum=Integer.MAX_VALUE;
		int i=0;int min_i=i;
		int j=0;int min_j=j;
		int k=arr.length-1;int min_k=k;
		for(;i<arr.length;i++){
			j=i+1;
		while(j<k){
			sum=arr[i]+arr[j]+arr[k];
			if(Math.abs(sum)<Math.abs(min_sum)){
				min_sum=sum;
				min_i=i;
				min_j=j;
				min_k=k;
				
			}
			if(sum<0){
				j++;
			}else{
				k--;
			}
		}
		}
		System.out.println(arr[min_i] + ":" + arr[min_j] + ":" + arr[min_k]);
		
	}

}
