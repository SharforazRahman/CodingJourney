import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class setMismatch {
    public static void main(String[] args) {
        int[] num = {1, 1};
        System.out.println(Arrays.toString(findErrorNum(num)));
    }

    public static int[] findErrorNum(int[] a) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];

        for (int i : a) {
            if (set.contains(i)) res[0] = i;
            else set.add(i);
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (!set.contains(a[i] + 1)) res[1] = a[i] + 1;
        }
        return res;
    }
}
