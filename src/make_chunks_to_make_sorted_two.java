public class make_chunks_to_make_sorted_two {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,4};
        int max = arr[0];
        int count = 0;

        for (int j : arr) {
            if (max <= j) {
                max = j;
                count++;
            }
        }
        System.out.println(count);
    }
}
