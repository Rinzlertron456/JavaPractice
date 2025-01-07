import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KidWithGreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max) max=candies[i];
        }
        for(int i=0; i < candies.length; i++){
            int comp = candies[i]+extraCandies;
            if(comp>=max) result.add(true);
            else result.add(false);
        }
        System.out.println(result);
    }
}
