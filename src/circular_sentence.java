public class circular_sentence {
    public static void main(String[] args) {
        String sentence = "leetcode exercises sound delightful";
        String[] str_array = sentence.split(" ");
        boolean result = false;

        char[] compare_first = str_array[0].toCharArray();
        char[] compare_last = str_array[str_array.length - 1].toCharArray();
        if (compare_first[0] == compare_last[compare_last.length - 1]) {
            result = true;
        }
        if (result) {
            for (int i = 0; i < str_array.length - 1; i++) {
                char[] first_element = str_array[i].toCharArray();
                char[] second_element = str_array[i + 1].toCharArray();

                if (first_element[first_element.length - 1] != second_element[0]) {
                    result = false;
                    break;
                } else {
                    result = first_element[first_element.length - 1] == second_element[0];
                }
            }
            System.out.println(result);
        } else {
            System.out.println(false);
        }
    }
//    public static boolean isCircularSentence(String sentence) {
//        String[] array = sentence.split(" ");
//        for(String i : array)
//    }

    public static void match(String a, String b){
        if(a.equals(b)) return;
    }
}