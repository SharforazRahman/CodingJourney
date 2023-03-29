import java.util.ArrayList;

public class find_triangular_sum_of_an_array {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println(triangularSum(num));
    }

    public static int triangularSum(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : a) list.add(i);

        for (int i = 0; i < list.size() - 1; i++) {
            list.add(list.get(i) + list.get(i)+1);
        }
        System.out.println(list);
        return 0;
    }
}
