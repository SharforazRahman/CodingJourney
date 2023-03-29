import java.util.*;

public class second_largest_digit_in_string {
    public static void main(String[] args) {
        String s = "ck077";
        System.out.println(secondHighest(s));
    }

    public static int secondHighest(String s) {
        Set<Character>set = new HashSet<>();
        String res = s.replaceAll("([a-z])", "");
        char[] ch = res.toCharArray();
        for(char i : ch) set.add(i);
        List<Character> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());
        int currentIndex = 0;
        int desiredIndex = 1;
        for (Character element :list) {
            if (currentIndex == desiredIndex)
            {
                return Integer.parseInt(String.valueOf(element));
            }
            currentIndex++;
        }
        return -1;
    }
}
