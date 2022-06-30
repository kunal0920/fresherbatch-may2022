package com.capgemini.Generics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.jar.Attributes.Name;

public class Employee 
{

	int id;
	String name;
	double salary;
	String department;
	public Employee(int id, String name, double salary, String department)
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public void displayDetails(int id,String name,double salary,String department)
	{
		System.out.println("id:"+id +"name:" + name+"salary:" + salary +"department:"+department);
	}
	public String toString()
	{
		return "id:"+id +"name:" + name+"salary:" + salary +"department:"+department;
		 
	}
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1233,"Rohit",20000.00,"mechanical");
		Employee e2 = new Employee(1222,"Kunal",12222.00,"computer science");
		Employee e3 = new Employee(1256,"Kiran",56000.00,"electronics");
		
		e1.displayDetails(1233,"Rohit",20000.00,"mechanical");
		e2.displayDetails(1222,"Kunal",12222.00,"computer science");
		e3.displayDetails(1256,"Kiran",56000.00,"electronics");
		
		HashSet<Employee> h = new HashSet<Employee>();
		h.add(e1);
		h.add(e2);
		h.add(e3);
		
		for(Employee obj:h)
		{
			System.out.println(obj);
		}
		
	}
	
	
}
