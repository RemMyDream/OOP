import java.util.Scanner;

public class AddTwoMatrices {
	public static void main(String[] args) {
		//Get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns respectively: ");
		int r = input.nextInt();
		int c = input.nextInt();
		
		//create matrix
		int[][] m1 = new int[r][c];
		int[][] m2 = new int[r][c];
		int[][] sum = new int[r][c];
		
		//Get input of 1st matrix
		System.out.print("Please enter elements of 1st matrix: ");
		for (int i=0; i<r;i++) {
			for (int j=0; j<c;j++) {
				m1[i][j] = input.nextInt();
			}	
		}
		//Get input of 2nd matrix
		System.out.print("Please enter elements of 2nd matrix: ");
		for (int i=0; i<r;i++) {
			for (int j=0; j<c;j++) {
				m2[i][j] = input.nextInt();
			}	
		}
		
		//Add 2 matrices
		for (int i=0; i<r;i++) {
			for (int j=0; j<c;j++) {
				sum[i][j] = m1[i][j] + m2[i][j];
			}	
		}
		System.out.print("The sum of 2 entered matrices is: ");
		System.out.println("");
		for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("");
		}
		input.close();
	}
}


