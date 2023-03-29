public class jump_search {
    public static void main(String[] args) {
        int[] arr = {3,11,23,34,48,51,72,86,92};
        int length = arr.length;
        int key = 11;
        System.out.println(jumpSearch(arr,length,key));
    }

    public static int jumpSearch(int[] arr, int length, int key) {
        int start = 0;
        int end = (int) Math.floor(Math.sqrt(length));
        while (arr[end] < key && start < length) {
            start = end;
            end = end + (int) Math.floor(Math.sqrt(length));

            if (end > length - 1) {
                end = length;
            }
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
