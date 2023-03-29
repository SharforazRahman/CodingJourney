import java.util.Arrays;

public class array_partition {
    public static void main(String[] args) {
        int[] num = {6, 2, 6, 5, 1, 2};
        System.out.println(arrayPairSum(num));
    }

    public static int arrayPairSum(int[] a) {
        Arrays.sort(a);
        int min;
        int answer = 0;
        for (int i = 0, j = 1; i < a.length - 1; i += 2, j+= 2) {
            min = Math.min(a[i], a[j]);
            answer += min;
        }
        return answer;
    }
}
