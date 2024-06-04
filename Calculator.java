package calculatorProject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		DecimalFormat fmt = new DecimalFormat("#.#####");
		
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double x = scan.nextDouble();
		
		System.out.println("Enter operator (+, -, *, /, %, ^, or 'sqrt'): ");
		String z = scan2.nextLine();
		
		if (z.compareTo("sqrt") == 0) {
			System.out.print("Solution: ");
			System.out.println(fmt.format(sqrtNum(x)));
		}
		
		else {
			System.out.println("Enter second number: ");
			double y = scan.nextDouble();
			System.out.print("Solution: ");
			
			if (z.compareTo("+") == 0) {
				System.out.println(fmt.format(addNums(x, y)));
			}
			
			else if (z.compareTo("-") == 0) {
				System.out.println(fmt.format(subNums(x, y)));
			}
			
			else if (z.compareTo("*") == 0) {
				System.out.println(fmt.format(multNums(x, y)));
			}
			
			else if (z.compareTo("/") == 0) {
				System.out.println(fmt.format(divNums(x, y)));
			}
			
			else if (z.compareTo("%") == 0) {
				System.out.println(fmt.format(moduloNums(x, y)));
			}
			
			else if (z.compareTo("^") == 0) {
				System.out.println(fmt.format(expoNums(x, y)));
			}
			
			else {
				System.out.println("Invalid Operator");
			}
		}
		
		
		scan.close();
		scan2.close();
		
	}
	
	public static double addNums (double x, double y) {
		return x + y;
	}
	
	public static double subNums (double x, double y) {
		return x - y;
	}
	
	public static double multNums (double x, double y) {
		return x * y;
	}
	
	public static double divNums (double x, double y) {
		return x / y;
	}
	
	public static double moduloNums (double x, double y) {
		return x % y;
	}
	
	public static double expoNums (double x, double y) {
		return Math.pow(x, y);
	}
	
	public static double sqrtNum (double x) {
		return Math.sqrt(x);
	}
}
