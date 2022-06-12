package day11;

public class PersonAssign {
	
	private String name;
	private String nrcno;
	private String address;
	private String phone;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getNrcno() {
		return nrcno;
	}
	void setNrcno(String nrc) {
		this.nrcno = nrc;
	}
	String gestAddress() {
		return address;
	}
	void setAddress(String add) {
		this.address = add;
	}
	String getPhone() {
		return phone;
	}
	void setPhone(String ph) {
		this.phone = ph;
	}
	
	PersonAssign() {
		
	}
	
	PersonAssign(String name,String nrc, String add, String ph) {
		this.name = name;
		this.nrcno = nrc;
		this.address = add;
		this.phone = ph;
	}
	
	void display() {
		System.out.println("---Information---");
		System.out.println("Name : " + name);
		System.out.println("NRC no : " + nrcno);
		System.out.println("Address : " + address);
		System.out.println("Phone : " + phone);
	}
	
	void showIdenInfo() {
		System.out.println("--Identification Info--");
		System.out.println("NRC no : " + nrcno);
		
		String [] division = {"Kachin" , "Kayah", "Kayin", "Chin", "Sagaing", "Tanintharyi", 
				"Bago", "Magway", "Mandalay", "Mon", "Rakhine", "Yagon", "Shan", "Ayeyawaddy", "Nay Pyi Taw"};
		
		int one = nrcno.indexOf("/");
		int two = nrcno.indexOf("(");
		int three = nrcno.indexOf(")");
		int div = Integer.parseInt(nrcno.substring(0, one));

		System.out.println("Division : " + division[div-1]);
		System.out.println("City : " + nrcno.substring(one+1 , two));
		System.out.println("Number : " + nrcno.substring(three+1));
	}
}
