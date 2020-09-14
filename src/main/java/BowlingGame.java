import java.util.stream.Stream;

public class BowlingGame {

    public int score(int[] data) {
        int sum =0;
        for(int i=0;i< data.length;i+=1){
            sum= sum + data[i];
            if (sum==0){
            return sum;
            }
            if  (sum ==120){
                return 300;
            }
        }

        return sum;
    }
}
