package class4;

import java.util.Scanner;

public class Act43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your grade:");
		int grade = kb.nextInt();
		
		if (grade< 25) {
			System.out.println("You got F");
			
		}
		else if (grade >= 25 && grade <45) {
			System.out.println("You got E");
			
		}
		else if (grade >= 45 && grade <50) {
			System.out.println("You got D");
			
		}
		else if (grade >= 50 && grade <60) {
			System.out.println("You got C");
			
		}
		else if (grade >= 60 && grade <80) {
			System.out.println("You got B");
			
		}
		else if (grade >= 80) {
			System.out.println("You got A");
			
		}
		
		kb.close();
		
				

	}

}
