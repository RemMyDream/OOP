import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the number of size of array: ");
	    int size = num.nextInt();
	    int[] arr = new int[size];
	    System.out.print("Enter the array elements: ");
	    for (int i=0; i<size; i++) {
	    	arr[i] = num.nextInt();
	    }
	    
	    //To print the original array
	    System.out.print("Original array: " +Arrays.toString(arr));
	    
	    //To sort the array 
	    Arrays.sort(arr);
	    System.out.print("\nSorted array: " +Arrays.toString(arr));
	    
	    //To calculate and print sum and avg value
	    float sum = 0;
	    for (int i=0; i<size;i++) {
	    	sum += arr[i];
	    }
	    float avg = (sum/size);
	    System.out.print("\nSum of array elements = " +sum +"\n");
	    System.out.print("Average value of array elements = "+ avg);
	    
	    num.close();
	}

}
