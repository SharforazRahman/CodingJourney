import java.util.Arrays;

public class two_sum_two {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4};
        int target = 6;

        int i = 0;
        int j = numbers.length - 1;
        int[] new_array = new int[2];
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                new_array[0] = i + 1;
                new_array[1] = j + 1;
                break;
            }
            if (numbers[i] + numbers[j] > target) {
                j--;
            }
            if (numbers[i] + numbers[j] < target) {
                i++;
            }
        }
        System.out.println(Arrays.toString(new_array));
    }
}
