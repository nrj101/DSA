package day6;

// To find Armstrong Number between two given number.

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start, end;
        System.out.println("Enter the beginning numbers for the range:");
        start = sc.nextInt();

        System.out.println("Enter the end numbers for the range:");
        end = sc.nextInt();

        if((end<=start)||(start<0)||(end<0)){
            System.out.println("Invalid inputs !! Please input valid range values (eg: 10 999");
        }else{
            for(int i=start; i<=end; i++){
                int noOfDigits = numberOfDigits(i);

                System.out.println("No of digits: "+noOfDigits);
                int sum = 0, temp = i;

                while(temp>0){
                    sum += Math.pow(temp%10, noOfDigits);
                    temp /= 10;
                }

                if (sum == i)
                    System.out.println(i+"  <=  Armstrong number of order "+noOfDigits);
                else
                    System.out.println(i);
            }
        }
        sc.close();
    }

    public static int numberOfDigits(int num){
        int n = 0;
        while(num>0){
            n++;
            num /= 10;
        }

        return n;
    }

}
