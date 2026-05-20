package day7;

// Write a program to calculate the number of trailing zeroes in
// factorial of a given input number.
// Eg: input: 5   => Factorial (5) = 120   => Result (trailing zeroes): 1

// Trailing 0s in n! = Count of 5s in prime factors of n! = floor(n/5) + floor(n/25) + floor(n/125) + ...

import java.util.Scanner;

public class TrailingZeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("\nEnter a number (n): ");
        int num = 30;//sc.nextInt();

        int count = 0, currentPower=1;

        while(num/Math.pow(5, currentPower) >0){
            count += num/Math.pow(5, currentPower);


            currentPower++;
        }

        System.out.println("No of Trailing zeros in "+num+"! = "+count);

        sc.close();
    }




}


