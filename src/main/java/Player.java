import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();

        }

    public void receiveCard(Card card){
        this.hand.add(card);
    }

    public int cardCount(){
       return this.hand.size();
    }

    public int handValue(){
        return getHand().get(0).getRank().getValue();
    }
}
