import java.util.*;


public class three_sum_closet {
    public static void main(String[] args) {
        int[] num = {-1,2,1,-4};
        int target = 1;
        threeSumClosest(num,target);
    }

    public static void threeSumClosest(int[] arr, int target) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int k = j+1; k < arr.length;k++){
                    list.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        System.out.println(list);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list.size(); i++){
            min = Math.min(min,(list.get(i)-target));
        }
        System.out.println(min);
    }
}
