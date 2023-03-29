public class numbers_of_string_that_appear_as_substring_in_word {
    public static void main(String[] args) {
        String[] patterns = {"a","acb","bc","d"};
        String word = "abc";
        int count = 0;

        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
