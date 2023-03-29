import java.util.*;

public class find_all_numbers_disappeared_in_array {
    public static void main(String[] args) {
        int[] num = {1, 1};
        System.out.println(findDisappearedNumbers(num));
    }

    public static List<Integer> findDisappearedNumbers(int[] a) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : a) set.add(i);

       for(int i = 1; i <= a.length; i++){
           if(!set.contains(i)) result.add(i);
       }
        return result;
    }
}
