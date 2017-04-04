
class TestPoly{
	

	/**
	 * @param args
	 */
	public void getNum(String a) {
		System.out.println(10+10+"getA"+10+10);
	}
	 
}
	
	
 public class Poly extends TestPoly{
	 
	 
	 
		
	 public Poly() {
		//super();
		
		return;
		// TODO Auto-generated constructor stub
	}

	public void getNum(String a) {
			System.out.println("getB");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
TestPoly testpoly = new TestPoly();
//Poly poly = new TestPoly();
testpoly.getNum("1");
		}
		
	}

