import java.util.Arrays;
import java.util.HashMap;

public class maximum_number_of_pairs_in_array {
    public static void main(String[] args) {
        int[] num = {0};
        System.out.println(Arrays.toString(numberOfPairs(num)));
    }

    public static int[] numberOfPairs(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) map.put(i, map.getOrDefault(i, 0) + 1);
        int evenStore = 0, oddStore = 0, leftOver = 0, countOdd = 0;
        for (int i : map.keySet()) {
            if (map.get(i) % 2 == 0) evenStore += map.get(i);
            if (map.get(i) % 2 != 0 && map.get(i) > 2) {
                oddStore += map.get(i);
                countOdd++;
            }
            if (map.get(i) == 1) leftOver += map.get(i);
        }

        int[] res = new int[2];
        res[0] = (evenStore / 2) + (oddStore - countOdd) / 2;
        res[1] = leftOver + countOdd;
        return res;
    }
}
