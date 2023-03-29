import java.util.Arrays;

public class maximum_ice_creams_bar {
    public static void main(String[] args) {
        int[] cost = {1,6,3,1,2,5};
        int coins = 20;
        int count = 0;
        Arrays.sort(cost);
        for (int j : cost) {
            coins = coins - j;
            if (coins < 0) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
