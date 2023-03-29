public class max_chunks_to_make_array_sorted {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 0};
        int max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i) {
                count++;
            }
        }
        System.out.println(count);
    }
}
