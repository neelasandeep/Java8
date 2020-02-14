package bonnus_tasks.task6;

 public class Employee implements Comparable<Employee> {
	private String empName;

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

	private int empNumber;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empNumber != other.empNumber)
			return false;
		
		return true;
	}

	
}
