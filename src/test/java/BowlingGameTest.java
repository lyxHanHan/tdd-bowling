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

    @Test
    void condition_1 (){
        BowlingGame bowlingGame = new BowlingGame();
        int  data[]={6,4,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int score = bowlingGame.score(data);
        assertEquals(15,score);
    }

    @Test
    void condition_2 (){
        BowlingGame bowlingGame = new BowlingGame();
        int  data[]={4,4,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int score = bowlingGame.score(data);
        assertEquals(8,score);
    }
}
