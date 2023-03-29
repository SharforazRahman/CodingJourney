import java.util.*;

public class find_original_array_from_double_array {
    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        System.out.println(Arrays.toString(findOriginalArray(changed)));
    }

    public static int[] findOriginalArray(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new java.util.LinkedList<>();

        for(int i : a){
            if(!q.isEmpty() && i == q.peek()) q.poll();
            else{
                q.add(i * 2);
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
