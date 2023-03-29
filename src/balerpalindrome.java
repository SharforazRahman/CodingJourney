public class balerpalindrome {
    public static void main(String[] args) {
        String s = "1223451";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j]) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
