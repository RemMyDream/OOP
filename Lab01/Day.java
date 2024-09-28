package Lab01;
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

        while (check) {
            System.out.print("Enter the year: ");
            String strYear = sc.nextLine();
            if (strYear.length() != 4 || !strYear.matches("\\d+")) {
                System.out.println("Invalid year, please enter year again.");
                continue;
            }
            check = false;
            year = Integer.parseInt(strYear);
        }

        while (!check) {
            System.out.print("Enter the month: ");
            String strMonth = sc.nextLine().trim();
            month = convertMonth(strMonth, monthNames); 
            if (month == -1) {
                System.out.println("Invalid month, please enter month again.");
                continue;
            }
            check = true; 
        }

        switch (month) {
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2:
                if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
                    day = 28;
                } else {
                    day = 29;
                }
                break;
            default:
                day = 31;
                break;
        }
        sc.close();
        System.out.println("Month " + month + " of year " + year + " has " + day + " days.");
    }

    public static int convertMonth(String strMonth, String[] monthNames) {

        if (strMonth.matches("\\d+")) {
            int month = Integer.parseInt(strMonth);
            if (month >= 1 && month <= 12) {
                return month;
            }
            return -1;
        }

        for (int i = 0; i < monthNames.length; i++) {
            String shortName = monthNames[i].substring(0, 3); 
            if (i == 8 && (strMonth.equals("Sept."))) {
                return 9; 
            }
            else if (strMonth.equals(monthNames[i]) || strMonth.equals(shortName) || strMonth.equals(shortName + ".") || strMonth.equals("Sept.")) {
                return i + 1; 
            }
        }
        return -1;
    }
}
