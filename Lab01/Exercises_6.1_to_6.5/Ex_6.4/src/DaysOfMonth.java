import java.util.Scanner;

public class DaysOfMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int month = -1;
        boolean Valid = true;
        while (Valid) {
            System.out.print("Please enter month and year: ");
            String monthStr = input.next().toLowerCase();
            if (monthStr.equals("january") || monthStr.equals("jan.") || monthStr.equals("jan") || monthStr.equals("1")) {
                month = 1;
            } 
            else if (monthStr.equals("february") || monthStr.equals("feb.") || monthStr.equals("feb") || monthStr.equals("2")) {
                month = 2;
            } 
            else if (monthStr.equals("march") || monthStr.equals("mar.") || monthStr.equals("mar") || monthStr.equals("3")) {
                month = 3;
            } 
            else if (monthStr.equals("april") || monthStr.equals("apr.") || monthStr.equals("apr") || monthStr.equals("4")) {
                month = 4;
            } 
            else if (monthStr.equals("may") || monthStr.equals("5")) {
                month = 5;
            } 
            else if (monthStr.equals("june") || monthStr.equals("jun") || monthStr.equals("6")) {
                month = 6;
            } 
            else if (monthStr.equals("july") || monthStr.equals("jul") || monthStr.equals("7")) {
                month = 7;
            } 
            else if (monthStr.equals("august") || monthStr.equals("aug.") || monthStr.equals("aug") || monthStr.equals("8")) {
                month = 8;
            } 
            else if (monthStr.equals("september") || monthStr.equals("sept.") || monthStr.equals("sept") || monthStr.equals("9")) {
                month = 9;
            } 
            else if (monthStr.equals("october") || monthStr.equals("oct.") || monthStr.equals("oct") || monthStr.equals("10")) {
                month = 10;
            } 
            else if (monthStr.equals("november") || monthStr.equals("nov.") || monthStr.equals("nov") || monthStr.equals("11")) {
                month = 11;
            } 
            else if (monthStr.equals("december") || monthStr.equals("dec.") || monthStr.equals("dec") || monthStr.equals("12")) {
                month = 12;
            } 
            else {
                Valid = false;
            	System.out.println("Invalid month.");
            }
            int y = input.nextInt();
            if (month == 2) {
            	if (y/4 == 0||y/100==0&&y/400==0) {
    				System.out.print("The entered month has 29 days");
    			}
    			else {
    				System.out.print("The entered month has 28 days");
    			}
            }
            else if (month==4||month==6||month==9||month==11) {
            	System.out.print("The entered month has 30 days");
            }
            else {
            	System.out.print("The entered month has 31 days");
            }
            break;
        }
        input.close();
	}
}
