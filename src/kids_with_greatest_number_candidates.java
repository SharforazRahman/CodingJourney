import java.util.ArrayList;
import java.util.Arrays;

public class kids_with_greatest_number_candidates {
    public static void main(String[] args) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        int max = Arrays.stream(candies).max().getAsInt();

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        System.out.println(list);
    }
}
