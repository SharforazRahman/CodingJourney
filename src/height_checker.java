import java.util.Arrays;

public class height_checker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        int[] copy_array_sorted = heights.clone();
        Arrays.sort(copy_array_sorted);
        int count = 0;
        for (int i = 0, j = 0; i < heights.length; i++, j++) {
            if (heights[i] != copy_array_sorted[j]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
