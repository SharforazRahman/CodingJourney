import java.util.ArrayList;
import java.util.HashMap;

public class check_if_number_has_equal_digit_count_and_digit_value {
    public static void main(String[] args) {
        String num = "1210";
        System.out.println(digitCount(num));
    }

    public static boolean digitCount(String num) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Integer>list = new ArrayList<>();

        for (char i : num.toCharArray()) map.put(i, map.getOrDefault(i, 0) + 1);

        int j = 0;
        for(char i : map.keySet()){
            if(map.containsKey((Integer.toString(j++)).charAt(0))) list.add(map.get(i));
        }
        System.out.println(list);
//        for(int i = 0; i < num.length(); i++){
//            if(map.containsKey((char)i)){
//                list.add(map.get(i));
//            }
//        }
        return true;
    }
}
