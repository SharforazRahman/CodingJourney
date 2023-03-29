public class reverse_string_two {
    public static void main(String[] args) {
        String s = "abcd";
        int k = 2;
        String[] str = s.split(" ");
        StringBuilder store = new StringBuilder();
        for (String x : str) {
            char[] ch = x.toCharArray();
            char ans = ch[k-1];
            store.append(ans);
            for (int j = 0; j < ch.length; j++) {
                if (j == k - 1) {
                    continue;
                }
                else {
                    store.append((ch[j]));
                }
            }
        }
        System.out.println(store);
    }
}
