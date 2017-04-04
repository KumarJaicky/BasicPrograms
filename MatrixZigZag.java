package com.java.Object;

public class MatrixZigZag {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {{ 1, 2, 3, 4, 5},
		         { 6, 7, 8, 9,10},
		         {11,12,13,14,15},
		         {16,17,18,19,20},
		         {21,22,23,24,25}};
		int i=0;int j=0;
		int MAX=5;
		while(i<MAX){
			if(i==MAX-1){
	             i = j+1; j = MAX-1;
	             
	         }
	         else if(j==0){
	             j = i+1; i = 0;
	         }
	         else{
	             i++; j--;
	         }
			System.out.println(arr[i][j]);
		}

	}

}
