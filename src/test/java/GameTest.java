import org.junit.Before;

public class GameTest {

    Deck deck;
    Player player1;
    Player player2;

    @Before
    public void before(){
        deck = new Deck();
        player1 = new Player();
        player2 = new Player();

    }
}
