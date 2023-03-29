import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class deleteGreatestValueInEachRow {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 4},
                {3, 3, 1}
        };
        System.out.println(deleteGreatestValue(grid));
    }

    public static int deleteGreatestValue(int[][] grid) {
        int[] array = Stream.of(grid).flatMapToInt(IntStream::of).toArray();
        Arrays.sort(array);
        int store = 0, max = Integer.MIN_VALUE;

        for (int i = 0, j = 1; i < array.length; i += 2, j += 2) {
            max = Math.max(array[i], array[j]);
            store += max;
        }
        return store;
    }
}
