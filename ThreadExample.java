
public class ThreadExample implements Runnable{

public void run(){
	System.out.println("Thread running");
}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread example = new Thread();
		example.start();
	}

}
