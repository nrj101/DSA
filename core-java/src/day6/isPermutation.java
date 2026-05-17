package day6;

// write a method to check if one string is a permutation of the other

import java.util.HashMap;
import java.util.Map;

public class isPermutation {

    public static void main(String[] args) {

        String myString1="aabbcc"; //"dfasdf";
        String myString2 = "abcabc"; //"abdsfasfas";

        //String myString1="dfasdf";
        //String myString2 = "abdsfasfas";

        System.out.println("String1: "+myString1+"    |    String2: "+myString2+"    |    Is permutation? "+isPermutation(myString1, myString2));

    }

    public static boolean isPermutation(String str1, String str2){
        Map<Character, Integer> charMapStr1 =new HashMap<>();
        Map<Character, Integer> charMapStr2 =new HashMap<>();

        if(str1.length()!=str2.length())
            return false;
        else{
            for(int i=0; i<str1.length(); i++){

                if(charMapStr1.containsKey(str1.charAt(i))){
                    charMapStr1.put(str1.charAt(i), charMapStr1.get(str1.charAt(i))+1);
                }else
                    charMapStr1.put(str1.charAt(i), 1);

                if(charMapStr2.containsKey(str2.charAt(i))){
                    charMapStr2.put(str2.charAt(i), charMapStr2.get(str2.charAt(i))+1);
                }else
                    charMapStr2.put(str2.charAt(i), 1);
            }


            if(charMapStr1.equals(charMapStr2))
                    return true;

        }

        return false;

    }

}
