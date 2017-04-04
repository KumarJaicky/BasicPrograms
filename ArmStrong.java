
public class ArmStrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		arm(153);
	}		
		public static void arm(int num){
			int r=0;
			int sum =0;
			int n =0;
			n=num;;
		 while( num != 0 )
	      {
	         r = num%10;
	         sum = sum + r*r*r;
	         num = num/10; 
	      }
	 
	      if ( n == sum )
	         System.out.println("Entered number is an armstrong number.");
	      else
	         System.out.println("Entered number is not an armstrong number.");         
	   }

}
