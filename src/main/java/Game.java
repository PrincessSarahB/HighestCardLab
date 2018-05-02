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

    public int playerCount(){
        return this.players.size();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public Card getCardFromDeck(){
        return deck.removeCard();
  }



    public void deal() {
        for (Player player : this.players) {
            player.receiveCard(getCardFromDeck());
        }

    }

    public Player compareCards(){
       Player player1 = this.players.get(0);
       Player player2 = this.players.get(1);

       if (player1.handValue() > player2.handValue()){
           return player1;
        }

        else if (player2.handValue() > player1.handValue()){
           return player2;
       }

       else return null;

    }

  }

