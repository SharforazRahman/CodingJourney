public class length_of_last_word {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        String[] str = s.trim().split("\\s+");
        int result = str[str.length-1].length();
        System.out.println(result);
    }
}
