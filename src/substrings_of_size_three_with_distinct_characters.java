import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class substrings_of_size_three_with_distinct_characters {
    public static void main(String[] args) {
        String s = "aababcabc";
        System.out.println(countGoodSubstrings(s));
    }

    public static int countGoodSubstrings(String s) {
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        char[] c = s.toCharArray();
        int i = 0;
        int j = i + 1;
        int k = j + 1;

        while (j != s.length() - 1) {
            sb.append(c[i]).append(c[j]).append(c[k]).append(" ");
            i++;
            j++;
            k++;
        }
        String[] res = sb.toString().split(" ");

        for (String re : res) {
            char[] ch = re.toCharArray();
            for (Character ans : ch) set.add(String.valueOf(ans));
            if (set.size() == 3) list.add(re);
            set.clear();
        }
        return list.size();
    }
}
