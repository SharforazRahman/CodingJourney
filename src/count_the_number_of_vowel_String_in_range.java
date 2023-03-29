public class count_the_number_of_vowel_String_in_range {
    public static void main(String[] args) {
        String[] words = {"are", "amy", "u"};
        int left = 0, right = 2;
        System.out.println(vowelStrings(words, left, right));
    }

    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (checkingWord(words[i])) count++;
        }
        return count;
    }

    public static boolean checkingWord(String s) {
        return checkVowel(s.charAt(0)) && checkVowel(s.charAt(s.length() - 1));
    }

    public static boolean checkVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
