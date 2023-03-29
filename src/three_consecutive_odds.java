public class three_consecutive_odds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        int count = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                count++;
            }
            if (count == 3) {
                System.out.println("true");
            }
            if (count == 3) {
                break;
            }
            if (j % 2 == 0) {
                count = 0;
            }
        }
        if (count < 3) {
            System.out.println("false");
        }
    }
}