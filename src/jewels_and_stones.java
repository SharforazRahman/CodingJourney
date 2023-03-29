public class jewels_and_stones {
    public static void main(String[] args) {
        String jewels = "Z", stones = "zz";
        char[] jewels_array = jewels.toCharArray();
        char[] stone_array = stones.toCharArray();
        int count = 0;

        for (char c : stone_array) {
            for (char value : jewels_array) {
                if (value == c) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
