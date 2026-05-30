package day9;

// Program to generate all combinations of elements of a sorted (asc) positive integer array
// that have sum=K. Duplicate combinations not allowed. Can pick any number multiple times.

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class CombinationSumPattern2 {
    public static void main(String[] args) {
        int K = 4;
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2));

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

        // Each iteration considers element at j'th position in the candidates.
        for(int j=index; j<candidates.size(); j++){

            // Skip over all duplicates as for the j'th element, choosing these elements would result in same combination
            if(j>index && candidates.get(j).equals(candidates.get(j-1)))
                continue ;

            // Stop exploring further branches as all elements from hereon will be greater than target (bcoz sorted asc)
            if(candidates.get(j)>target)
                break ;

            // Pick the j'th element from candidates array as the next element (index) of our resulting combination
            currentCombination.add(candidates.get(j));
            findAllCombinations(j+1, candidates, target - candidates.get(j), result, currentCombination);

            // Remove the j'th element from resulting combination to explore combinations with other elements at index
            currentCombination.removeLast();
        }

    }
}
