package bonnus_tasks.task6;

public class Employee implements Comparable<Employee> {
	String empName;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	int empNumber;

	public Employee(String empName, int empNumber) {
		this.empName = empName;
		this.empNumber = empNumber;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empNumber=" + empNumber + "]";
	}

	@Override
	public int compareTo(Employee employeeObbject) {

		return this.empNumber - employeeObbject.empNumber;
	}

}
