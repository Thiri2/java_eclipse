package day14;

import java.util.Scanner;
import java.util.TreeMap;

public class Student_Map{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeMap<Integer, Student_Obj> students = new TreeMap<>();
		students.put(1, new Student_Obj(1, "Ag Ag", "Yangon"));
		students.put(11, new Student_Obj(11, "Kyaw Kyaw", "Mandalay"));
		students.put(8, new Student_Obj(8, "Cherry", "Yangon"));
		students.put(4, new Student_Obj(4, "Ag Ag", "Pyin Oo Lwin"));
		
		students.forEach((k,v) -> {
			System.out.println("Rno : " + v.getRno() + " ,Name : " + v.getName() + " ,City : " + v.getCity());
		});
		
		System.out.println("---Update---");
		System.out.println("Enter rno to update : ");
		int rno = sc.nextInt();
		
		students.forEach((k,v) -> {

		});
		
	}
}

class Student_Obj {
	private int rno;
	private String name;
	private String city;
	
	public int getRno() {
		return rno;
	}
	
	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student_Obj(int rno, String name, String city) {
		super();
		this.rno = rno;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Rno=" + rno + ", Name=" + name + ", City=" + city + "]";
	}
	
}