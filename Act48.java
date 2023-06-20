package class4;

import java.util.Scanner;

public class Act48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);

	        System.out.print("Enter temperature in Fahrenheit: ");
	        double fah = kb.nextDouble();

	        double celsius = (fah - 32) * 5 / 9;

	        System.out.println("Temperature in Celsius: " + celsius + " °C");

	        kb.close();

	}

}
