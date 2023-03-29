public class detect_capital {
    public static void main(String[] args) {
        String word = "UsA";
        String uppercase = word.toUpperCase();
        String lowercase = word.toLowerCase();
        StringBuilder first_letter_upper_case = new StringBuilder();
        char[] ch = word.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (i == 0) {
                first_letter_upper_case.append(Character.toUpperCase(ch[i]));
            } else {
                first_letter_upper_case.append(Character.toLowerCase(ch[i]));
            }
        }
        String result = first_letter_upper_case.toString();
        if (lowercase.equals(word) || uppercase.equals(word) || result.equals(word)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
