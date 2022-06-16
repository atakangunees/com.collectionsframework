package com.collectionsframework.MAP;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
    
		
	  HashMap<String,Integer> map = new HashMap<String, Integer>();
	  
	  map.put("Atakan",24);
	
	  boolean b = map.containsValue(74);
	
     System.out.println(b);
	
	
	}

}
