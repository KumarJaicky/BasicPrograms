public class Reverser 
{
	public static void main(String args[])
	{
		String myName = "Here we go";
		StringBuilder sb = new StringBuilder();
		sb = recursiveMethod(myName,sb);
		System.out.println(sb);
		
	}
	public static StringBuilder  recursiveMethod(String myName,StringBuilder sb)
	{
		
		int index = myName.lastIndexOf(" ");
		sb.append(myName.substring(index));
		myName  = myName.substring(0,index);
		if(myName.indexOf(" ")==-1)
		{
			sb.append(" "+myName.substring(0));
			return sb;
		}
		return recursiveMethod(myName,sb);
		
	}
}
