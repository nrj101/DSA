package day4;


// Given "firstname.lastname@domain.com", extract and print: 
// first name, last name, domain name, and TLD (.com). 
// Then count the number of words in a sentence entered as a string, 
// handling multiple spaces.

public class EmailAndWordParser {

	public static void main(String[] args) {
		
		String myString = "firstname.lastname@domain.com";
		
		String[] parts = myString.split("@"); // firstname.lastname     |    domain.com
		
		String firstName = parts[0].split(".")[0];
		String lastName = parts[0].split(".")[1];
		
		String domainName = parts[1].split(".")[0];
		String tld = parts[1].split(".")[1];
		
		System.out.println("Output of email parser: \n");
		System.out.printf("First name: %s   \nLast name: %s   \nDomain name: %s   \nTLD: %s", firstName, lastName, domainName, tld);
		

	}

}
