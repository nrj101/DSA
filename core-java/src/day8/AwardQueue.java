package day8;

// Program to demonstrate the usage of LinkedList (Queue flavor) from Collections Framework

import java.util.Deque;
import java.util.LinkedList;

public class AwardQueue {
    public static void main(String[] args) {

        // Deque (a.k.a. Doubly-ended Queue) extends Queue (legacy). LinkedList implements Deque
        // So essentially, a LinkedList is sufficient to be used as a Stack, Queue or Deque

        Deque<Student> awardeesList = new LinkedList<>();

        awardeesList.offer(new Student("Brad", 17));
        awardeesList.offer(new Student("Peter", 12));
        awardeesList.offer(new Student("Alex", 24));
        awardeesList.offer(new Student("Michael", 8));

        System.out.println("Award queue:"+awardeesList);

        System.out.println("\nFirst award goes to: "+awardeesList.poll());
        System.out.println("Award queue:"+awardeesList);

        Student wildCard = new Student("Sam", 29);
        System.out.println("\nWildCard entry: "+wildCard);
        awardeesList.offer(wildCard);
        System.out.println("Award queue:"+awardeesList);

        awardeesList.remove(wildCard);
        System.out.println("WildCard entry removed");
        System.out.println("Award queue:"+awardeesList);

        System.out.println("\nFront: "+awardeesList.peekFirst()+"      Rear: "+awardeesList.peekLast());


    }
}
