package com.java.Object;
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        String str1;
        String str2;
        ////Scanner scanner = new Scanner(System.in);
        ///System.out.println("enter 1st string");
        ////str1=scanner.nextLine();
       /// System.out.println("enter 2nd string");
        ///str2=scanner.nextLine();
        Solution sol = new Solution();
        sol.getUnmatchedString("ABC","BC");
        sol.getUnmatchedString("BC","BANGALORE");

        sol.getUnmatchedString("xxyy","yzz");

        
    }
   private void getUnmatchedString(String str1, String str2){
       char[] arrStr1 = str1.toCharArray();
       char[] arrStr2 = str2.toCharArray();
       StringBuilder str3 = new StringBuilder();
       StringBuilder str4 = new StringBuilder();
       List<Character> list1 = new ArrayList<Character>();
       List<Character> list2 = new ArrayList<Character>();
       Set<Character> set1 = new HashSet<Character>();
       Set<Character> set2 = new HashSet<Character>();
       for(int i=0;i<arrStr1.length;i++){
    	   
          if(!set1.add(arrStr1[i])){
        	  list1.add(arrStr1[i]);
          }else{
        	  set1.add(arrStr1[i]);
          }
       }
       for(int j=0;j<arrStr2.length;j++){
    	   if(!set2.add(arrStr2[j])){
    		   list2.add(arrStr2[j]);
           }else{
         	  set2.add(arrStr2[j]);
           }
       }
       for(Character chr : set1){
    	   if(set2.add(chr) ){
    		   str3.append(chr);
    	   }
       }
       /*for(int i=0;i<arrStr2.length;i++){
           for(int j=0;i<arrStr1.length;j++){
               if(arrStr1[i] != arrStr2[j]){
                   str4=str4.append(arrStr1[i]);
               }
           }
       }*/
       
       for(Character chr : set2){
    	   if(set1.add(chr)){
    		   str4.append(chr);
    	   }
       }
       System.out.println(str3.toString());
      System.out.println(str4.toString());
   }
}