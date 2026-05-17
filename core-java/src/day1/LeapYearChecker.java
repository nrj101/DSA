package day1;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		
		int year;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an year (yyyy) to check if it's a leap year: ");
		year = sc.nextInt();
		
		if(year<0) {
			System.out.println("Incorrect input");
			sc.close();
			return ;
		}
		
		// century exceptions as per Gregorian calendar fixes with Earth's solar year
		if(year%100 == 0) {
			if(year%400 == 0) {
				System.out.println("Is this a leap year ? YES");
			}else {
				System.out.println("Is this a leap year ? NO");
			}
			
			sc.close();
			return ;
			
		}
		
		if(year%4 == 0) {
			System.out.println("Is this a leap year ? YES");
		}else {
			System.out.println("Is this a leap year ? NO");
		}
		
		sc.close();
		
		return ;

	}

}
