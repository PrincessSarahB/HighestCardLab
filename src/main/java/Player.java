import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> card;

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCard() {
        return card;
    }

    public Player(String name) {
        this.name = name;
        this.card = new ArrayList<>();




    }
}
