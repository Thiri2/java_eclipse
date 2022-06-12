package day4;

public class TwoD_Array2 {
	public static void main(String[] args) {
		String[] names = {"Jeon", "Yuri", "Cherry"};
		int[][] marks = {
				{100,78,39,23,56},
				{87,35,67,86,90},
				{65,36,87,90,100}
		};
		
		int row = marks.length;
		int col = marks[0].length;
		for(var r = 0; r < row; r++) {
			var total = 0;
			for(var c = 0; c < col; c++) {
				total += marks[r][c];
			}
			System.out.println("Total marks of " + names[r] + " is " + total );
			System.out.println("Average marks : " + (float)total/5);
		}
	}
}
