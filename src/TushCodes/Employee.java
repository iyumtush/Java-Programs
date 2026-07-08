package TushCodes;


public class Employee {

	
	private String employeeId;
	private String employeeName;
	private int salary;
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.setEmployeeId("EMP123");
		e.setEmployeeName("Tushar");
		e.setSalary(1000000);
		
		System.out.println(e.getEmployeeId());
		System.out.println(e.getEmployeeName());
		System.out.println(e.getSalary());
		
	}

}
