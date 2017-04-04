package com.java.Object;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Handler;

public class SortArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] intArray = {1,4,2,7,3,5,8,3};
        int a =  getMax(intArray);
        System.out.println(a);*/
		String str = "ab,abc,ab,cd,abc,dc";
		str = "";
		getMax(str);
	}

	
	/*public static int getMax(int[] ints){
		int max=0;
		Arrays.sort(ints);
		max=ints[ints.length-1];
		 return max; 
	}*/
	
	public static void getMax(String str){
     String[] strArray = str.split(",");
     HashMap<String,Integer> countMap = new HashMap<>();
     Set<String> removerdSet = new HashSet<>();
     for(int i = 0; i < strArray.length ; i++){
    	 /*if(countMap.containsKey(strArray[i])){
    		 countMap.put(strArray[i], countMap.get(strArray[i])+1);
    		 
    	 }else{
    		 countMap.put(strArray[i],1);
    	 }*/
    	 removerdSet.add(strArray[i]);
     }

     /*Set<String> keSet =  countMap.keySet();
     for(String string : keSet){
    	 if(countMap.get(string) == 1){
    		 System.out.println(string);
    	 }
     }*/
     System.out.println(removerdSet);
	}
}
