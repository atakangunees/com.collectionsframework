package com.collectionsframework.main;

import com.collectionsframework.List.List;

public class LinkedList {
	
	
	public static void main(String[] args) {

		
		java.util.LinkedList<String> linklist = new java.util.LinkedList<String>();
		
		linklist.add("atakan");
		linklist.add("kerem");
		linklist.add("em");
		linklist.add("rem");
		linklist.add("k");
		System.out.println(linklist);
		
		java.util.List<String> sublist =  linklist.subList(2,4); // ilk eleman� dah�l ed�yor sonucu olan 4 u etm�yor yan� 2,3 ald�.
		
		for(int i = 0; i<sublist.size() ; i++) {
			System.out.println(sublist.get(i)); //get metodunu unutma!!!!!
		}
		
	}

}
