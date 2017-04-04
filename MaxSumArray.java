
public class MaxSumArray {
	
	public static int FindMaxSum(int arr[], int n)
	{
	  int incl = arr[0];
	  int excl = 0;
	  int excl_new;
	  int i;
	 
	  for (i = 1; i < n; i++)
	  {
	     /* current max excluding i */
	     excl_new = (incl > excl)? incl: excl;
	 
	     /* current max including i */
	     incl = excl + arr[i];
	     excl = excl_new;
	  }
	 
	   /* return max of incl and excl */
	   return ((incl > excl)? incl : excl);
	}
	 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 5, 10, 100, 10, 5};
		  int b=FindMaxSum(arr, 6);
		  System.out.println(b);

	}

}
