package day8;

public class Static_Field {

	public static void main(String[] args) {
//		Employee.no_of_employee = 50;
//		
//		Employee emp1 = new Employee();
//		Employee emp2 = new Employee();
//		
//		emp1.empNo = 101;
//		emp2.empNo = 102;
//		
//		System.out.println("Emp1 no :" + emp1.no_of_employee);
//		System.out.println("Emp2 no :" + emp2.no_of_employee);
//		
//		System.out.println("AFTER CHANGING CLASS VARIALBE");
//		emp1.no_of_employee = 100;
//		System.out.println("emp1 : " + emp1.no_of_employee);
//		System.out.println("emp2 : " + emp2.no_of_employee);
		
		try {
			//create obj and initialize
			Employee emp1 = new Employee();
			emp1.initData("Aung Aung", 500000);
			System.out.println("---------");
			emp1.viewInformation();
			System.out.println("---------");
			Employee emp2 = new Employee();
			emp2.initData("Su Su", 600000);
			Employee emp3 = new Employee();
			emp3.initData("Cherry", 300000);
			//display
			emp1.showData();
			System.out.println("---------");
			emp2.showData();
			System.out.println("---------");
			emp3.showData();
			System.out.println("---------");
			//changing
			emp1.changeData("Aung Aung", 120000);
			System.out.println("***After changing***");
			emp1.showData();
			System.out.println("---------");
			
			Employee.changeNoOfEmployee(5);
			//create next
			Employee emp4 = new Employee();
			emp4.initData("James", 500000);
			emp4.showData();

		} catch (AppException e) {
			System.err.println(e.getMessage());
		}
	}
}
class Employee {
	static int no_of_employee = 3;
	static int next_id = 1;
	final int empId;
	static final float bonus = 2.5f;
	String name;
	int salary;
		
	Employee() throws AppException {
		if(next_id > no_of_employee) {
			throw new AppException("Sorry! Limited number had been reached");
		}
		this.empId = next_id;
		next_id++;
			
	}
	void initData(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	void changeData(String edit_name, int edit_salary) {

		if(!name.equalsIgnoreCase(edit_name)) 
			this.name = edit_name;
		if(salary != edit_salary) 
			this.salary = edit_salary;
	}
	void showData() {
		System.out.println("Id : " + this.empId);
		System.out.println("Name : " + this.name);
		System.out.println("Salary : " + this.salary);
	}
	static void changeNoOfEmployee(int no) {
		no_of_employee = no;
		//this.name = "abc"; error
		//salary = 10000; instance or object field
		//showDate();
		test();
	}
	void viewInformation() {
		System.out.println("Total Employee : " + no_of_employee);
		System.out.println("Current Information : ");
		showData();
		System.out.println("Next emp id : " + next_id);
	}
	static void test() {
		
	}
}
class AppException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AppException(String msg) {
		super(msg);
	}
}

