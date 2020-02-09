package bonnus_tasks.task8;

import java.util.Comparator;

import bonnus_tasks.task6.Employee;

public class SortByName implements Comparator<Employee>{
	@Override
	public int compare(Employee employeeObject1, Employee employeeObject2) {
		if (employeeObject1.getEmpName().compareTo(employeeObject2.getEmpName()) > 0) {
			return +1;
		} else if (employeeObject1.getEmpName().compareTo(employeeObject2.getEmpName()) < 0) {
			return -1;
		} else {
			return 0;
		}

	}
}
