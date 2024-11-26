package OOP.OtherProjects.src.hust.soict.dsai.Lab01;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class P226 {
    public double fde1(double a, double b){
        if (a == 0){
            if (b == 0){
                System.out.println("Infinite Number of Solution");
                return Double.NaN;
            }
            else {
                System.out.println("No Solution");
                return Double.NaN;
            }
        }
        else{
            double s = -b/a;
            return s;
        }   
    }
    public double[] fde2(double a11, double a12, double b1, double a21, double a22, double b2) {
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        if (D == 0) {
            if (D1 != 0 || D2 != 0) {
                System.out.println("No Solution");
                return new double[]{Double.NaN, Double.NaN};
            } else {
                System.out.println("Infinite Number of Solutions");
                return new double[]{Double.NaN, Double.NaN}; 
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            return new double[]{x1, x2}; // Return the solutions
        }
    }    
    public double[] sde(double a, double b, double c){
        if (a ==0){
            fde1(b, c);
            return new double[]{Double.NaN, Double.NaN};
        }
        else{
            double delta = Math.pow(b, 2) - 4*a*c;
            if (delta < 0){
                System.out.println("No Solution");
                return new double[]{Double.NaN, Double.NaN};
            }
            else if (delta == 0){
                System.out.println(-b/(2*a));
                return new double[]{Double.NaN, Double.NaN};
            }
            else{
                double x1 = (-b - Math.sqrt(delta)/(2*a));
                double x2 = (-b + Math.sqrt(delta)/(2*a));
                return new double[]{x1, x2};
            }
        }
    }
    public static void main(String args[]) throws IOException{
        P226 myObj = new P226();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Input[] = new String[3];
        double[] result;
        while(true){
            String line = reader.readLine();
            if (line.startsWith("First-degree equation with one variable ax+b=0")){
                System.out.print("Input a: ");
                double a = Double.parseDouble(reader.readLine());
                System.out.print("Input b: ");
                double b = Double.parseDouble(reader.readLine());
                double result1 = myObj.fde1(a,b);
                if (Double.isNaN(result1)){
                }
                else{
                    System.out.println("x: " + result1);
                }
            }

            if (line.startsWith("First-degree equations with two variables")){
                System.out.print("Input the coeffiecents and intercept of first equation: ");
                Input = reader.readLine().split(" ");
                    double a11 = Double.parseDouble(Input[0]);
                    double a12 = Double.parseDouble(Input[1]);
                    double b1 = Double.parseDouble(Input[2]);
                System.out.print("Input the coeffiecents and intercept of second equation: ");
                Input = reader.readLine().split(" ");
                    double a21 = Double.parseDouble(Input[0]);
                    double a22 = Double.parseDouble(Input[1]);
                    double b2 = Double.parseDouble(Input[2]);
                result = myObj.fde2(a11,a12,b1,a21,a22,b2);
                if (Double.isNaN(result[0]) && Double.isNaN(result[1])) {
                } else {
                    System.out.println("x1: " + result[0]);
                    System.out.println("x2: " + result[1]);
                }
            }            

            if (line.startsWith("Second-degree with one variable")){
                System.out.print("Input a, b, c: ");
                Input = reader.readLine().split(" ");
                    double a = Double.parseDouble(Input[0]);
                    double b = Double.parseDouble(Input[1]);
                    double c = Double.parseDouble(Input[2]);
                    result = myObj.sde(a,b,c);
                if (Double.isNaN(result[0]) && Double.isNaN(result[1])) {
                } else {
                    System.out.println("x1: " + result[0]);
                    System.out.println("x2: " + result[1]);
                }
            }            
            else if (line.equalsIgnoreCase("exit")){
                break;
            }
        }
    }
}
