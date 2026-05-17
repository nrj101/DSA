package day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double num1=0, num2=0;
		
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			System.out.println("\nSelect an option to proceed: \n1. Add two numbers \n2. Subtract two numbers \n3. Multiply two numbers \n4. Divide two numbers \n5. Exit");
			
			choice = sc.nextInt();
			
			if(choice==5) {
				System.out.println("Closing..."); 
				break ;
			}else  if(choice < 1 || choice > 4) {
				System.out.println("Please enter a valid choice\n\n\n"); 
				continue;
			}
			
			
			System.out.println("Enter first number: ");
			num1 = sc.nextDouble();
			System.out.println("Enter second number: ");
			num2 = sc.nextDouble();
			
			//System.out.println("Choice: "+choice+"  |  num1: "+num1+"  |  num2: "+num2);
			
			switch(choice) {
				case 1: System.out.printf("\nResult: %.2f%n", add(num1, num2)); break;
				case 2: System.out.printf("\nResult: %.2f%n", subtract(num1, num2)); break;
				case 3: System.out.printf("\nResult: %.2f%n", multiply(num1, num2)); break;
				case 4: if(num2==0) {
								System.out.println("Error !! Division by zero !!");
						}else {
							System.out.printf("\nResult: %.2f%n", divide(num1, num2));
						}
						break;
			}
		};
		
		
		
		
		
		
		sc.close();
		
	}
	
	public static double add (double a, double b) {
		return a+b;
	}
	public static double subtract (double a, double b) {
		return a-b;
	}
	public static double multiply (double a, double b) {
		return a*b;
	}
	public static double divide (double a, double b) {
		return a/b;
	}

}
