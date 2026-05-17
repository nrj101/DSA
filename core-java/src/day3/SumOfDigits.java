import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int number, sumOfDigits=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input positive integer: ");
		number = sc.nextInt();
		number = Math.abs(number);
		
		
		while(number>0) {
			
			//System.out.println("Sum: "+sumOfDigits+"  |  number: "+number);
			
			sumOfDigits = sumOfDigits + (number%10);
			
			number = number/10;
		}
		
		System.out.println("Sum of digits: "+sumOfDigits);
		
		sc.close();
	}

}
