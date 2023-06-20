package class4;

public class Act46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a=0;
		b=1;
		c=0;
		System.out.println("fibonacchi numbers: ");
		while( c<=300) {
			System.out.println(c+"  ");
			a=b;
			b=c;
			c=a+b;
			
		}

	}

}
