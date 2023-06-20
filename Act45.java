package class4;

import java.util.Scanner;

public class Act45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);

	        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");

	        System.out.print("Enter coefficient a: ");
	        double a = kb.nextDouble();

	        System.out.print("Enter coefficient b: ");
	        double b = kb.nextDouble();

	        System.out.print("Enter coefficient c: ");
	        double c = kb.nextDouble();

	        double discriminant = b * b - 4 * a * c;

	        if (discriminant > 0) {
	            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            System.out.println("The quadratic equation has two distinct real roots:");
	            System.out.println("Root 1: " + root1);
	            System.out.println("Root 2: " + root2);
	        } else if (discriminant == 0) {
	            double root = -b / (2 * a);
	            System.out.println("The quadratic equation has one real root:");
	            System.out.println("Root: " + root);
	        } else {
	            System.out.println("The quadratic equation has no real roots. It has complex roots.");
	        }

	        kb.close();
	}

}
