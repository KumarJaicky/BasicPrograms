package com.java.Object;

public class ReplaceStringWithSpace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String finalString = replaceString("Alive is awesome","%20");

		System.out.println(finalString);
	}

	public static String replaceString(String str,String item){
		StringBuilder builder = new StringBuilder();
		for(int i = 0;i < str.length() ; i++){
			if(str.charAt(i) == ' '){
				builder.append(item);
			}else{
				builder.append(str.charAt(i));
			}
		}
		/*String builder = "";
		String[] strArray = new String[10];
		
		strArray = str.split(" ");
		for(int i = 0;i < strArray.length ; i++){
			
				builder=builder+strArray[i] + ("%20");
			}
		
		String finalString = builder.substring(0,;

		return finalString;*/
		return builder.toString();
	}

}
