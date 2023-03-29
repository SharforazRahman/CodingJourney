public class number_of_matching_subsequences {
    public static void main(String[] args) {
        String s = "dsahjpjauf";
        String[] words = {"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"};
        System.out.println(numMatchingSubsequence(s,words));
    }

    public static int numMatchingSubsequence(String s, String[] words) {
        int count = 0;
        for (String word : words) {
            if (isSubsequence(word, s)) count++;
        }
        return count;
    }

    public static boolean isSubsequence(String w, String s) {
        int s_pointer = 0;
        int t_pointer = 0;

        while (t_pointer < s.length()) {
            if (w.charAt(s_pointer) == s.charAt(t_pointer)) {
                s_pointer++;
            }
            if (s_pointer == w.length()) {
                return true;
            }
            t_pointer++;
        }
        return false;
    }
}
