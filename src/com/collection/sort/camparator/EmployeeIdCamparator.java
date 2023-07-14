package com.collection.sort.camparator;

import java.util.Comparator;

public class EmployeeIdCamparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.id-e2.id;
	}

}
