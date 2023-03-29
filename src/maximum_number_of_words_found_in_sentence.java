import java.util.Arrays;
import java.util.Comparator;

public class maximum_number_of_words_found_in_sentence {
    public static void main(String[] args) {
        String[] sentences = {"w jrpihe zsyqn l dxchifbxlasaehj",
                "nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom",
                "xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg",
                "krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm",
                "rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr",
                "o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk",
                "hrvh efqvjilibdqxjlpmanmogiossjyxepotezo",
                "qstd zui nbbohtuk", "qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) return 1;
                else return -1;
            }
        };
        Arrays.sort(sentences, comparator);
        System.out.println(Arrays.toString(sentences));
        return sentences[0].split(" ").length;
    }
}
