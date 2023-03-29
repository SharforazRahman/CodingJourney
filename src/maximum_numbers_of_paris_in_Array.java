import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class maximum_numbers_of_paris_in_Array {
    public static void main(String[] args) {
        int[] num = {1,3,2,1,3,2,2};
        numberOfPairs(num);
    }

    public static void numberOfPairs(int[] num) {
        Set<Integer> set = new HashSet<>();
        for (int i : num) set.add(i);
        int result = num.length - set.size();

        int[] new_array = new int[2];
        new_array[0] = result;
        new_array[1] = set.size() - result;

        System.out.println(Arrays.toString(new_array));
        //return new_array;
    }
}
