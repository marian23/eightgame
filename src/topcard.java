import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by marian on 11/4/2015.
 */
public class topcard {
    ArrayList<card> cards = new ArrayList<>();


    public void addTopcard(card toPlay) {
        Scanner s = new Scanner(System.in);
        if (cards.isEmpty()) {
            cards.add(toPlay);
        }
        else {
            if (toPlay.rank.equals("8")) {
                String suits[] = {"Hearts", "Spades", "Diamond", "Clubs"};
                int suit;
                do {
                    System.out.println("1 - Hearts\n2 - Spades\n3 - Diamond\n4 - Clubs");
                    System.out.println("Enter a number for a suit");
                    while (!s.hasNextInt()) {
                        System.out.println("that's not a number");
                        s.next();
                    }
                    suit = s.nextInt();
                } while (suit <= 0 && suit >= 5);

                toPlay.suit = suits[suit - 1];
                this.cards.add(0, toPlay);
            }
            else if (toPlay.rank == cards.get(0).rank) {
                this.cards.add(0, toPlay);
            }
            else if (toPlay.suit == cards.get(0).suit) {
                this.cards.add(0, toPlay);
            }
        }
    }

    public void shows(){
        System.out.println("Top card is: " +cards.get(0));
    }
}

