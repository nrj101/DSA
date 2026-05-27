package day9;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

// Can use unicode chars to display actual icons?
enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES}
enum Rank {DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}

public class BasicRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nHow many cards to draw? ");
        int n = sc.nextInt();

        drawCards(n);

        sc.close();


    }
    public static void drawCards(int n){
        if(n<=0)
            return ;

        Suit s = Suit.values()[ ThreadLocalRandom.current().nextInt(4) ] ;  // since total members in the enum Suit = 4
        Rank r = Rank.values()[ ThreadLocalRandom.current().nextInt(13) ]; // since total members in the enum Rank = 13

        System.out.println(r+" of "+s);

        drawCards(--n);
    }
}
