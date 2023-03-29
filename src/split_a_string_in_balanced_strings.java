public class split_a_string_in_balanced_strings {
    public static void main(String[] args) {
        String s = "LLLLRRRR";
        int count = 0;
        int count_balanced = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                count_balanced++;
            }
        }
        System.out.println(count_balanced);
    }
}
