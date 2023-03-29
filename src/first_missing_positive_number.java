public class first_missing_positive_number {
    public static void main(String[] args) {
        int[] num = {3, 0, 1};
        System.out.println(missingNumber(num));
    }

    public static int missingNumber(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correct_index = a[i];
            if (a[i] < a.length && a[i] != a[correct_index]) {
                swap(a, i, correct_index);
            } else {
                i++;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] != j) return j;
        }
        return a.length;
    }

    public static void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
