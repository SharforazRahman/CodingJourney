public class merge_string_alternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pq";
        StringBuilder sb = new StringBuilder();
        int len = word2.length()+word1.length();
        for (int i = 0; i < len; i++) {
            if(i < word1.length()){
                sb.append(word1.charAt(i));
            }
            if(i < word2.length()){
                sb.append(word2.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
