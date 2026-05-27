package day9;

// Program to print all subsequences of an integer array (sorted asc) where sum of elements = K
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SubsequencesHavingSumK {

    public static void main(String[] args) {
        int K = 4;
        List<Integer> myArray = new ArrayList<>(Arrays.asList(-2, -1, 0, 1, 2, 3));

        List<List<Integer>> subsequencesHavingSumK = new ArrayList<>();

        System.out.println("Sequence of numbers: "+myArray);

        findAllSubsequencesHavingSumK(0, myArray, subsequencesHavingSumK, K, new ArrayList<>());

        System.out.println("\n====================\nAll subsequences having sum="+K+":\n");
        for(int i=0; i<subsequencesHavingSumK.size(); i++)
            System.out.println(subsequencesHavingSumK.get(i));
        System.out.println("\n====================");


    }

    public static void findAllSubsequencesHavingSumK(int index, List<Integer> candidates, List<List<Integer>> result, int target, List<Integer> currentSubsequence){

        if(index==candidates.size()){
            if(target==0){
                //System.out.println("Adding subsequence: "+currentSubsequence);
                result.add(new ArrayList<>(currentSubsequence));
            }
            return ;

        }

        // Case 1: Include the current index
        currentSubsequence.add(candidates.get(index));
        findAllSubsequencesHavingSumK(index+1, candidates, result, target - candidates.get(index), currentSubsequence);

        // Case 2: Exclude the current index
        currentSubsequence.removeLast();
        findAllSubsequencesHavingSumK(index+1, candidates, result, target, currentSubsequence);

    }



}
