package day9;

// Program to generate all combinations of elements of a sorted (asc) positive integer array
// that have sum=K. Duplicate combinations not allowed.

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class CombinationSumPattern2 {
    public static void main(String[] args) {
        int K = 8;
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 5));

        System.out.println("Sequence of numbers: "+numbers);

        List<List<Integer>> allCombinations = new ArrayList<>();

        findAllCombinations(0, numbers, K, allCombinations, new ArrayList<>());

        System.out.println("\n====================\nAll subsequences having sum="+K+":\n");
        for(int i=0; i<allCombinations.size(); i++)
            System.out.println(allCombinations.get(i));
        System.out.println("\n====================");


    }

    public static void findAllCombinations(int index, List<Integer> candidates, int target, List<List<Integer>> result, List<Integer> currentCombination){
        if(target==0){
            result.add(new ArrayList<>(currentCombination));
            return ;
        }
        if(target<0 || index == candidates.size())
            return ;

        // Case 1: Explore all possibilities for the first elements of the combinations
        for(int j=index; j<candidates.size(); j++){
            currentCombination.add(candidates.get(j));
            findAllCombinations(j, candidates, target - candidates.get(j), result, currentCombination);
        }



        while(currentCombination.getLast().equals(candidates.get(j)))
            j++;


        // Case 2: Remove the current element
        currentCombination.removeLast();
        findAllCombinations(index+1, candidates, target - candidates.get(index), result, currentCombination);

    }
}
