package day1;

import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		
		int number = 1;
		
		int limit = 10;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive number ( >= 1) to generate it's Table:");
		
		number = sc.nextInt();
		
		if(number<1) {
			System.out.println("Incorrect input");
		}else {
			
			System.out.println("\n\n========================\n");
			
			for(int i=1; i<=limit; i++) {
				System.out.printf("%d * %2d = %d%n", number, i, number * i);
			}
			
			System.out.println("\n========================\n");
		}
		
		sc.close();
		
	}

}
