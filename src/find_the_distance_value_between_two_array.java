public class find_the_distance_value_between_two_array {
    public static void main(String[] args) {
        int[] arr1 = {2,1,100,3};
        int[] arr2 = {-5,-2,10,-3,7};
        int d = 6;

        System.out.println(findTheDistanceValue(arr1, arr2, d));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        boolean b;
        for (int i : arr1) {
            b = true;
            for (int j : arr2) {
                if ((Math.abs(i - j) <= d)) {
                    b = false;
                    break;
                }
            }
            if(b) count++;
        }
        return count;
    }
}
