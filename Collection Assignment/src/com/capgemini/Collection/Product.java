package com.capgemini.Collection;

import java.util.TreeSet;

public class Product {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("Apple");
		t.add("Samsung");
		t.add("Mi");
		t.add("Oppo");
		t.add("Sony");
		t.add("Realme");
		t.add("Honor");
		t.add("Nokia");
		t.add("Asus");
		t.add("Oneplus");
		t.add("Apple");

		for(String i : t) {
			System.out.println(i);
		}
	}

}
