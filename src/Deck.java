import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * Created by marian on 10/28/2015.
 */
public class Deck {
    ArrayList<card> cards = new ArrayList<card>();

    private final String suits[] = {"Hearts", "Spades", "Diamond", "Clubs"};

    private final String ranks[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


    //int totalCard = 52;
    //card deck[];
    //Random rand = new Random();

    public Deck(){
        //int i = 0;
        for (int i = 0; i<suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards.add(new card(suits[i], ranks[j]));
            }

        }


//shuffle deck
        shuffle();

       }



    public void shuffle() {
        Collections.shuffle(this.cards);
        }




    public card draw() {
        return this.cards.remove(0);

    }
    public final card getcard(){
        cards.get(0);


        return cards.get(0);
    }
}
