package day8;

// Program to demonstrate the usage of ArrayList from Collections Framework

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class LearnArrayList {

    public static void main(String[] args) {

        // maintaining separate lists for rollNo and names. Must ensure atomic operations across both list.
        // implementing deletions and other complex operations on "student data" as a whole can become challenging
        // with addition of new attributes to students data

        /*
        List<Integer> rollNoList = new ArrayList<>();
        List<String> nameList = new ArrayList<>();

        addNewStudentToLists("Neeraj", 17, nameList, rollNoList);
        addNewStudentToLists("Anu", 12, nameList, rollNoList);
        addNewStudentToLists("John", 24, nameList, rollNoList);
        addNewStudentToLists("David", 8, nameList, rollNoList);

        displayStudentsInfoFromIndividualLists(nameList, rollNoList);
        */

        // Better approach: Create a "Student" class that encapsulates rollNo and Name into a single entity


        System.out.println("\n===========================\n");
        List<Student> students = new ArrayList<>();

        students.add(new Student("Neeraj", 17));
        students.add(new Student("Anu", 12));
        students.add(new Student("John", 24));
        students.add(new Student("David", 8));

        System.out.println(students); // automatically calls the default "toString" method of students object

        students.sort(Comparator.comparingInt(Student::getRollNo));

        System.out.println("\nSorted by Roll nos:\n"+students);

        System.out.println("\nRemoving Student at index 1: "+students.get(1));
        students.remove(1);

        System.out.println("\nNew list:\n"+students);



    }

    public static int addNewStudentToLists(String name, int rollNo, List<String> nameList, List<Integer> rollNoList){
        try{
            nameList.add(name);
            rollNoList.add(rollNo);
        }catch(Exception e){
            System.out.println("An error occurred. Aborting !!");
            return -1;
        }
        return 1;

    }

    public static void displayStudentsInfoFromIndividualLists(List<String> nameList, List<Integer> rollNoList){
        for(int i=0; i< nameList.size(); i++){
            System.out.println("{Name: "+nameList.get(i)+", Roll No. :"+rollNoList.get(i)+"}");
        }
    }

}
