import java.util.Objects;

public class longest_uncommon_subsequence {
    public static void main(String[] args) {
        String  a = "aba", b = "cdc";
        System.out.println(findLUSLength(a,b));
    }
    public static int findLUSLength(String a, String b) {
        if(Objects.equals(a, b)) return -1;
        else return Math.max(a.length(),b.length());
    }
}
