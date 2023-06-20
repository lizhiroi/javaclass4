package class4;

import java.util.Scanner;

public class Act47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = kb.nextInt();

	        int factorial = 1;

	        if (number < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            for (int i = 1; i <= number; i++) {
	                factorial *= i;
	            }

	            System.out.println("Factorial of " + number + " is: " + factorial);
	        }

	        kb.close();

	}

}
