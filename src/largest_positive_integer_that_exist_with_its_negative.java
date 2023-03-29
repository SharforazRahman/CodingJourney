import java.util.ArrayList;
import java.util.Arrays;

public class largest_positive_integer_that_exist_with_its_negative {
    public static void main(String[] args) {
        int[] num = {-1, 2, -3, 3};
        int result = findMaxK(num);
        System.out.println(result);
    }

    public static int findMaxK(int[] num) {
        int max = -1;
        int count = 0;
        Arrays.sort(num);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == 0) {
                    list.add(num[j]);
                    count++;
                }
            }
        }
        if (count == 0) {
            return -1;
        } else {
            for (int i : list) {
                max = Math.max(max, i);
            }
            return max;
        }
    }
}
