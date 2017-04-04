
public class A implements IntrA{

	static int a=1;
	/*static{
		System.out.println("B");
	}*/
	public static void main(String args[]){
		System.out.println("A");
		IntrA intrA = new A();
		A a = new A();
		a.getNum(2);
	}

	private void getNum(int a){
		a= a+1;
		System.out.println(a);
	}

	@Override
	public void getNum() {
		// TODO Auto-generated method stub
		
	}
}
