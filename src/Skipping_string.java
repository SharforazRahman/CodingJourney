public class Skipping_string {
    public static void main(String[] args) {
        String str = "abcapplebb";
        System.out.println(skipApple(str));
    }

    public static String skipApple(String up) {
        if (up.isEmpty()) return "";

        if (up.startsWith("apple")) {
            return skipApple(up.substring("apple".length()));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
}
