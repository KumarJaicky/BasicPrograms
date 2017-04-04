package com.java.Object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForLoopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> employeeList = new ArrayList<>();
		employeeList.add("atul");
		employeeList.add("ram");
		employeeList.add("mohan");
		employeeList.add(null);
		
		
		/*for(String str: employeeList){
			System.out.println(str);
			employeeList.remove(str);
			System.out.println(str);
		}*/
		
		Iterator<String> itr = employeeList.iterator();
		while(itr.hasNext()){
			Object ob = itr.next();
			System.out.println("ob +------"+ ob);
		itr.remove();
		
			System.out.println(itr.next());
		}
		

	}

}
