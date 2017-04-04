
public class B{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " I live in India";
		/*String[] split = s.split(" ");
		String result = "";
		for (int i = split.length - 1; i >= 0; i--) {
		  result += (split[i] + " ");
		}
		System.out.println(result.trim());*/
		/*StringBuilder strBldr = new StringBuilder();*/
		String[] split = s.split(" ");
		System.out.println(split[0]);
		/*char[] charArr = s.toCharArray();
		for(int i= charArr.length-1; i>0;i--){
			strBldr=strBldr.append(charArr[i]);
			
		}
		System.out.println(strBldr);*/
		
	}

}
