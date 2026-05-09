
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		int age;
		String name;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("\nEnter your name: ");
		name = sc.nextLine();
		
		System.out.print("\nEnter your age: ");
		age = sc.nextInt();
		
		String riskProfile = "";
		
		if (age>50) {
			riskProfile = "conservative (risk resilient)";
		}else if (age>35) {
			riskProfile = "moderate (balance risk and rewards)";
		}else {
			riskProfile = "aggressive (full throttle ahead)";
		}
		
		System.out.println("Hey "+name+", based on your age ("+age+") group, your portfolio should be "+riskProfile);
		
		sc.close();
	}

}
