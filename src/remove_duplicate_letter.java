import java.util.Stack;

public class remove_duplicate_letter {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        Stack<Character> st = new Stack<>();
        int[] frequency = new int[26];
        boolean[] exist = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequency[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequency[ch - 'a']--;
            if (exist[ch - 'a']) {
                continue;
            }
            while (st.size() > 0 && st.peek() > ch && frequency[st.peek() - 'a'] > 0) {
                char rem = st.pop();
                exist[rem - 'a'] = false;
            }
            st.push(ch);
            exist[ch - 'a'] = true;
        }
        char[] ans = new char[st.size()];
        int i = ans.length - 1;
        while (i >= 0) {
            ans[i--] = st.pop();
        }
    }
}
