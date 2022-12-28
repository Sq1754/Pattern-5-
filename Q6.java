import java.util.Scanner;

public class Q6 {
public static void main(String[]args) {
		
		// Q6 : print 0-1 pyramid
	    /*      1
	     *      0 1
	     *      1 0 1
	     *      0 1 0 1
	     * 
	     * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Rows please;");
		int rows = sc.nextInt();
		for(int i=1; i<=rows; i++ ) {
			for(int j=1; j<=i; j++) {
				int sum = i+j;
				if(sum%2==0) {
					System.out.print(1+" ");
				}
				else {System.out.print(0+" ");}
			}
			System.out.println();
		}
		
	}
}
