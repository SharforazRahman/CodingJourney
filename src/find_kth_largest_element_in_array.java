import java.util.ArrayList;
import java.util.Comparator;

public class find_kth_largest_element_in_array {
    public static void main(String[] args) {
        String[] array = {"2", "21", "12", "1"};
        System.out.println(kthLargestNumber(array, 3));
    }

    public static String kthLargestNumber(String[] a, int k) {
        ArrayList<String> list = new ArrayList<>();
        for (String i : a) list.add(i);
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (Integer.parseInt(o1) > Integer.parseInt(o2)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        list.sort(comparator);
        return list.get(list.size() - k) + "";
    }
}
