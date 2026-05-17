package day6;

// Write a program to print the sum of negative numbers, sum of positive
// even numbers and the sum of positive odd numbers from a list of numbers (N)
// entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class RunningSums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long negSum=0, posOddSum=0, posEvenSum=0;

        int num=1;

        while(true){
            System.out.println("Enter a number: ");
            num = sc.nextInt();

            if(num==0)
                break;
            if(num<0)
                negSum += num;
            else if (num%2 == 0)
                posEvenSum += num;
            else
                posOddSum += num;
        }

        System.out.printf("\n=============================\nStats: \nNegative Sum: %,d   \nPositive Sum (even): %,d   \nPositive Sum (odd): %,d",negSum, posEvenSum, posOddSum );

        sc.close();
    }
}