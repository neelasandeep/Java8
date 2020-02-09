package bonustasksTestcases.task10testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bonnus_tasks.task10.SortEmployeeTreeMap;
import bonnus_tasks.task6.Employee;

public class SoretedEmployeeTreeMapTest {
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void sortTreeMap() {
		Map<Employee, Integer> setOfEmployees = new SortEmployeeTreeMap().sortEmployee();

		setOfEmployees.put(new Employee("Sandeep", 555), 1);
		setOfEmployees.put(new Employee("Ramesh", 545), 2);
		setOfEmployees.put(new Employee("Rakesh", 955), 3);
		setOfEmployees.put(new Employee("Suresh", 560), 4);
		setOfEmployees.put(new Employee("Raju", 9888), 5);
		List<Employee> setOfEmployees2 = new ArrayList<>();

		setOfEmployees2.add(new Employee("Sandeep", 555));
		setOfEmployees2.add(new Employee("Ramesh", 545));
		setOfEmployees2.add(new Employee("Rakesh", 955));
		setOfEmployees2.add(new Employee("Suresh", 560));
		setOfEmployees2.add(new Employee("Raju", 9888));
		setOfEmployees.forEach((key, value) -> {
			
			softAssert.assertEquals(key.getEmpName(), setOfEmployees2.get(value - 1).getEmpName());
			softAssert.assertAll();
		});

		System.out.println(setOfEmployees2);

	}
}
