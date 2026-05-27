package day9;

import java.util.Scanner;

// Write separate methods to print (1) Sum and (2) Product of all numbers From 1 to N
public class SumAndProductOfFirstNNumbersRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum of first "+n+" numbers: "+sum(n));

        System.out.println("Product of first "+n+" numbers (a.k.a. Factorial): "+product(n));


        sc.close();
    }

    public static int sum(int n){
        if(n<1)
            return 0;
        return n + sum(n-1);
    }

    public static long product(int n){
        if(n<=1)
            return 1;
        return n * product(n-1);
    }
}
