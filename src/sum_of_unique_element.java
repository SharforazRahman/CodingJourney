import java.util.HashMap;

public class sum_of_unique_element {
    public static void main(String[] args) {
        int[] num = {1, 1, 1, 1, 1};
        System.out.println(sumOfUnique(num));
    }

    public static int sumOfUnique(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) map.put(i, map.getOrDefault(i, 0) + 1);
        int sum = 0;

        for(int i : map.keySet()){
            if(map.get(i) == 1) sum+= i;
        }
        return sum;
    }
}
