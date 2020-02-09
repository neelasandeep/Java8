package bonnus_tasks.task8;

import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;

import bonnus_tasks.task6.Employee;
import util.BaseClass;

public class SortEmployeeTreesetTask {
	static Logger logger = Logger.getLogger(SortEmployeeTreesetTask.class);

	public static void main(String[] args) {

		BaseClass.getBaseClassLogger();
		Set<Employee> setOfEmployees = new SortEmployeeTreeSet().sortEmployee();

		setOfEmployees.add(new Employee("Sandeep", 555));
		setOfEmployees.add(new Employee("Ramesh", 545));
		setOfEmployees.add(new Employee("Rakesh", 955));
		setOfEmployees.add(new Employee("Suresh", 560));
		setOfEmployees.add(new Employee("Raju", 9888));
		logger.info("Employee After sorting with custom comparator\n" + setOfEmployees);
		
		Set<Employee> setOfEmployees2 = new TreeSet<>(new SortByName());

		setOfEmployees2.add(new Employee("Sandeep", 555));
		setOfEmployees2.add(new Employee("Ramesh", 545));
		setOfEmployees2.add(new Employee("Rakesh", 955));
		setOfEmployees2.add(new Employee("Suresh", 560));
		setOfEmployees2.add(new Employee("Raju", 9888));
		
		logger.info("Employee After sorting with custom comparatorWithoutLambda\n" + setOfEmployees2);

	}

}
