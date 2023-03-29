import java.util.ArrayList;
import java.util.Collections;

public class the_kth_factor_of_N {
    public static void main(String[] args) {
        int n = 4;
        int k = 4;

        System.out.println(kthFactor(n, k));
    }

    public static int kthFactor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) list.add(i);
                else {
                    list.add(i);
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        if(k > list.size()) return -1;
        return list.get(k - 1);
    }
}
