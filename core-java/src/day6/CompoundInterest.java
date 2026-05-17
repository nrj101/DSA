package day6;

// Calculate Compound Interest (compounded anually)

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double newPrincipal, totalCompoundInterest, principal=10_000_000;
        float rateOfInterest=10.3f, numberOfYears = 8.4f;

        newPrincipal = principal * Math.pow((1 + (rateOfInterest/100)), numberOfYears);

        totalCompoundInterest = newPrincipal - principal;

        System.out.println(("\n======================\n"));
        System.out.printf("Original Amount: %,.2f \nNew Amount: %,.2f \nInterest earned: %,.2f\n\n======================", principal, newPrincipal, totalCompoundInterest);
    }
}
