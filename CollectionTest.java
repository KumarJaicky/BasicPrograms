import java.util.ArrayList;
import java.util.Collections;


public class CollectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("Ab");
		stringList.add("Bc");
		stringList.add("Ae");
		stringList.add("Ac");
		stringList.add("Bf");
		stringList.add("aa");
		System.out.println("Unsortd"+stringList);
		Collections.sort(stringList);
		System.out.println("sortd"+stringList);
		

	}

}
