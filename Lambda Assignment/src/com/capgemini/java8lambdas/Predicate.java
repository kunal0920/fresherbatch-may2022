package com.capgemini.java8lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Predicate {

	public static void main(String[] args) {
	    List<String> l = new ArrayList<>();
	    l.add("successfully");
	    l.add("easy");
	    l.add("fortune");
	    List<String> filtered = l.stream().filter( s -> s.length() > 5 ).collect(Collectors.<String>toList());
	    System.out.println(filtered);
	  }
	}


