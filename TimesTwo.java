
abstract class Product1 { 
    public int multiplyBy;
    public Product1( int multiplyBy ) {
        this.multiplyBy = multiplyBy;
        System.out.println("yes");
    }
   /* public Product1() {
        this.multiplyBy = multiplyBy;
        System.out.println("yes");
    }*/
    public int mutiply(int val) {
       return multiplyBy * val;
    }
	public void multiplyBy(int i) {
		// TODO Auto-generated method stub
		
	}
}

public class TimesTwo extends Product1 {
    public TimesTwo() {
       // super(2);
        System.out.println("no");
    }
    public int mutiply(int val) {
    	super.multiplyBy(2);
        return multiplyBy * val;
     }
    public static void main(String args[]) {
    	super.
		TimesTwo timesTwo = new TimesTwo();
		TimesWhat timesWhat = new TimesWhat(1);
		
	}
}

class TimesWhat extends Product1 {
    public TimesWhat(int what) {
        //super(what);
    	System.out.println("yeah");
    }
}
