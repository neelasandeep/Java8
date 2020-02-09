package bonustasksTestcases.task8testcases;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bonnus_tasks.task6.Employee;

import bonnus_tasks.task8.SortEmployeeTreeSet;
import util.BaseClass;

public class SortEmployeeTreeSetTest {
	SoftAssert softAssert = new SoftAssert();
	Logger logger = Logger.getLogger(SortEmployeeTreeSetTest.class);

	@Test
	public void sortEmployee() {
		BaseClass.getBaseClassLogger();
		Set<Employee> setOfEmployees = new SortEmployeeTreeSet().sortEmployee();

		setOfEmployees.add(new Employee("Sandeep", 555));
		setOfEmployees.add(new Employee("Ramesh", 545));
		setOfEmployees.add(new Employee("Rakesh", 955));
		setOfEmployees.add(new Employee("Suresh", 560));
		setOfEmployees.add(new Employee("Raju", 9888));
		List<Employee> setOfEmployees2 = new ArrayList<>();
		setOfEmployees2.add(new Employee("Raju", 9888));
		setOfEmployees2.add(new Employee("Rakesh", 955));
		setOfEmployees2.add(new Employee("Ramesh", 545));
		setOfEmployees2.add(new Employee("Sandeep", 555));
		setOfEmployees2.add(new Employee("Suresh", 560));

		int index = 0;

		if ((setOfEmployees.size() == setOfEmployees2.size())) {
			for (Employee emp : setOfEmployees) {

				softAssert.assertEquals(emp.getEmpName(), setOfEmployees2.get(index).getEmpName());
				softAssert.assertEquals(emp.getEmpNumber(), setOfEmployees2.get(index).getEmpNumber());
				softAssert.assertAll();
				index++;

			}
		} else {
			logger.info("something went wrong in aorting so size is not same");
		}
	}

}
