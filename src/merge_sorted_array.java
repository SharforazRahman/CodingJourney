import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class merge_sorted_array {
    public static void main(String[] args) {
        int[] num1 = {0};
        int[] num2 = {1};
        int m = 0;
        int n = 1;
        mergeTwo(num1,m,num2,n);
    }

    public static void mergeOne(int[] a, int m, int[] b, int n) {
        int[]arr = new int[m+n];

    }
        public static void mergeTwo(int[] a, int m, int[] b, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++) list.add(a[i]);
        for(int i = 0; i < n; i++) list.add(b[i]);
        Collections.sort(list);
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        if(a.length > b.length){
            Arrays.fill(a,Integer.MAX_VALUE);
            System.arraycopy(arr,0,a,0,a.length);
            System.out.println(Arrays.toString(a));
        }
        else{
            Arrays.fill(b,0);
            System.arraycopy(arr,0,b,0,b.length);
            System.out.println(Arrays.toString(b));
        }
    }
}
