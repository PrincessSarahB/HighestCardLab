import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<>();
    }

    public Deck getDeck() {
        return deck;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

  public void deal(){
        deck.removeCard();
  }
}
