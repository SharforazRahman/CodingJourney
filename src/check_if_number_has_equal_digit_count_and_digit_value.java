import java.util.HashMap;

public class check_if_number_has_equal_digit_count_and_digit_value {
    public static void main(String[] args) {
        String num = "1210";
        System.out.println(digitCount(num));
    }

    public static boolean digitCount(String num) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (char i : num.toCharArray()) {
            int val = Character.getNumericValue(i);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for (int i = 0; i < num.length(); i++) {
            if (map.containsKey(i)) {
                if (map.get(i) != Character.getNumericValue(num.charAt(i))) return false;
            } else {
                if (Character.getNumericValue(num.charAt(i)) > 0)
                    return false;
            }
        }
        return true;
    }
}
