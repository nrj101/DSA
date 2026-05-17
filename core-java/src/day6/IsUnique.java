package day6;

// Determine if a String has all unique characters. Usage of any special data structures not allowed

import java.util.HashMap;
import java.util.Map;

public class IsUnique {

    public static void main(String[] args) {
        String myString = "abcdefghijkl";//"random words for input";

        Map<Character, Boolean> charMap = new HashMap<>();

        boolean isUnique = true;
        for(int i=0; i<myString.length(); i++){
            if(charMap.containsKey(myString.charAt(i))){
                isUnique = false;
                break;
            }
            charMap.put(myString.charAt(i), true);
        }

        System.out.println("Input String: "+myString+"\nContains no duplicate characters? "+isUnique);
    }



}
