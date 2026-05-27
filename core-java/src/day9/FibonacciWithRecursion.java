package day9;

import java.util.Scanner;

public class FibonacciWithRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci number at position "+n+": "+Fibonacci(n));


        sc.close();
    }

    public static int Fibonacci(int n){
        if(n<=0)
            return 0;
        else if(n<=2)
            return 1;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
