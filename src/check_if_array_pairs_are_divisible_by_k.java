public class check_if_array_pairs_are_divisible_by_k {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 7;
        System.out.println(canArrange(arr,k));
    }

    public static boolean canArrange(int[] arr, int k) {
        for (int value : arr) {
            for (int i : arr) {
                if (!((value + i) / k == 0)) return false;
            }
        }
        return true;
    }
}
