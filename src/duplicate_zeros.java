import java.util.ArrayList;
import java.util.Arrays;

public class duplicate_zeros {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0};
        int[] res = new int[arr.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int j : arr) {
            if (arr.length == list.size()) {
                break;
            }
            if (j == 0) {
                list.add(0);
            }
            list.add(j);
        }
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
            count++;
            if(count == arr.length) break;
        }
        System.arraycopy(res, 0, arr, 0, arr.length);
        System.out.println(Arrays.toString(res));
    }
}
