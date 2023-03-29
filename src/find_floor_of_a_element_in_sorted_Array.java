public class find_floor_of_a_element_in_sorted_Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 7, 9, 10};
        System.out.println(floor(a,6));
    }

    public static int floor(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == target) return a[mid];
            else if (a[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return a[end];
    }
}
