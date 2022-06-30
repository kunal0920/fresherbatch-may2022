package com.capgemini.Collection;

import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetMain {


	public static void main(String[] args) {
		
		EmployeeIdComparator employeeIdComparator = new EmployeeIdComparator();
		
		TreeSet <Employee> treeset = new TreeSet <Employee> (employeeIdComparator);
		
		Employee ahammad = new Employee("Ahammad",1);
		Employee durga = new Employee("Durga",2);
		Employee rohith = new Employee("Rohith",3);
		Employee kushal = new Employee("Kunal",4);
		Employee akshath = new Employee("Akshath",5);
		Employee mallesh = new Employee("Mallesh",6);
		Employee karthik = new Employee("Kartik",7);
		Employee siva = new Employee("Siva",8);
		Employee ritesh = new Employee("Ritesh",9);
		Employee manish = new Employee("Manish",10);
		
		treeset.add(ahammad);
		treeset.add(durga);
		treeset.add(rohith);
		treeset.add(kushal);
		treeset.add(akshath);
		treeset.add(mallesh);
		treeset.add(karthik);
		treeset.add(siva);
		treeset.add(ritesh);
		treeset.add(manish);
		
		//System.out.println("treeset : "+treeset+" /n");
		
		for( Employee employee : treeset) {
			
			System.out.println( "Name : " + employee.getName());
			System.out.println( "Employee ID : " + employee.getEmployeeId());
		}
		
	}}
	
