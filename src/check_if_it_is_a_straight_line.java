import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class check_if_it_is_a_straight_line {
    public static void main(String[] args) {
        int[][] coordinates = {
                {1, 1},
                {2, 2},
                {3, 4},
                {4, 5},
                {5, 6},
                {6, 7}
        };

        int[] array = Stream.of(coordinates).flatMapToInt(IntStream::of).toArray();
        boolean b = true;
        for (int i = 1; i < array.length - 1; i += 2) {
            if (array[i] != array[i + 1]) {
                b = false;
                break;
            }
        }
        System.out.println(b);
    }
}
