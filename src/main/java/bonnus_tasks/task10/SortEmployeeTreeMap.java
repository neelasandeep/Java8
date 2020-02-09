package bonnus_tasks.task10;

import java.util.TreeMap;

import bonnus_tasks.task6.Employee;

public class SortEmployeeTreeMap {

	public TreeMap<Employee, Integer> sortEmployee() {

		return new TreeMap<>((employeeObject1, employeeObject2) -> {
			if (employeeObject1.getEmpName().compareTo(employeeObject2.getEmpName()) < 0) {
				return +1;
			} else if (employeeObject1.getEmpName().compareTo(employeeObject2.getEmpName()) > 0) {
				return -1;
			} else {
				return 0;
			}
		});

	}

}
