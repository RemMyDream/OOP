import java.util.Scanner;

public class StarTriangle {
	public static void main(String[] args) {
		Scanner height = new Scanner(System.in);
		
		//Get input
		System.out.print("Enter the height of the triangle n= ");
		int n = height.nextInt();
		
		if (n<=0) {
			System.out.print("The height must larger than 0");
		}
		else {
			for (int i = 0; i < n; i++) {
				for (int j = 1; j < n-i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= 2*i+1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}	
		}
		height.close();
	}
}
