package bonnus_tasks.task8;

import java.util.Set;
import java.util.TreeSet;

import bonnus_tasks.task6.Employee;

public class SortEmployeeTreeSet {

	public Set<Employee> sortEmployee() {

		return new TreeSet<>((employeeObject1, employeeObject2) -> {
			if (employeeObject1.getEmpName().compareTo(employeeObject2.getEmpName()) > 0) {
				return +1;
			} else if (employeeObject1.getEmpName().compareTo(employeeObject2.getEmpName()) < 0) {
				return -1;
			} else {
				return 0;
			}

		});

	}

}
