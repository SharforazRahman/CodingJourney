import java.util.ArrayList;

public class reverse_vowels_of_a_string {
    public static void main(String[] args) {
        String s = " ";
        char[] ch = s.toCharArray();
        StringBuilder space_case = new StringBuilder();
        for (char item : ch) {
            if (item != ' ') {
                space_case.append(item);
            }
        }
        char[] c = space_case.toString().toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> modified_list = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u'
                    || c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U') {
                list.add(c[i]);
                c[i] = ' ';
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            modified_list.add(list.get(i));
        }
        for (int i = 0, j = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                c[i] = modified_list.get(j);
                j++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char value : c) {
            sb.append(value);
        }
        String result = sb.toString();
        char[] ans = result.toCharArray();
        StringBuilder final_result = new StringBuilder();
        for(int i = 0,j = 0; i < ch.length; i++){
            if(ch[i] == ' '){
                final_result.append(" ");
            }
            else {
                final_result.append(ans[j]);
                j++;
            }
        }
        System.out.println(final_result);
    }
}