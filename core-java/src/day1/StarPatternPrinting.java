package day1;

public class StarPatternPrinting {

	public static void main(String[] args) {
		
		System.out.println("\n\n========================\n");
		
		printRightTriangle(5);
		
		System.out.println("\n\n========================\n");
		
		printInvertedRightTriangle(5);
		
		System.out.println("\n\n========================\n");
		
		printPyramid(5);
		
		System.out.println("\n\n========================\n");
		
		printInvertedPyramid(5);
		
		System.out.println("\n\n========================\n");
		
		printDiamond(5);
		
		System.out.println("\n\n========================\n");
		

	}
	
	public static void printRightTriangle(int height) {
		for(int verticalMove=0; verticalMove<height; verticalMove++) {
			System.out.println();
			int horizontalMove=0;
			while(horizontalMove <= verticalMove) {
				System.out.print("*");
				horizontalMove++;
			}
		}
	}
	
	public static void printInvertedRightTriangle(int height) {
		for(int verticalMove=height; verticalMove>0; verticalMove--) {
			System.out.println();
			int horizontalMove=0;
			while(horizontalMove < verticalMove) {
				System.out.print("*");
				horizontalMove++;
			}
		}
	}
	
	public static void printPyramid(int height) {
		for(int verticalMove=0; verticalMove<height; verticalMove++) {
			System.out.println();
			
			// For a given row, print white spaces first
			for(int w=0; w < (height-verticalMove-1);w++)
				System.out.print(" ");
			
			// Print pattern: 1 stars => 3 stars => 5 stars => 7 stars (i.e. no. of stars = 2*verticalPosition + 1)
			int horizontalMove=0;
			while(horizontalMove < (2*verticalMove)+1) {
				System.out.print("*");
				horizontalMove++;
			}
		}
	}
	
	public static void printInvertedPyramid(int height) {
		
		for(int verticalMove=0; verticalMove<height; verticalMove++) {
			
			System.out.println();
			
			// For a given row, print white spaces first
			for(int w=0; w <= verticalMove;w++)
				System.out.print(" ");
						
			// Print pattern: 9 stars => 7 stars => 5 stars => 2 stars (i.e. no. of stars = 2*(height-verticalPosition) -1)
			int horizontalMove=0;
			while(horizontalMove < (2*(height-verticalMove)-1)) {
				System.out.print("*");
				horizontalMove++;
			}
						
		}
		
	}
	
	public static void printDiamond(int height) {
		printPyramid(height);
		printInvertedPyramid(height-1); // height-1 to exclude the middle row from printing twice
	}

}
