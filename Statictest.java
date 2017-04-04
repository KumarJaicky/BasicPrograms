/*class Test{
	private String name;
	Test(){
		System.out.println("A");
	}
	Test(String name){
		this.name= name;
		System.out.println("B");
	}
}*/


public class Statictest{
	private String name;
	Statictest(){
		System.out.println("E");
	}
	
	Statictest(String name){
		System.out.println("F");
	}
	static{
		System.out.println("A");
	}
	
	
	static void getNum(){
		System.out.println("B");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getNum();
		// TODO Auto-generated method stub
		Statictest statictest = new Statictest("X");
		System.out.println("C");

	}

}
