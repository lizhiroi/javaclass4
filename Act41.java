package class4;

public class Act41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle, inteRate,  profit, years;
		principle = 1000;
		inteRate = 0.0625;
		years= 5;
			profit = principle * Math.pow((1 + inteRate),(years))-principle;
			System.out.println("The profit of investment for 5 years: " + profit + "$");
		
			years= 8;
			profit = principle * Math.pow((1 + inteRate),(years))-principle;
			System.out.println("The profit of investment for 8 years: " + profit + "$");

	}

}
