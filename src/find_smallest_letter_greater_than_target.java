public class find_smallest_letter_greater_than_target {
    public static void main(String[] args) {
        char[] letters = {'x', 'y', 'x'};
        char target = 'z';
        int count = 0;
        for (char letter : letters) {
            if (letter > target) {
                System.out.println(letter);
            }
        }
        if (count == 0) {
            System.out.println(letters[0]);
        }
    }
}
