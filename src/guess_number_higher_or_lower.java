import java.util.Arrays;

public class guess_number_higher_or_lower {
    public static void main(String[] args) {
        String s = "arRAzFif";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
