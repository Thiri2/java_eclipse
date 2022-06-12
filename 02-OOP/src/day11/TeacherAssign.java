package day11;

public class TeacherAssign extends PersonAssign {
	
	private String position;
	private String department;
	private int salary;
	
	String getPosit() {
		return position;
	}
	void setPosit(String pos) {
		this.position = pos;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public TeacherAssign() {
		
	}
	public TeacherAssign(String position, String department, int salary) {
		super();
		this.position = position;
		this.department = department;
		this.salary = salary;
	}
	
	void promote(String position, int salary) {
		System.out.println("Current Position : " + getPosit());
		System.out.println("Promoted Position : " + position);
		System.out.println("Current salary : " + getSalary());
		int total = salary + getSalary();
		System.out.println("Promoted salary : " + total);
	}
	
	void transfer(String department) {
			if(getDepartment().equals(department)) {
				System.out.println("Error! You have enter the same department.");
			}
			else {
				System.out.println("Your department is " + department);
			}
	}
	
	void showTeacherInfo() {
		System.out.println("Name : " + getName());
		System.out.println("Position : " + position);
		System.out.println("Department : " + department);
		System.out.println("Salary : " + salary);
	}
}
