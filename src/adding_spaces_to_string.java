public class adding_spaces_to_string {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < spaces.length; i++) {
            sb.insert(spaces[i] + i, " ");
        }

        System.out.println(sb);
    }
}
