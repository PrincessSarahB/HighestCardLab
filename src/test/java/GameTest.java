import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;
    Card card1;
    Card card2;
    Card card3;
    Card card4;
    Player player1;
    Player player2;

    @Before
    public void before(){

        deck = new Deck();
        game = new Game(deck);
        player1 = new Player("Jim");
        player2 = new Player("Bob");
        card1 = new Card(Suit.DIAMONDS, Rank.KING);
        card2 = new Card(Suit.SPADES, Rank.FIVE);
        card3 = new Card(Suit.HEARTS, Rank.ACE);
        card4 = new Card(Suit.CLUBS, Rank.ACE);

    }

    @Test
    public void removeCardFromDeck(){
        game.getCardFromDeck();
        assertEquals(51, deck.getNumberOfCards());
    }

    @Test

    public void gameHasPlayers(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        assertEquals(2, game.playerCount());
    }

    @Test

    public void dealCards(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.deal();
        assertEquals(1, player1.cardCount());
        assertEquals(1, player2.cardCount());
    }

    @Test

    public void highestCardPlayer1Wins(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        player1.receiveCard(card1);
        player2.receiveCard(card2);
        assertEquals(player1, game.compareCards());
    }

    @Test

    public void highestcardPlayer2Wins(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        player1.receiveCard(card2);
        player2.receiveCard(card1);
        assertEquals(player2, game.compareCards());
    }

    @Test
    public void highestcardPlayer2Wins2cards(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        player1.receiveCard(card2);
        player1.receiveCard(card3);
        player2.receiveCard(card1);
        player2.receiveCard(card4);
        assertEquals(player2, game.compareCards());
    }
}
