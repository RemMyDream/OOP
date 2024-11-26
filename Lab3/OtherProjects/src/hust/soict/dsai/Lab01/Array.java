package OOP.OtherProjects.src.hust.soict.dsai.Lab01;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double [] arr = new double[n];
        for (int i = 0; i < n; i ++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                if (arr[j] < arr[i]){
                    double temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("The average of the array is: " + (sum/n));
        for (int i = 0; i < n; i ++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
