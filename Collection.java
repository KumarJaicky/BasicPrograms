import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Collection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arrList = new ArrayList<>();
		arrList.add("A");
		arrList.add("B");
		arrList.add("BC");
		arrList.add("AD");
		arrList.add("AE");
		arrList.add("C");
		
		Collections.sort(arrList);
		System.out.println(arrList);

	}

}
