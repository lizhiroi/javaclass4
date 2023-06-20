package class4;

import java.util.Scanner;

public class Act49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);

	        System.out.print("Enter the number of minutes: ");
	        int minutes = kb.nextInt();

	        int minYear = 365 * 24 * 60;
	        int years = minutes / minYear;
	        int remMinutes = minutes % minYear;
	        int days = remMinutes / (24 * 60);

	        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

	        kb.close();

	}

}
