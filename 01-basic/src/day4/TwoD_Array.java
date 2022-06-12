package day4;

import java.util.Arrays;

public class TwoD_Array {
	public static void main(String[] args) {
		int [][] marks = {
				{65,74,28,90,100},
				{71,80,90,69,95},
				{56,89,59,88,67}
		};
		
		System.out.println("----For Loop with 2d array");
		for(var r = 0;r < 3;r++) { // outer loop for row
			for(var c = 0;c < 5;c++) { // inner loop for col
				System.out.print(marks[r][c] + "\t");
			}
			System.out.println();
		}
		System.out.println("----ForEach-----");
		for(int[] row : marks) { // outer loop for row
			for(int col : row) { // inner loop for col
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		System.out.println("Data : " + Arrays.deepToString(marks));
	}
}
 