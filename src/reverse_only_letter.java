

public class reverse_only_letter {
    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;

        while (i < j) {
            while (i < j && !Character.isLetter(c[i])) {
                i++;
            }
            while (i < j && !Character.isLetter(c[j])) {
                j--;
            }
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for (char value : c) {
            sb.append(value);
        }
        System.out.println(sb);
    }
}
