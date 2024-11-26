package OOP.OtherProjects.src.hust.soict.dsai.Lab01;

import java.util.Scanner;
public class Day {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int year = 1000;
        int month = 1;
        int day = 0;
        boolean check = true;
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        // Input year
        while (check) {
            System.out.print("Enter the year: ");
            String strYear = sc.nextLine().trim();
            if (strYear.length() != 4 || !strYear.matches("\\d+")){
                System.out.println("The input is invalid.");
                continue;
            }
            check = false;
            year = Integer.parseInt(strYear);
        }
        // Input month
        while (!check) {
            System.out.print("Enter the month: ");
            String strMonth = sc.nextLine().trim();
            if (formatMonth(strMonth,monthNames) == -1){
                System.out.println("The input is invalid.");
                continue;
            }
            month = formatMonth(strMonth, monthNames);
            check = true;
        }

        // Output the day
        switch (month) {
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2: 
                if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)){
                    day = 29;
                }else{
                    day = 28;
                }
                break;
            default: 
                day = 31;
                break;
        }
        System.out.println("Month " + month + " of the year " + year + " has " + day + " days");
        sc.close();
    }
    // Check the format of Month
    public static int formatMonth(String strMonth, String [] monthNames){
        if (strMonth.matches("\\d+")){
            int month = Integer.parseInt(strMonth);
            if (month >= 1 && month <= 12){
                return month;
            }
            return -1;
        }
        else{
            for (int i = 0; i < monthNames.length; i ++){
                String shortNames = monthNames[i].substring(0,3);
                if (i == 8){
                    if (strMonth.equals(monthNames[8]) || strMonth.equals(shortNames) || strMonth.equals("Sept.")){
                    return 9;
                }
            }
                else if (strMonth.equals(monthNames[i]) || strMonth.equals(shortNames) || strMonth.equals(shortNames+".")){
                    return i + 1;
                }
            }
            return -1;
        }
    }


}
