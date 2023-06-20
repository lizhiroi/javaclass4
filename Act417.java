package class4;

import java.util.Scanner;

public class Act417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Input the number (Table to be calculated): ");
        int number = kb.nextInt();

        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " X " + i + " = " + result);
        }

        kb.close();

	}

}
