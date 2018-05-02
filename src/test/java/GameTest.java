import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;
    Player player1;
    Player player2;

    @Before
    public void before(){

        deck = new Deck();
        game = new Game(deck);
        player1 = new Player("Jim");
        player2 = new Player("Bob");

    }

    @Test
    public void removeCardFromDeck(){
        game.deal();
        assertEquals(51, deck.getNumberOfCards());
    }

    @Test

    public void gameHasPlayers(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        assertEquals(2, game.playerCount());
    }
}
