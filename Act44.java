package class4;

import java.util.Scanner;

public class Act44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner kb = new Scanner(System.in);

	        System.out.println("Enter four integer values:");

	        int num1 = kb.nextInt();
	        int num2 = kb.nextInt();
	        int num3 = kb.nextInt();
	        int num4 = kb.nextInt();

	        int greatest = num1;

	        if (num2 > greatest) {
	            greatest = num2;
	        }

	        if (num3 > greatest) {
	            greatest = num3;
	        }

	        if (num4 > greatest) {
	            greatest = num4;
	        }

	        System.out.println("The greatest number is: " + greatest);

	        kb.close();
		

	}

}
