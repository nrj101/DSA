package day8;

// Program to demonstrate the usage of LinkedList (Stack flavor) from Collections Framework

import java.util.Deque;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

public class AssignmentsStack {

    public static void main(String[] args) {

        Map<Integer, Boolean> submittedList = new HashMap<>();
        Deque<Student> assignmentsStack = new LinkedList<>();

        submit("Steve", 14, assignmentsStack, submittedList);
        submit("Bruno", 12, assignmentsStack, submittedList);
        submit("Mike", 6, assignmentsStack, submittedList);
        submit("Robert", 10, assignmentsStack, submittedList);
        submit("Patrick", 15, assignmentsStack, submittedList);
        submit("Gustav", 9, assignmentsStack, submittedList);



        System.out.println("\n===============\nRoll number of students who are yet to submit assignments:");

        for(int i=1; i<=15; i++){
            if(!submittedList.containsKey(i))
                System.out.println(i);

        }
        System.out.println("===============");

        System.out.println("\nChecking first submission: "+assignmentsStack.pop());
        System.out.println("\nNext submission: "+assignmentsStack.peek());

    }

    public static boolean submit(String name, int rNo, Deque<Student> assignmentsStack, Map<Integer, Boolean> submittedList){
        try{
            assignmentsStack.add(new Student(name, rNo));
            submittedList.put(rNo, true);
            return true;
        }catch(Exception e){
            System.out.println("An error occurred: "+e);
        }
        return false;
    }



}
