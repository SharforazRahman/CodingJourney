public class pattern_132 {
    public static void main(String[] args) {
        int[] num = {3,1,4,2};
        System.out.println(find132pattern(num));
    }
    public static boolean find132pattern(int[] a) {
        int start = 0;
        int end = a.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(mid > 0 && mid < a.length - 1){
            if(a[mid] > a[mid-1] && a[mid] > a[mid + 1]){
                return true;
            }
            else if(a[mid] < a[mid - 1]) end = mid - 1;
            else start = mid + 1;
            }
        }
        return false;
    }
}
