import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by marian on 11/3/2015.
 */
    // Todo: maybe improve going back option of play card

public class main {

    public static topcard topcard = new topcard();
    public static Deck deck;


    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        game game = new game();
        deck = game.deck;
        ArrayList<player> playerList;
        boolean won = false;

        //Game Loop
        while (true) {

            playerList = game.Deal();

            topcard.addTopcard(deck.draw()); //draw card from deck
            //Play Loop
            while (!won) {



                for (player p : playerList) {
                    if (p.hasAI) {
                        p.play();
                        if (p.myhand.cards.isEmpty()) {
                            System.out.println(p.getName() + " You Win!"); // show the person who win
                            won = true;
                        }
                        break;
                    }


                    p.showha();
                    topcard.shows();
                    int cardes;


                    do {

                        System.out.println("1-draw a card and continue\n2-try to play a card"); //if you want play the card you hold or
                        // draw card so this code let's draw or play
                        System.out.println("enter your selection"); //let's you the select 1 to draw or 2 to play
                        while (!s.hasNextInt()) {
                            System.out.println("that is not the selection");//if you select different word or number from option you have
                            // so it doesn't let you select other keyword
                            s.next();
                        }
                        cardes = s.nextInt();
                    }
                    while (cardes <= 1 && cardes > 2);//this option to select 1 or 2


                    if (cardes == 1) {
                        // those two code show if you select 1 it draw card
                        p.myhand.addcard(deck.draw());
                    }
                    if (cardes == 2) {
                        //those two codes show if you select 2 it lets you to play
                        p.showha();
                        for (int i = 0; i < p.myhand.cards.size(); i++) {
                            System.out.print(i + "\t\t\t");

                        }

                        System.out.println();
                        System.out.println("What card you want to play"); //this give option what card you want to play
                        int play;
                        do {
                            System.out.println("What card you want to play");
                            System.out.println("enter card to play");//lets you to enter card
                            while (!s.hasNextInt()) {
                                System.out.println("that is not the card");
                                s.next();
                            }
                            play = s.nextInt();

                        } while (play <= 0 && play > p.myhand.inhand());
                        int oldSize = topcard.cards.size();
                        card toAdd = p.myhand.cards.get(play);
                        topcard.addTopcard(toAdd);
                        int newSize = topcard.cards.size();
                        if (oldSize == newSize) {
                            int decision;

                            do {
                                System.out.println("You don't have anything to play");
                                System.out.println("1-draw a card\n2-Pass");
                                System.out.println("enter your selection");     //those codes give option draw card or pass next player
                                while (!s.hasNextInt()) {
                                    System.out.println("that is not the selection");
                                    s.next();
                                }
                                decision = s.nextInt();
                            }
                            while (decision <= 1 && decision > 2);


                            if (decision == 1) {
                                p.myhand.addcard(deck.draw());
                            }
                        } else {
                            p.myhand.removecard(toAdd);
                        }
                    }
                    if (p.myhand.cards.isEmpty()) {
                        System.out.println(p.getName() + " You Win!");
                        won = true;
                        break;
                    }

                }


            }
            won = false;

            System.out.println("play again enter y");
            String name = s.next();

            if (!name.equals("y")) {
                break;

            }
        }

                    }
                }






