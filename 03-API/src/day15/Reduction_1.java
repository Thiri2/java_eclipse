package day15;

import java.util.Comparator;
import java.util.List;

public class Reduction_1 {

	public static void main(String[] args) {
		List<Employee> employees = List.of(
				new Employee("Kyaw Kyaw", 9000, "Yangon"),
				new Employee("Aung Aung", 6800, "Mandalay"),
				new Employee("Mg Mg", 10000, "Mandalay"),
				new Employee("Yuri", 6000, "Yangon"),
				new Employee("Jeon", 7800, "Mandalay")
				);
		//built-in reduction
		int total = employees.stream().mapToInt(Employee::getSalary).sum();
		double avg_salary = employees.stream().mapToDouble(emp -> emp.getSalary()).average().getAsDouble();
		int max_salary = employees.stream().mapToInt(Employee::getSalary).max().getAsInt();
		long count = employees.stream()
				.filter(e -> e.getSalary() > 6000)
				.count();
		Employee emp_max = employees.stream()
				.max(Comparator.comparingInt(emp -> emp.getSalary()))
				.get();
		Employee emp_min = employees.stream()
				.min((e1,e2) -> e1.getSalary() - e2.getSalary())
				.get();
		
		System.out.println("TOTAL SALARY : " + total);
		System.out.println("AVERAGE SALARY : " + avg_salary);
		System.out.println("Max SALARY : " + max_salary);
		System.out.println("Count : " + count);
		System.out.println("Employee got max salary : " + emp_max);
		System.out.println("Employee got min salary : " + emp_min);
		
		//custom reduction
		int total_2 = employees.stream()
				.map(emp -> emp.getSalary())
				.reduce(0, (s1,s2) -> s1+s2);
		
		int min_sal = employees.stream()
				.mapToInt(e -> e.getSalary())
				.reduce(Integer::min)
				.getAsInt();
				
		emp_max = employees.stream()
				.reduce((e1,e2) -> e1.getSalary() < e2.getSalary() ? e2 : e1)
				.get();
				
		System.out.println("Total Salary : " + total_2);
		System.out.println("Min Salary : " + min_sal);
		System.out.println("Employee got max salary : " + emp_max);
		
	}
}
