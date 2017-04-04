package com.java.Object;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Object> objList = new ArrayList<>();
		List<String> strList = new ArrayList<>();
		List<?> unknownList = new ArrayList<>();
		unknownList = strList;
		//objList = strList;
		objList.add(1);
		GenericTest gnGenericTest = new GenericTest();
		List<Object> objLst = null;
		gnGenericTest.identify(objLst);
		
		// TODO Auto-generated method stub

	}
public void identify(List<Object> objLst){
	
	for(Object obj : objLst){
		
		System.out.println("Current object is,,,,,,," + obj);
	}
	
	//return sum;
}
}
