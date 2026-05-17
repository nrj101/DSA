package day5;

// Write a program to input principal, time, and rate (P, T, R)
// from the user and find Simple Interest.

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float rateOfInterest, timeInYears;
        double principal;

        System.out.println("==========\nPlease input details:");
        System.out.print("Principal: ");
        principal = sc.nextDouble();
        System.out.print("Rate Of Interest (RoI): ");
        rateOfInterest = sc.nextFloat();
        System.out.print("Time (in years): ");
        timeInYears = sc.nextFloat();

        double simpleInterest = rateOfInterest * timeInYears;// (P * R * T)/100

        System.out.printf("\nPrincipal: %.2f \nSimple Interest: %.2f \nNew Principal: %.2f", principal, simpleInterest, (principal+simpleInterest));
        sc.close();
    }


}
