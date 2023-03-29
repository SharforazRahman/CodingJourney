public class celling_of_a_number {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9, 14, 16, 18};
        int target = 4;
        System.out.println(isCelling(arr, target));
    }

    public static int isCelling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (arr[mid] >= target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }
}
