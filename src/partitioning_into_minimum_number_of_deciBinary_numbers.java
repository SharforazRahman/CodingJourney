import java.util.Arrays;

public class partitioning_into_minimum_number_of_deciBinary_numbers {
    public static void main(String[] args) {
        String n = "32";
        System.out.println(minPartitions(n));
    }
     public static int minPartitions(String n) {
        char[] c = n.toCharArray();
        Arrays.sort(c);
        return Integer.parseInt(String.valueOf(c[c.length-1]));
    }
}
