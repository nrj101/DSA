package day6;

// Find nCr => no of combinations of n objects taken "r" at a time, AND,
// nPr => no of permutation of n objects taken "r" at a time (internal ordering matters)

import java.math.BigInteger;
import java.util.Scanner;

public class PermutationAndCombination {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, r;
        System.out.print("\nEnter total number of objects (n): ");
        n = sc.nextInt();
        System.out.print("\nEnter group size (r): ");
        r = sc.nextInt();

        BigInteger nCr=BigInteger.ONE, nPr=BigInteger.ONE;

        nCr = factorial(n).divide( factorial(r).multiply(factorial(n-r)) );

        nPr = factorial(n).divide(factorial(n-r));

        System.out.println("nCr : "+ nCr.toString()+ "      nPr : "+ nPr.toString());
    }

    public static BigInteger factorial(int num){
        BigInteger result = BigInteger.ONE;
        while(num>1){
            result = result.multiply(BigInteger.valueOf(num));
            num--;
        }
        return result;
    }

}
