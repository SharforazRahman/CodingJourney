public class valid_palindrome {
    public static void main(String[] args) {
        String s = "ab2a";
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        boolean b = true;
        while (i <= j) {
            while (i <= j && !Character.isLetterOrDigit(c[i])) {
                i++;
            }
            while (i <= j && !Character.isLetterOrDigit(c[j])) {
                j--;
            }
            if (c[i] != c[j]) {
                b = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(b);
    }
}
