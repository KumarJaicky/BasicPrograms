
public class PrimeNoCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPrime(4));
	}
	
	public static boolean isPrime(int n) { 
		double sqrt = Math.sqrt(n);
		if (n < 1) { 
		return false; 
		}else if(n==1){
			return true;
		}
		for (int i = 2; i < sqrt; i++) { 
		if (n % i == 0) { 
		return false; 
		} 
		} 
		return true; 
		}

}
