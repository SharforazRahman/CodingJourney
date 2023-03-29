import java.util.Arrays;

public class rearranges_spaces_between_words {
    public static void main(String[] args) {
        String text = " hello";
        String s = text;
        int count_spaces = 0;
        int count_words = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { // counting spaces
                count_spaces++;
            }
        }
        if (count_spaces == 0) {
            System.out.println(s);
        } else {
            String[] string_array = s.trim().split("\\s+");
            for (int i = 0; i < string_array.length; i++) {
                count_words++;
            }
            count_words--;
            int truth = 0;
            if (count_spaces % count_words == 0) {
                truth = 1;
            }


            StringBuilder sb = new StringBuilder();
            for (String value : string_array) {
                int space = count_spaces / count_words;
                sb.append(value);
                while (space != 0) {
                    sb.append(" ");
                    space--;
                }
            }

            if (truth == 1) {
                System.out.println(sb.toString().trim());
            } else {
                String ans = sb.toString().trim();
                ans = ans + " ";
                System.out.println(ans);
            }
        }
    }
}
