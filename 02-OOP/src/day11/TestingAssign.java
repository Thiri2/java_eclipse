package day11;

import java.util.Scanner;

public class TestingAssign extends StudentAssign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentAssign [] stu = new StudentAssign[4];
		int stuArray = 2;
		boolean array = true;
		
		//display
		while(array) {
			for(int i = 0 ; i < stuArray; i++) {
				stu[i] = new StudentAssign();
				System.out.println("Enter student id : ");
				stu[i].setStudentId(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter student name : ");
				stu[i].setName(sc.nextLine());
				System.out.println("Enter student mark : ");
				stu[i].setMark(sc.nextInt());
			}
		for(int i = 0; i < stuArray; i++) 
			stu[i].display();
		array = false;
		}
		
		//enquire
		
		System.out.println("Enter student id to enquire : ");
		int checkId = sc.nextInt();
		for(int i= 0; i < stuArray; i++) {
				if(checkId == stu[i].getStudentId()) {
					stu[i].display();
					break;
				} else {
					System.out.println("Student id " + checkId + " isn't found! Try again");
					checkId = sc.nextInt();
				}
		}
		
		

//		//max
//		int max = stu[0].getMark();
//		for(int i = 1; i < stuArray; i++) {
//			if(max < stu[i].getMark()) {
//				max = stu[i].getMark();
//				System.out.println("Student with max mark is " + stu[i].getMark() + "," + stu[i].getName());
//			}
//		}
//		
//		//average
//		int average = 0;
//		for(int i = 0; i< stuArray; i++) {
//			average += stu[i].getMark();
//		}
//		System.out.println("Average mark is : " + (float)average/stuArray);
//		
		sc.close();
	}
}
