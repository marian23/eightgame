/**
 * Created by marian on 11/2/2015.
 */
public class player {
    String name;
    hand myhand;
    boolean hasAI;


    public player( String name){
        this.myhand =  new hand();
        this.name = name;
        hasAI = false;
    }
    public void  ci(card c){
        myhand.getcard(c);



            }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String gethand(){

        return myhand.nameofcard();
    }

    public void showha(){
        System.out.println(this.myhand);
    }


    public void play() {
        System.out.println("Not a computer, should not even run this");
    }
}


