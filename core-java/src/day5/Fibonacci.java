package day5;

// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("\n=============\nPrint Fibonacci series upto: ");
        num = sc.nextInt();



        if (num<=0){
            System.out.println("\n\nError: Value out of range !! Please input a positive integer.\n");
        }else if(num==1){
            System.out.println(0);
        }else if(num==2){
            System.out.println(0+"  =>  "+1);
        }else{
            int nextNum, prevNum=0, currentNum = 1;

            System.out.print(0+"  =>  "+1);

            for(int i=2; i<num; i++){

                nextNum = currentNum + prevNum;

                System.out.print("  =>  "+nextNum);

                prevNum = currentNum;
                currentNum = nextNum;

            }
        }

        sc.close();

    }
}
