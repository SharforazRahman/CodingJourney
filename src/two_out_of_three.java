import java.util.*;

public class two_out_of_three {
    public static void main(String[] args) {
        int[] num1 = {1,1,3,2};
        int[] num2 = {2, 3};
        int[] num3 = {3};
        System.out.println(twoOutOfThree(num1, num2, num3));
    }

    public static List<Integer> twoOutOfThree(int[] a, int[] b, int[] c) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int i : a) set.add(i);
        for (int i : set) map.put(i, map.getOrDefault(i, 0) + 1);

        set.clear();
        for (int i : b) set.add(i);
        for (int i : set) map.put(i, map.getOrDefault(i, 0) + 1);

        set.clear();
        for (int i : c) set.add(i);
        for (int i : set) map.put(i, map.getOrDefault(i, 0) + 1);

        for(int i : map.keySet()){
            if(map.get(i) >= 2) list.add(i);
        }
        return list;
    }
}
