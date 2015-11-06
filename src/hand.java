import java.util.ArrayList;

/**
 * Created by marian on 10/29/2015.
 */
public class hand {
    ArrayList<card> cards = new ArrayList<>();


    public int inhand() {
        int cardhand = this.cards.size();
        return cardhand;
    }

    public void showH() {
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i));
        }

    }

    public void addcard(card acard) {
        cards.add(acard);

    }
    public void removecard(card removecard){

        cards.remove(removecard);
    }
    public void getcard(card ca){
        cards.add(ca);
    }
    public String nameofcard(){
        return this.cards.get(0).toString();

    }
    public String toString(){
        return this.cards.toString();
    }
}
