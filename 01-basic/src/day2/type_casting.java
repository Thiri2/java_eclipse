package day2;

public class type_casting {
	public static void main(String[] args) {
		int a = 200;
		long b = (long)a; //implicit casting
		double c = b; //implicit
		
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		System.out.println("c :" + c);
		
		//explicit casting
		double d = 57.17;
		int i = (int)d; //decimal-> whole num
		
		System.out.println("d :" + d);
		System.out.println("i :" + i);
		
		
	}
}
