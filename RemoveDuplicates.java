package com.java.Object;

public class RemoveDuplicates {

	public static void removeDuplicates(String str){
		char[] charArray = str.toCharArray();
		if(charArray == null){
			return;
		}if(charArray.length < 2){
			return;
		}
		int tail = 1;
		for(int i=1;i<charArray.length;i++){
			for(int j=0;j<tail;j++){
				if(charArray[i]==charArray[j]){
					break;
				}
			
			if(j==tail){
				charArray[tail]=charArray[j];
				tail++;
			}
		}
		}
		//charArray[tail]=0;
		for(char c : charArray){
			System.out.println(c);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			removeDuplicates("abcdab");
	}

}
