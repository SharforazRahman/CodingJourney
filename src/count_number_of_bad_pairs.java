public class count_number_of_bad_pairs {
    public static void main(String[] args) {
        int[] num = {4,1,3,3};
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int index_result = j - i;
                int value_result = num[j] - num[i];
                if (!(index_result == value_result)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
