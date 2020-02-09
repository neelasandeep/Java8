package bonustasksTestcases.task11testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bonnus_tasks.task6.Employee;
import bonnus_tasks.task6.EmployeeSortByNameWithLambda;

public class SortByNameTest {
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void employeeSortTest() {
		List<Employee> employeesList = new ArrayList<>();
		employeesList.add(new Employee("Sandeep", 555));
		employeesList.add(new Employee("Ramesh", 545));
		employeesList.add(new Employee("Rakesh", 955));
		employeesList.add(new Employee("Suresh", 560));
		employeesList.add(new Employee("Raju", 9888));
		List<Employee> employeesList2 = new ArrayList<>();
		employeesList2.add(new Employee("Raju", 9888));
		employeesList2.add(new Employee("Rakesh", 955));
		employeesList2.add(new Employee("Ramesh", 545));
		employeesList2.add(new Employee("Sandeep", 555));
		employeesList2.add(new Employee("Suresh", 560));
		int index = 0;
		for (Employee emp : new EmployeeSortByNameWithLambda().sortEmployeeUsingComparator(employeesList)) {
			softAssert.assertEquals(emp.getEmpName(), employeesList2.get(index).getEmpName());
			softAssert.assertEquals(emp.getEmpNumber(), employeesList2.get(index).getEmpNumber());
			softAssert.assertAll();
			index++;
		}

	}

}
