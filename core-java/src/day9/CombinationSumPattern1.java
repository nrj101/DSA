package day9;

// Program to generate all combinations of elements that have sum=K. Duplicate combinations allowed.

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CombinationSumPattern1 {

    public static void main(String[] args) {
        int K = 8;
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,5));

        List<List<Integer>> allCombinations = new ArrayList<>();

        System.out.println("Sequence of numbers: "+numbers);

        findAllCombinationsHavingSumK(0, numbers, allCombinations, K, new ArrayList<>());

        System.out.println("\n====================\nAll subsequences having sum="+K+":\n");
        for(int i=0; i<allCombinations.size(); i++)
            System.out.println(allCombinations.get(i));
        System.out.println("\n====================");

    }

    public static void findAllCombinationsHavingSumK(int index, List<Integer> candidates, List<List<Integer>> result, int target, List<Integer> currentCombination){

        if(target == 0){
                result.add(new ArrayList<>(currentCombination));
            return ;
        }
        if(target<0 || index==candidates.size())
            return ;

        // Case 1: Include current element
        currentCombination.add(candidates.get(index));
        findAllCombinationsHavingSumK(index, candidates, result, target - candidates.get(index), currentCombination);

        // Case 2: Exclude current element
        currentCombination.removeLast();
        findAllCombinationsHavingSumK(index+1, candidates, result, target, currentCombination);

    }


}
