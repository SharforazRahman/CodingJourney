import java.util.HashMap;

public class second_largest_digit_in_string {
    public static void main(String[] args) {
        String s = "abc1111";
        System.out.println(secondHighest(s));
    }

    public static int secondHighest(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0,index = 0;
        for(char i : s.toCharArray()){
            if(Character.isDigit(i)) map.putIfAbsent(Integer.parseInt(String.valueOf(i)),count++);
        }

        for(int i : map.keySet()){
            if(index == 1) return i;
            index++;

        }
        return -1;
    }
}
