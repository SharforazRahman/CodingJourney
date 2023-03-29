public class maximum_number_of_words_you_can_type {
    public static void main(String[] args) {
        String text = "leet code", brokenLetters = "lt";
        System.out.println(canBeTypedWords(text,brokenLetters));
    }
    public static int canBeTypedWords(String text, String brokenLetters) {
        String[] str = text.split(" ");
        int count = 0;

        for(String i : str) {
            for (char j : brokenLetters.toCharArray()) {
                if (i.contains(j + "")) {
                    count++;
                    break;
                }
            }
        }
        return str.length - count;
    }
}
