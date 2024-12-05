import java.util.Scanner;

public class EquationSolver {
	public static void main (String[] args){
		Scanner num = new Scanner(System.in);
		
		//Get information about the equation
		System.out.print("Enter 0 for Linear Equation, 1 for Linear System or 2 for Quadratic Equation: ");
		byte kindOfEquation = num.nextByte();
		
		//For the Linear Equation 
		if (kindOfEquation == 0) {
			System.out.println("You have chosen Linear Equation");
			
			//Get input
			System.out.print("Linear equation has a form like ax+b=0 where x is the variable, please enter a: ");
			double a = num.nextDouble();
			System.out.print("Please enter b: ");
			double b = num.nextDouble();
			
			//Solve
			if (a==0) {
				if (b==0) {
					System.out.print("The given equation has infinite solutions");
				}
				if (b!=0) {
					System.out.print("The given equation has no solution");
				}
				}
			else {
				System.out.print("x= " + (-b/a));
			}
		}
		
		//For Linear System with 2 variables
		else if (kindOfEquation == 1) {
			System.out.println("You have chosen Linear System");
			
			//Get input
			System.out.println("Linear system has a form like:\n a1x + b1y = c1\n a2x + b2y = c2\nWhere x and y are variables");
			System.out.print("Please enter 3 parameters a1 b1 c1 of the first equation orderly: ");
			double a1 = num.nextDouble();
			double b1 = num.nextDouble();
			double c1 = num.nextDouble();
			System.out.print("Please enter 3 parameters a2 b2 c2 of the second equation orderly: ");
			double a2 = num.nextDouble();
			double b2 = num.nextDouble();
			double c2 = num.nextDouble();
			double D = a1*b2 - a2*b1;
			double Dx = c1*b2 - c2*b1;
			double Dy = a1*c2 - a2*c1;
			
			//Solve
			if (D!=0) {
				System.out.println("System has unique solution:\n" + "x = " + (Dx/D) + "\n" + "y = " + (Dy/D));
			}
			else {
				if (Dx!=0 || Dy!=0) {
					System.out.print("System has no solution");
				}
				else if (Dx==0 && Dy==0) {
					System.out.print("System has infinite solutions");
				}
			}
		}
		
		//For Quadratic Equation
		else if (kindOfEquation == 2) {
			System.out.println("You have chosen Quadratic Equation");
			
			//Get input
			System.out.println("Quadratic Equation has a form like ax^2 + bx = c where x is the variable");
			System.out.print("Please enter parameters a b c orderly: ");
			double a = num.nextDouble();
			double b = num.nextDouble();
			double c = num.nextDouble();
			if (a==0) {
				System.out.print("The input equation is not a quadratic equation");
				if (b==0 && c==0) {
					System.out.println(" and has infinite solutions");
				}
				else if (b==0&&c!=0) {
					System.out.println(" and has no solution");
				}
				else if (b!=0) {
					System.out.println(" and have one solution x= " +(c/b));
				}
			}
			else {
				double d = Math.pow(b,2)-4*a*c;
				if (d==0) {
					System.out.print("The given equation has 1 solution x= "+ (-b/(2*a)));
				}
				else if (d<0) {
					System.out.print("The given equation has 0 solution");
				}
				else if (d>0) {
					System.out.print("The given equation has 2 solutions:\n" + "x1 = " +((-b+Math.sqrt(d))/(2*a))+"\nx2 = "+((-b-Math.sqrt(d))/(2*a)));
				}
			}
		}
		else {
			System.out.print("The entered number does not belong to any option!!!");
		}
		num.close();
	}
}			
			
			