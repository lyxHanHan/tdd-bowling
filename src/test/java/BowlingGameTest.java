import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void all_10 (){
        BowlingGame bowlingGame = new BowlingGame();
        int score = bowlingGame.score(10,10,10,10,10,10,10,10,10,10,10,10);
        assertEquals(300,score);
    }
}
