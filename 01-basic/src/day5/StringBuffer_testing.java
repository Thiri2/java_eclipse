package day5;

public class StringBuffer_testing {
	public static void main(String[] args) {
		
		StringBuffer bf = new StringBuffer("Java Programming");
		bf.append(" Language"); //concat
		
		System.out.println("Append : " + bf);
		
		bf.insert(5, "is a ");
		System.out.println("Insert : " + bf.toString());
		
		bf.replace(0, 4, "PHP");
		System.out.println("Replace : " + bf);
		
		System.out.println("Index of : " + bf.indexOf("Language"));
		System.out.println("Substring : " + bf.substring(9));
		System.out.println("No of character : " + bf.length());
		System.out.println("Delete : " + bf.delete(4, 9));
	}
}
