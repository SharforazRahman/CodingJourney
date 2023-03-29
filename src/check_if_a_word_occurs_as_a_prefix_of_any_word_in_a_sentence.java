public class check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence {
    public static void main(String[] args) {
        String sentence = "hellohello hellohellohello";
        String searchWord = "ell";
        System.out.println(isPrefixOfWord(sentence, searchWord));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].indexOf(searchWord) == 0) return i + 1;
        }
        return -1;
    }
}
