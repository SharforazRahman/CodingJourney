public class smallest_index_with_equal_value {
    public static void main(String[] args) {
        int[] num = {4,3,2,1};
        System.out.println(smallestEqual(num));
    }

    public static int smallestEqual(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (i % 10 == num[i]) return i;
        }
        return -1;
    }
}
