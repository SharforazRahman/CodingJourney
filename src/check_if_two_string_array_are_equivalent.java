public class check_if_two_string_array_are_equivalent {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String [] word2 = {"abcddefg"};

        StringBuilder for_word_one = new StringBuilder();
        StringBuilder for_word_two = new StringBuilder();

        for (String s : word1) {
            for_word_one.append(s);
        }
        for (String s : word2) {
            for_word_two.append(s);
        }
        if(for_word_one.toString().equals(for_word_two.toString())){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
}
