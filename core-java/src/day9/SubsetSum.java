package day9;

// Program to print sums of all unique subsets of given sorted array in the increasing order of sum value.

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class SubsetSum {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3));

        List<List<Integer>> allSubsets = new ArrayList<>();

        findAllSubsets(0, numbers, allSubsets, new ArrayList<>());

        // For later: Add the logic for sorting based on sum value of the subsets, and discarding duplicate sums

        System.out.println("\n====================\nAll subsets and their sums:\n");
        for(int i=0; i<allSubsets.size(); i++)
            System.out.println(allSubsets.get(i)+"     |  Sum: "+allSubsets.get(i).stream().mapToInt(Integer::intValue).sum());
        System.out.println("\n====================");



        
    }

    public static void findAllSubsets(int index, List<Integer> candidates, List<List<Integer>> result, List<Integer> currentSubset){
        if(index==candidates.size()){
            result.add(new ArrayList<>(currentSubset));
            return ;
        }
        for(int j=index; j<candidates.size(); j++){
            // Skip over the duplicates for the current level (depth) of selection
            if(j>index && candidates.get(j).equals(candidates.get(j-1)))
                continue;

            // add current candidate to the current subset
            currentSubset.add(candidates.get(j));
            findAllSubsets(j+1, candidates, result, currentSubset);

            // remove current candidate to explore other candidates for this level in the next iteration
            currentSubset.removeLast();
        }
    }
}
