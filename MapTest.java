package com.java.Object;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "RAM");
		map.put(3, "SHYAM");
		map.put(5, "Sohan");
		map.put(2, "ramnesh");
		Set<Integer> keys = map.keySet();
		Object[] keyArray = keys.toArray();
		
			System.out.println(map.get(keyArray[3]));
			
	}

}
