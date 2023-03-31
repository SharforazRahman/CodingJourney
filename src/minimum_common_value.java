import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class minimum_common_value {
    public static void main(String[] args) {
        int[] num1 = {1000000000, 1000000000};
        int[] num2 = {1000000000};
        System.out.println(getCommon(num1, num2));
    }

    //WRONG CODE, NEED TO CORRECT
    public static int getCommon(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : a) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : b) map.put(i, map.getOrDefault(i, 0) - 1);

        for (int i : map.keySet()) {
            if (map.get(i) == 0) return i;
        }
        System.out.println(map);
        return -1;
    }
}
