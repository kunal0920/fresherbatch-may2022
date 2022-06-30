package com.capgemini.Collection;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee>{

	public int compare(Employee employee1 , Employee employee2) {
		
		System.out.println("employee1  = "+employee1+ " employee2 = "+employee2+ " /n");
		
		if(employee1.getEmployeeId() < employee2.getEmployeeId()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	

}