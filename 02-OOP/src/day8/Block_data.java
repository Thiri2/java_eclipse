package day8;

public class Block_data {

	static final int MIN_LENGTH;
	final int empId;
	String phone;
	
	public Block_data(String phone) {
		System.out.println("This is constructor block");
		if(phone.length() >= MIN_LENGTH)
			this.phone = phone;
	}
	//instance block
	{
		empId = 1;
		phone = "unknown";
		System.out.println("This is an instance block");
	}
	static {
		MIN_LENGTH = 9;
		System.out.println("This is a static block");
	}
	public static void main(String[] args) {
		Block_data obj1 = new Block_data("09767636516");
		System.out.println("Obj1 number : " + obj1.phone);
		System.out.println("----------");
		Block_data obj2 = new Block_data("123");
		System.out.println("Obj2 number : " + obj2.phone);
	}
}
