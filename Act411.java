package class4;

public class Act411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a)");
		int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print(j);
            }
            System.out.println();
            
            

	}
        
        System.out.println("b)");
        int row1 = 5;

        for (int i = row1; i >= 1; i--) {
            for (int j = row1; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        System.out.println("c)");
        int row2 = 6;

        for (int i = 1; i <= row2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

	}
}
