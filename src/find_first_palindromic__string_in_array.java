public class find_first_palindromic__string_in_array {
    public static void main(String[] args) {
        String[] word = {"notapalindrome","racecar"};
        String res = "";

        for (String s : word) {
            char[] ch = s.toCharArray();
            int i = 0;
            int j = ch.length - 1;
            boolean b = true;
            while (i < j) {
                if (ch[i] != ch[j]) {
                    b = false;
                    break;
                }
                i++;
                j--;
            }
            if (b) {
                res = s;
                break;
            }
        }
        System.out.println(res);
    }
}
