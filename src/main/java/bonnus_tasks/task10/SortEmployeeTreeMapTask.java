package bonnus_tasks.task10;

import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import bonnus_tasks.task6.Employee;
import util.BaseClass;

public class SortEmployeeTreeMapTask {
	static Logger logger = Logger.getLogger(SortEmployeeTreeMapTask.class);

	public static void main(String[] args) {

		BaseClass.getBaseClassLogger();
		Map<Employee,Integer> setOfEmployees = new SortEmployeeTreeMap().sortEmployee();

		setOfEmployees.put(new Employee("Sandeep", 555),1);
		setOfEmployees.put(new Employee("Ramesh", 545),2);
		setOfEmployees.put(new Employee("Rakesh", 955),3);
		setOfEmployees.put(new Employee("Suresh", 560),4);
		setOfEmployees.put(new Employee("Raju", 9888),5);
		
		logger.info("Employee After sorting with custom comparator\n" + setOfEmployees);
	Map<Employee,Integer> setOfEmployees2 =new TreeMap<>(new SortEmployeeTreeMapWithoutLambda());

	setOfEmployees2.put(new Employee("Sandeep", 555),1);
	setOfEmployees2.put(new Employee("Ramesh", 545),2);
	setOfEmployees2.put(new Employee("Rakesh", 955),3);
	setOfEmployees2.put(new Employee("Suresh", 560),4);
	setOfEmployees2.put(new Employee("Raju", 9888),5);
		logger.info("Employee After sorting without lambda custom comparator\n" + setOfEmployees2);

	}

}
