import java.util.ArrayList;
import java.util.Arrays;

public class can_make_arithmetic_progression_from_sequence {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(arr);
        int[] new_Array = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            new_Array[i] = arr[i + 1] - arr[i];
        }
        for (int i : new_Array) {
            list.add(i);
        }
        list.remove(Integer.valueOf(0));
        int count = 0;
        int store = list.get(0);
        for (Integer integer : list) {
            if (!integer.equals(store)) {
                count++;
            }
            if (count > 0) {
                break;
            }
        }
        if (count > 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
