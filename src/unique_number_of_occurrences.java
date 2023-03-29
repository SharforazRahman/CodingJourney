import java.util.*;

public class unique_number_of_occurrences {
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i : arr) {
            if (hm.containsKey(i)) {
                int old_value = hm.get(i);
                int new_value = old_value + 1;
                hm.put(i, new_value);
            } else {
                hm.put(i, 1);
            }
        }
        for(Map.Entry entry : hm.entrySet()){
            list.add((Integer) entry.getValue());
        }
        Collections.sort(list);
        boolean b = true;
        for(int i = 0; i < list.size()-1; i++){
            if(Objects.equals(list.get(i), list.get(i + 1))){
                b = false;
                break;
            }
        }
        System.out.println(b);
    }
}
