
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
	    for(int index = 0;index<=10;index++)
	   
	    {
	        System.out.println(fibonacci(index));
	    }
	}
	    public static long fibonacci (int i)
	    {
	        if (i == 0 || i==1) return i;

	        else return fibonacci(i - 1) + fibonacci(i - 2);
	    }

}
