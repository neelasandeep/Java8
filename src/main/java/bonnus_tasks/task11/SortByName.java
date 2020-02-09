package bonnus_tasks.task11;

import java.util.Collections;
import java.util.List;

import bonnus_tasks.task6.Employee;

public class SortByName {
	public List<Employee> sortEmployeeByName(List<Employee> employeesList) {
		Collections.sort(employeesList, (employeeObject1, employeeObject2) -> {
			if (employeeObject1.getEmpName().compareTo(employeeObject2.getEmpName()) < 0) {
				return +1;
			} else if (employeeObject1.getEmpName().compareTo(employeeObject2.getEmpName()) > 0) {
				return -1;
			} else {
				return 0;
			}

		});
		return employeesList;
	}

}
