import java.util.Arrays;

public class maximum_repeating_substring {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        int count = 0;
        char[] c = sequence.toCharArray();

        if(word.contains(Arrays.toString(c) +"")){
            count++;
        }
        System.out.println(count);
    }
}
