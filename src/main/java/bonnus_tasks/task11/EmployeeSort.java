package bonnus_tasks.task11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

import bonnus_tasks.task6.Employee;

import util.BaseClass;

public class EmployeeSort {
	static Logger logger = Logger.getLogger(EmployeeSort.class);

	public static void main(String[] args) {
		BaseClass.getBaseClassLogger();
		
	List<Employee> employeesList = new ArrayList<>();
	employeesList.add(new Employee("Sandeep", 555));
	employeesList.add(new Employee("Ramesh", 545));
	employeesList.add(new Employee("Rakesh", 955));
	employeesList.add(new Employee("Suresh", 560));
	employeesList.add(new Employee("Raju", 9888));
	Collections.sort(employeesList);
	logger.info("Employee before sorting with custom comparator\n" +
			employeesList);
	
	logger.info("Employee after sorting with custom comparator\n" + 
	     new SortByName().sortEmployeeByName(employeesList));
	}

}
