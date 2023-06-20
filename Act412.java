package class4;

import java.util.Scanner;

public class Act412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);
	        
	        System.out.print("Input number of terms: ");
	        int terms = kb.nextInt();
	        
	        for (int i = 1; i <= terms; i++) {
	            int cube = i * i * i;
	            System.out.println("Number is: " + i + " and cube of " + i + " is: " + cube);
	        }
	        
	        kb.close();

	}

}
