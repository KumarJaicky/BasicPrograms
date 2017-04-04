package com.java.Object;

import java.util.LinkedList;

public class LinkedListTest {
	
	class ListNode{
		private int data;
		private ListNode listNode;
		/**
		 * @return the data
		 */
		public int getData() {
			return data;
		}
		/**
		 * @param data the data to set
		 */
		public void setData(int data) {
			this.data = data;
		}
		/**
		 * @return the listNode
		 */
		public ListNode getListNode() {
			return listNode;
		}
		/**
		 * @param listNode the listNode to set
		 */
		public void setListNode(ListNode listNode) {
			this.listNode = listNode;
		}
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList linkedList = new LinkedList<>();
		ListNode listNode = new ListNode();
		listNode.setData(2);
		listNode.setListNode(null);
		
		linkedList.add(1);
		linkedList.add("ABC");
		linkedList.add(listNode);
		
		for(Object object : linkedList){
			System.out.println(object);
		}

	}

}
