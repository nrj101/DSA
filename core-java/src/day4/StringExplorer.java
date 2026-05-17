package day4;

// Given a string, print: its length, each character with its index, 
// count of vowels, count of consonants, and whether it's a palindrome. 
// All using charAt and loops — no helper methods like reverse().


// Regex: 
// [^a-zA-Z0-9] => find every character that is not a letter or digit
// [^a-zA-Z] => find only letters
// \\s+  =>  find multiple continuous spaces
// eg: str.replaceAll("[^a-zA-Z0-9]", "");   str.replaceAll("[^a-zA-Z]", "!"); str.replaceAll("\\s+", " "); 


public class StringExplorer {

	public static void main(String[] args) {
		
		String myString = "race car";//"random string of characters";
		
		int countVowel=0, countConsonants=0, length=myString.length();
		
		boolean isPalindrome = true;
		
		System.out.println("\n======================\n Char   |   Index\n======================\n");
		
		for(int i=0; i<length; i++) {
			
			System.out.println(myString.charAt(i)+"             "+i);
			
			switch(myString.charAt(i)) {
			case 'a':
			case 'A': 
			case 'e':
			case 'E': 
			case 'i':
			case 'I': 
			case 'o':
			case 'O': 
			case 'u':
			case 'U': countVowel++; break;
			case ' ': continue;
			default: countConsonants++;
			}
			
			if(myString.charAt(i) != myString.charAt(length-i -1))
				isPalindrome = false;
			
		}
		
		System.out.println("======================");
		
		System.out.println("Length: "+length);
		System.out.println("No of vowels: "+countVowel+"\nNo of consonants: "+countConsonants+"\nIsPalindrome? "+isPalindrome);
		
	}

}
