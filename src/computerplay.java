/**
 * Created by marian on 11/5/2015.
 */
public class computerplay extends player{


    public computerplay(String name) {
        super(name);
        myhand = new hand();
        hasAI = true;
    }

    //Todo: add code for computers automatic playing
    public void play(){
        int cardsInHand = myhand.inhand();
        for (card card : myhand.cards){
            if (card.rank == main.topcard.cards.get(0).rank) {
                main.topcard.addTopcard(card);
                myhand.removecard(card);

                break;
            }
            else if (card.suit == main.topcard.cards.get(0).suit){
                main.topcard.addTopcard(card);
                myhand.removecard(card);
                break;
            }



        }
        int newCardsInHand = myhand.inhand();
        if (cardsInHand == newCardsInHand){
            myhand.addcard(main.deck.draw());
        }
        System.out.println("Computer is done playing.");//show if computer
    }
}



