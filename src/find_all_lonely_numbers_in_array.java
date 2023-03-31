import java.util.*;

public class find_all_lonely_numbers_in_array {
    public static void main(String[] args) {
        int[] num = {75, 35, 59, 66, 69, 53, 37, 16, 60, 98, 11, 33, 3, 85, 59, 65, 59, 44, 34, 89, 72, 47};
        System.out.println(findLonely(num));
    }

    public static List<Integer> findLonely(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        for(int i : arr){
            if(map.get(i) == 1 && !map.containsKey(i - 1) && !map.containsKey(i + 1)) list.add(i);
        }
        return list;
    }
}
