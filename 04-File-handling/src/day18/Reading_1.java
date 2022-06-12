package day18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private int id;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static Employee getEmployeeFromLine(String line) {
		String [] data = line.split("\t");
		Employee emp = new Employee();
		emp.setId(Integer.parseInt(data[0]));
		emp.setName(data[1]);
		emp.setAddress(data[2]);
		
		return emp;
	}
}

public class Reading_1 {

	public static void main(String[] args) throws IOException{
		List<String> Lines = Files.readAllLines(Path.of("src/day18/emplist.txt"));
		
		List<Employee> emplist = Lines.stream()
				.map(Employee::getEmployeeFromLine)
				.collect(Collectors.toList());
		
		emplist.forEach(obj -> {
			System.out.println("id : " + obj.getId());
			System.out.println("name : " + obj.getName());
			System.out.println("address " + obj.getAddress());
			System.out.println("---------------------");
		});
	}
}
