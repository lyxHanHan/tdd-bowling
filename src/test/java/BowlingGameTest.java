import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void retuturn_the_score_when_the_number_is_all_10 (){
        BowlingGame bowlingGame = new BowlingGame();
        int data[]={10,10,10,10,10,10,10,10,10,10,10,10};
        int score = bowlingGame.score(data);
        assertEquals(300,score);
    }

    @Test
    void retuturn_the_score_when_the_number_is_all_0 (){
        BowlingGame bowlingGame = new BowlingGame();
        int  data[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int score = bowlingGame.score(data);
        assertEquals(0,score);
    }

    @Test
    void retuturn_the_score_when_the_first_plus_second_is_10 (){
        BowlingGame bowlingGame = new BowlingGame();
        int  data[]={10,1,9,10,2,8,4,6,3,7,1,9,10,3,7,10,1,9};
        int score = bowlingGame.score(data);
        assertEquals(178,score);
    }

    @Test
    void retuturn_the_score_when_the_first_plus_second_is_not_10 (){
        BowlingGame bowlingGame = new BowlingGame();
        int  data[]={1,2,3,2,1,2,3,4,2,3,2,2,2,1,3,3,4,2,2,4};
        int score = bowlingGame.score(data);
        assertEquals(48,score);
    }
}
