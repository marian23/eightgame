import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by marian on 11/4/2015.
 */
public class game {
    int twoplayer = 2;
    int givecard = 7;
    int eachplayer = 5;
    card topcard;
    int players;
    int computer;
    Deck deck = new Deck();
    //player player[] = new player[eachplayer];






    public ArrayList<player> Deal(){
        player player;
        ArrayList<player> playerList = new ArrayList<>();
        String playerName;
        Scanner s = new Scanner(System.in);
        System.out.println("How many players?");
        players = s.nextInt();
        //System.out.println("cpmputer playing");
        //computer = s.nextInt();
        //Todo maybe create one player and one computer or ask
        if (players > 2) {

            for (int i = 0; i < players; i++) {
                System.out.println("Do you want the player to be :\n1-human\n2-computer");
                int playerSelection = s.nextInt();
                hand hand = new hand();
                System.out.println("Player name?");
                playerName = s.next();
                if (playerSelection == 1) {
                    player = new player(playerName);
                }
                else {
                    player = new computerplay(playerName);
                }
                for (int j = 0; j<givecard; j++){
                    hand.addcard(deck.draw());
                }
                player.myhand = hand;
                playerList.add(player);
            }
        }

        else if (players == 2){

            for (int i = 0; i < 2; i++) {
                System.out.println("Do you want the player to be :\n1-human\n2-computer");
                int playerSelection = s.nextInt();
                hand hand = new hand();
                System.out.println("Player name?");
                playerName = s.next();
                if (playerSelection == 1) {
                    player = new player(playerName);
                }
                else {
                    player = new computerplay(playerName);
                }
                for (int j = 0; j<givecard; j++){
                    hand.addcard(deck.draw());
                }
                player.myhand = hand;
                playerList.add(player);


            }

        }
        else {
            System.out.println("Has to be at least 2 players");
        }

        return playerList;
    }


        }


