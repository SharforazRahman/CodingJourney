import java.util.*;

public class intersection_of_two_array {
    public static void main(String[] args) {
        int[] num1 = {4, 9, 5};
        int[] num2 = {9, 4, 9, 8, 4};

        Set<Integer> one_set = new HashSet<>();
        Set<Integer> two_set = new HashSet<>();

        for (int i : num1) {
            one_set.add(i);
        }
        for (int i : num2) {
            two_set.add(i);
        }
        ArrayList<Integer> list_one = new ArrayList<>(one_set);
        ArrayList<Integer> list_two = new ArrayList<>(two_set);
        ArrayList<Integer> result = new ArrayList<>();


        if (one_set.size() < two_set.size()) {
            for (int i = 0; i < one_set.size(); i++) {
                for (int j = 0; j < two_set.size(); j++) {
                    if (Objects.equals(list_one.get(i), list_two.get(j))) {
                        result.add(list_one.get(i));
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < two_set.size(); i++) {
                for (int j = 0; j < one_set.size(); j++) {
                    if (Objects.equals(list_two.get(i), list_one.get(j))) {
                        result.add(list_two.get(i));
                        break;
                    }
                }
            }
        }
        int[] arr = result.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(arr));
    }
}