public class two_furthest_houses_with_different_colors {
    public static void main(String[] args) {
        int[] a = {1, 8, 3, 8, 3};
        System.out.println(replaceElements(a));
    }

    public static int replaceElements(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) max = Math.max(max, (j - i));
            }
        }
        return max;
    }
}
