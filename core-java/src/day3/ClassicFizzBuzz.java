package day3;

// Print the number of Fizz, Buzz and FizzBuzz between number 1 and 50

public class ClassicFizzBuzz {

	public static void main(String[] args) {
		
		int fiz=0, buz=0, fbz = 0;
		
		for(int i=1; i<=50; i++) {
			if(i%3 == 0 && i%5 ==0){
				fbz++;
				System.out.println(i+"   =>   FizzBuzz (total="+fbz+")");
			}else if(i%3 ==0) {
				fiz++;
				System.out.println(i+"   =>   Fizz (total="+fiz+")");
			}else if(i%5 ==0) {
				buz++;
				System.out.println(i+"   =>   Buzz (total="+buz+")");
			}else{
				System.out.println(i);
			}
		}
		
		System.out.println("Stats (1-50): \n\nFizz: "+fiz+"\nBuzz: "+buz+"\nFizzBuzz: "+fbz);
	}

}
