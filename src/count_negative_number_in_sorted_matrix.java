public class count_negative_number_in_sorted_matrix {
    public static void main(String[] args) {
        int[][] grid = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
        int count = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
