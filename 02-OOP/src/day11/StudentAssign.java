package day11;

public class StudentAssign {

	private int studentId;
	private String name;
	private int mark;
	
	int getStudentId() {
		return studentId;
	}
	void setStudentId(int stuid) {
		this.studentId = stuid;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name= name;
	}
	int getMark() {
		return mark;
	}
	void setMark(int mark) {
		this.mark = mark;
	}
	public StudentAssign() {
		
	}
	
	public StudentAssign(int stuid, String name, int mark) {
		this.studentId = stuid;
		this.name = name;
		this.mark = mark;
	}
	
	void display() {
		System.out.println("---Student Info---");
		System.out.println("Id : " + studentId);
		System.out.println("Name : " + name);
		System.out.println("Mark : " + mark);
	}
}
