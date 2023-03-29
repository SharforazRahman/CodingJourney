public class replace_all_digit_with_characters {
    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        System.out.println(replaceDigits(s));
    }

    public static String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0, j = 1; i < s.length() - 1; i++, j++) {
            if (Character.isDigit(s.charAt(j)))
                sb.append((char) (((int) s.charAt(i)) + (Character.getNumericValue(s.charAt(j)))));
        }

        for (int i = 0; i < s.length(); i += 2) sb2.append(s.charAt(i));

        return mergeAlternately(sb2.toString(), sb.toString());
    }

    public static String mergeAlternately(String a, String b) {
        char[] c = a.toCharArray();
        char[] ch = b.toCharArray();

        StringBuilder sb = new StringBuilder();
        char[] res = new char[c.length + ch.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < c.length && j < ch.length) {
            res[k++] = c[i++];
            res[k++] = ch[j++];
        }

        while (i < c.length) {
            res[k++] = c[i++];
        }
        while (j < ch.length) {
            res[k++] = ch[j++];
        }

        for (char x : res) {
            sb.append(x);
        }
        return sb.toString();
    }
}
