package day4;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int noOfBrand = 6;
		int noOfCpu = 4;
		
		System.out.println("---Computer price in $---");
		
		String [] brand = {"lenovo","hp","samsung","acer","dell","asus"};
		String [] cpu = {"core i3", "core i5", "core i7", "core i9"};
		
		double [][] price = {
				{230.21, 400.21, 294.2, 693.33, 340.44, 691.99},
				{529.483, 920.483, 676.66, 1594.659, 783.012, 1591.577},
				{552.504, 960.504, 706.08, 1663.992, 817.056, 1660.776},
				{690.63, 1200.63, 882.6, 2079.99, 1021.32, 2075.97}
		};
		
		//BRAND 
		
		
		System.out.println("Select a brand : ");
		for(int i = 0; i < noOfBrand; i++) {
			System.out.println(i + ")" + brand[i]);
		}
		
		System.out.println("Type the number you want to select of brand: ");
		int selectbrand = sc.nextInt();
		
		//CPU
		System.out.println("Select a CPU : ");
		for(int i = 0; i < noOfCpu; i++) {
			System.out.println(i + ")" + cpu[i]);
		}
		
		System.out.println("Type the number you want to select for cpu: ");
		int selectcpu = sc.nextInt();
		//System.err.println("You have selected " + cpu[selectcpu]);
		
		//SUM UP
		System.err.println("You have selected " + brand[selectbrand] + " for " + 
		cpu[selectcpu] + "\nPrice : $" + price[selectcpu][selectbrand]);
		
		
		//EXCHANGE RATE
		
		boolean negativeInt = true;
		while(negativeInt) {
			System.out.println("Enter currency exchange rate : ");
			double exRate = sc.nextDouble();
			if(exRate <= 0){
				System.out.println("Please enter positive integer or larger than 0!");
			}
			else {
				
			//add comma
			DecimalFormat df = new DecimalFormat();
			DecimalFormatSymbols dfs = new DecimalFormatSymbols();
			dfs.setGroupingSeparator(',');
				
			df.setDecimalFormatSymbols(dfs);
				
			exRate = (price[selectcpu][selectbrand]) * exRate;
			System.out.println("Price(MMK) : " + df.format(exRate));
			negativeInt = false;
			}
		}

		
		sc.close();
	}
}