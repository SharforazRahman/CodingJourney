public class remove_palindromic_subsequences {
    public static void main(String[] args) {
        String s = "abb";
        int result = 1;
        if(isPalindrome(s)){
            System.out.println(1);
        }
        else {
            result++;
            System.out.println(result);
        }
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        boolean b = true;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(c[i])) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(c[j])) {
                j--;
            }
            if (c[i] != c[j]) {
                b = false;
                break;
            }
            i++;
            j--;
        }
        return b;
    }
}
