package class4;

import java.util.Scanner;

public class Act42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of a rectangle:");
		double length = kb.nextDouble();
		System.out.println("Enter the breadth of a rectangle:");
		double breadth = kb.nextDouble();
		
		if (length == breadth) {
			System.out.println("This is a square.");
		}
		else {
			System.out.println("This is a rectangle.");
			
		}
		kb.close();

	}

}
