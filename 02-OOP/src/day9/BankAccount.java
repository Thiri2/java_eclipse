package day9;

import java.util.Scanner;

class InsufficientAmountException extends Exception {

	private static final long serialVersionUID = 1L;

	public InsufficientAmountException(String msg) {
		super(msg);
	}
}

public class BankAccount extends demo{
	
	Scanner sc = new Scanner(System.in);
	
	int accountNo;
	String holderName;
	String pinNo;
	String password;
	int balance = 1000;
	
	public BankAccount(int accountNo, String holderName, String pinNo, String password) {
		super();
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.pinNo = pinNo;
		this.password = password;
	}
	
	void deposit(int depAmt) {
		
		System.out.println("Balance : " + balance);
		System.out.println("You have deposited : " + depAmt);
		balance = depAmt + balance;
		showInfo();
	}
	
	void withdraw(int wdrawAmt) {
		try {
			System.out.println("Balance : " + balance);
			if(wdrawAmt < balance) {
				System.out.println("Withdraw Success!");
				balance = balance - wdrawAmt;
			}else {
				throw new InsufficientAmountException("Failed! Insufficient Balance!");
			}
		} catch (InsufficientAmountException e) {
			System.err.println(e.getMessage());
		}
		showInfo();
	}
	
	void changePassword(String pw) {
		System.out.println("Enter pin no to change password : ");
		String pno = sc.nextLine();
		boolean invalid = true;
		while(invalid) {
			if(pno.equals(pinNo)) {
				System.out.println("Your new password is " + pw);
				invalid = false;
			}
			else {
				System.out.println("Invalid pin number! Try again");
				pno = sc.nextLine();
			}
		}
	}
	
	void showInfo() {
		System.out.println("---Bank Account Information---");
		System.out.println("No: " + accountNo);
		System.out.println("Name: " + holderName);
		System.out.println("Balance: " + balance);
	}
}
