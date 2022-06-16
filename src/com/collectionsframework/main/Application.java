package com.collectionsframework.main;

import java.util.ArrayList;
import java.util.Iterator;

public class Application {
	// eger kednýmýz koleksýyon sýnýf olsturursak ýterable interfaceini implement
	// ederse while yerine for i yaparaýz.

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<Object>();
		ArrayList<Object> list2 = new ArrayList<Object>();

		list.add("Atakan");
		list.add(24);
		list.add(24); // istediðimiz kadar ayný elemaný ekleyebýlrýz.
		list.add(new Person());

		String s = (String) list.get(0); // list.get dediðimizde string öetodlarý yok cunku array list duzensýz
											// alabýlýor o yuzden cast ettýk.
		char c = s.charAt(0);
		System.out.println(c);
		
		list2.add(list);

		System.out.println(list);
		System.out.println(list2);

		boolean iceriyorMu = list.contains(24);

		System.out.println(iceriyorMu);
		System.out.println("-");

		boolean iceriyorMu2 = list.contains(21);

		System.out.println(iceriyorMu2);
		System.out.println("-");

		for (Object o : list) {

			System.out.println(o);
		}

		Iterator<Object> i = list.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());
		}

		System.out.println("------");

	}

}
