import java.util.HashMap;

public class most_frequent_even_element {
    public static void main(String[] args) {
        int[] num = {29,47,21,41,13,37,25,7};
        System.out.println(mostFrequentEven(num));
    }

    public static int mostFrequentEven(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) map.put(i, map.getOrDefault(i, 0) + 1);

        int max = -1, res = -1;
        for (int i : map.keySet()) {
            if (i % 2 == 0) {
                if(map.get(i) > max) {
                    max = map.get(i);
                    res = i;
                }else if(map.get(i) == max && res > i){
                    res = i;
                }
            }
        }
        return res;
    }
}



