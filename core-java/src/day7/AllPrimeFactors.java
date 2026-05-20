package day7;

// Print all prime factors of a given number

import java.util.Scanner;
import java.util.ArrayList;

public class AllPrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number (n): ");
        int num = 10240;//sc.nextInt();

        ArrayList<Integer> primeFactors = new ArrayList<>();

        // count and add all 2s as factors. Keep dividing the number by 2 to prevent duplicated count
        while(num%2 == 0){
            primeFactors.add(2);
            num /= 2;
        }

        // now the number should only have odd prime factors remaining
        for(int i=3; i <= Math.sqrt(num); i=i+2){
            while(num % i ==0){
                primeFactors.add(i);
                num /= i;
            }
        }

        // if the number itself is prime, then only factors: 1 and n
        if(num>2)
            primeFactors.add(num);

        System.out.println("Prime Factors: "+primeFactors.toString());

        sc.close();
    }
}
