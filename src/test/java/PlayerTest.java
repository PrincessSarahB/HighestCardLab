import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Card card;

    @Before
    public void before(){
        player1 = new Player("Jim");
        card = new Card(Suit.CLUBS, Rank.EIGHT);
    }

    @Test
    public void playerHasName(){
        assertEquals("Jim", player1.getName());
    }

//    @Test
//    public void playerHasCards(){
//        player1.recieveCard(game);
//        assertEquals(1, player1.getCard());
//    }
}
