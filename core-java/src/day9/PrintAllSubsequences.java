package day9;

// Program to print all subsequences of numbers in an integer array

import java.util.List;
import java.util.ArrayList;

public class PrintAllSubsequences {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<3; i++)
            numbers.add(i+1);

        System.out.println("Sequence of numbers: "+numbers);

        List<List<Integer>> allSubsequences = new ArrayList<>();

        findAllSubsequences(0, numbers, allSubsequences, new ArrayList<Integer>());

        System.out.println("\n====================\nAll subsequences:\n");
        for(int i=0; i<allSubsequences.size(); i++)
            System.out.println(allSubsequences.get(i));
        System.out.println("\n====================");
    }

    public static void findAllSubsequences(int index, List<Integer> candidates, List<List<Integer>> result, List<Integer> currentSubsequence){

        if(index==candidates.size()){
            result.add(new ArrayList<>(currentSubsequence));
            //System.out.println("\nAdding subsequence to result: "+currentSubsequence);
            return ;
        }

        // Case 1: Include the current number
        currentSubsequence.add(candidates.get(index));
        //System.out.println("Adding "+candidates.get(index)+" to current subsequence. New status: "+currentSubsequence);
        findAllSubsequences(index+1, candidates, result, currentSubsequence);

        // Case 2: Exclude the current number
        currentSubsequence.removeLast();
        //System.out.println("Removing "+candidates.get(index)+" from current subsequence. New status: "+currentSubsequence);
        findAllSubsequences(index+1, candidates, result, currentSubsequence);



    }


}
