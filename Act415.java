package class4;

import java.util.Scanner;

public class Act415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Input the grade: ");
        char grade = kb.next().charAt(0);

        String description;

        switch (grade) {
            case 'E':
                description = "Excellent";
                break;
            case 'V':
                description = "Very Good";
                break;
            case 'G':
                description = "Good";
                break;
            case 'A':
                description = "Average";
                break;
            case 'F':
                description = "Fail";
                break;
            default:
                description = "Invalid grade";
        }

        System.out.println("You have chosen: " + description);

        kb.close();

	}

}
