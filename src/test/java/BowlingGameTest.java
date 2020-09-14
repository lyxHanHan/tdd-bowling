import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void all_10 (){
        BowlingGame bowlingGame = new BowlingGame();
        int data[]={10,10,10,10,10,10,10,10,10,10,10,10};
        int score = bowlingGame.score(data);
        assertEquals(300,score);
    }

    @Test
    void all_0 (){
        BowlingGame bowlingGame = new BowlingGame();
        int  data[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int score = bowlingGame.score(data);
        assertEquals(0,score);
    }
}
