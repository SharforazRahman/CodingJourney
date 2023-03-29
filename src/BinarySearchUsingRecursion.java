public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 8, 86};
        int target = 6;
        System.out.println(search(arr, target, 0, arr.length - 1));
        System.out.println(binarySearch(arr,86));
    }

    public static int binarySearch(int[] a, int target){
        int start = 0;
        int end = a.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(a[mid] == target) return mid;
            else if(a[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
    public static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return search(arr, target, start, mid - 1);
        } else {
            return search(arr, target, mid + 1, end);
        }
    }
}
