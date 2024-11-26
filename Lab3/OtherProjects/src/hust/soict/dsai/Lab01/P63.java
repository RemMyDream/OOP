package OOP.OtherProjects.src.hust.soict.dsai.Lab01;

import java.util.Scanner;
public class P63{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println(" ".repeat(n-i-1)+"*".repeat(2*i+1));
        }
        sc.close();
    }
}