package day9;

// Write separate methods to print From 1 to N, and from N to 1 through recursion
public class PrintSeriesUsingRecursion {

    public static void main(String[] args) {

        int n = 10;

        System.out.println("\nRecursion while printing backward: \n==============================");
        printBackward(n);
        System.out.println("\n==============================");

        System.out.println("\nRecursion while printing forward: \n==============================");
        printForward(n);
        System.out.println("\n==============================");
    }

    public static void printBackward(int n){
        if(n<=0)
            return ;
        System.out.print("=> "+n+"  ");
        printBackward(n-1);
    }

    public static void printForward(int n){
        if(n<=0)
            return ;
        printForward(n-1);
        System.out.print("=> "+n+"  ");
    }

}
