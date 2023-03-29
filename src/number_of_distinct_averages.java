import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class number_of_distinct_averages {
    public static void main(String[] args) {
        int[] nums = {9,5,7,8,7,9,8,2,0,7};
        Set<Double> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0, j = nums.length - 1; i < nums.length / 2; i++, j--) {
            double d = Double.parseDouble(String.valueOf(nums[i]+nums[j]))/2;
            set.add(d);
        }
        System.out.println(set);
    }
}
