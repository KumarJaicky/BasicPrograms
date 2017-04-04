package com.java.Object;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CollectionTst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Object> list = new ArrayList<>();
list.add(null);
HashSet<String>set = new HashSet<>();
set.add(null);
for(String object : set){
	System.out.println(object);
}
	}
}
