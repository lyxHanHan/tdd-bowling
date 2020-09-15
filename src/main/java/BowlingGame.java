import java.util.stream.Stream;

public class BowlingGame {

    public int score(int[] data) {
        int score = 0;
        int round = 1;
        for (int i = 0; i < data.length; i++) {
            if (round == 10) {
                score = getTheTenthScore(data, score, i);
                break;
            }
            if (data[i] + data[i + 1] < 10) {
                score += data[i] + data[i+1];
                i++;
            }
            if (data[i] + data[i + 1] == 10) {
                score += 10 + data[i+2];
                i++;
            } else {
                score += 10 + data[i+1] + data[i+2];
            }
            round++;
        }
        return score;

    }

    private int getTheTenthScore(int[] data, int score, int i) {
        if(data[i] + data[i+1] < 10){
            score += data[i] + data[i+1];
        }
        else if (data[i] == 10){
            score += 10 + data[i+1] + data[i+2];
        }
        else {
            score += 10+ data[i+2];
        }
        return score;
    }
}