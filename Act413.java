package class4;

import java.util.Scanner;

public class Act413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new Scanner(System.in);
        
        System.out.print("Input the number of terms: ");
        int terms = kb.nextInt();
        
        int sum = 0;
        int number = 1;
        
        for (int i = 1; i <= terms; i++) {
            sum += number;
            System.out.print(number);
            
            if (i < terms) {
                System.out.print(" + ");
            }
            
            number = number * 10 + 1;
        }
        
        System.out.println("\nThe Sum is: " + sum);
        
        kb.close();

	}

}
