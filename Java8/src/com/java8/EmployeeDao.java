package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDao {

	public static List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(34, "Shakib", 400000));
		list.add(new Employee(4, "Suhan", 700000));
		list.add(new Employee(20, "Khuaf", 500000));
		list.add(new Employee(34, "Ajay", 1000000));
		list.add(new Employee(34, "Joy", 1400000));

		Collections.sort(list, (o1,o2)->(int)(o2.getSalary()-o1.getSalary()));
		return list;

	}
}

//class CustomSort implements Comparator<Employee> {
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return (int) (o1.getSalary() - o2.getSalary());
//	}
//
//} 