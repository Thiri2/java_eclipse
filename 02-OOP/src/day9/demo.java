package day9;

public class demo {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount(1001, "Thiri Aung", "3467", "TA123");
		b1.deposit(510000);
		System.out.println("---------------");
		b1.withdraw(1000000);
		System.out.println("---------------");
		b1.changePassword("123TA");
		System.out.println("---------------");
		b1.showInfo();
	}
}
