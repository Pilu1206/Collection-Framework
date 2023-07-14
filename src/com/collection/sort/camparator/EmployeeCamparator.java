package com.collection.sort.camparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeCamparator {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp =new ArrayList<>();
		
		emp.add(new Employee(101,"Vijay",10000));
		emp.add(new Employee(103,"David",10000));
		emp.add(new Employee(105,"Gauri",10000));
		emp.add(new Employee(102,"Shree",10000));
		emp.add(new Employee(106,"Swara",10000));
		emp.add(new Employee(105,"Krishna",10000));
		
		// collection  custum sorting 
		// Collections.sort(emp ,new EmployeeIdCamparator()); 
		//Collections.sort(emp ,new EmployeeNameCamparator() );
		
		// Unanimous implimitation of sorting 
		Collections.sort(emp,new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				//return e1.id-e2.id; // using id sorting Unanimous 
				return e1.name.compareTo(e2.name); // using name we can sorting unanimous
			}
			
		});
		
		
		
		// print employee data 
		for(Employee s:emp) {
			System.out.println(s);
		}
	}

}
