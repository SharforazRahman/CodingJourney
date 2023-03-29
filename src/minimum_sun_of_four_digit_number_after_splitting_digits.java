import java.util.Arrays;

public class minimum_sun_of_four_digit_number_after_splitting_digits {
    public static void main(String[] args) {
        int num = 2932;
        String str = Integer.toString(num);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String result1 = ch[0]+""+ch[3];
        String result2 = ch[1]+""+ch[2];
        int ans2 = Integer.parseInt(result2);
        int ans1 = Integer.parseInt(result1);
        System.out.println(ans1+ans2);

    }
}
