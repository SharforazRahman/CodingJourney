public class maximum_number_of_balloons {
    public static void main(String[] args) {
        String text = "nlaebolko";
        System.out.println(maxNumberOfBalloons(text));
    }


    public static int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for (char arr : text.toCharArray())
            switch (arr) {
                case 'b' -> b++;
                case 'a' -> a++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;
            }
        return Math.min(Math.min(Math.min(b, a), n), Math.min(l / 2, o / 2));
    }
}
