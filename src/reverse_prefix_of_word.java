public class reverse_prefix_of_word {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    public static String reversePrefix(String word, char ch) {
        char[] array = word.toCharArray();
        int i = 0;
        int j = word.length();
        int index = 0;
        while (i < j) {
            if (array[i] == ch) {
                index = i;
                break;
            }
            i++;
        }
        boolean b = index != 0;
        if (b) {
            int x = 0;
            int y = array.length;
            while (x < index) {
                char temp = array[x];
                array[x] = array[index];
                array[index] = temp;
                x++;
                index--;
            }
            return (String.valueOf(array));
        } else {
            return (word);
        }
    }
}
