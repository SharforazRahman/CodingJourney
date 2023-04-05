public class SkipAppNotApple {
    public static void main(String[] args) {
        System.out.println(skipApple("aaaapplebc"));
    }

    public static String skipApple(String up) {
        if (up.isEmpty()) return "";
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipApple(up.substring("app".length()));
        } else return up.charAt(0) + skipApple(up.substring(1));
    }
}
