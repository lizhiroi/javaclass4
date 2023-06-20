package class4;

import java.util.Scanner;

public class Act414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner kb = new Scanner(System.in);
	        
	        System.out.print("Enter the number of elements: ");
	        int n = kb.nextInt();
	        
	        int sum = 0;
	        int number;
	        
	        for (int i = 1; i <= n; i++) {
	            System.out.print("Enter number " + i + ": ");
	            number = kb.nextInt();
	            sum += number;
	        }
	        
	        double average = (double) sum / n;
	        
	        System.out.println("Sum: " + sum);
	        System.out.println("Average: " + average);
	        
	        kb.close();

	}

}
