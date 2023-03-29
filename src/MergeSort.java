import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int m = 3;
        int[] num2 = {2,5,6};
        int n = 3;

        merge(num1,m,num2,n);
    }

    public static void merge(int[] num1, int m, int[] num2, int n) {
        int[] mix = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (num1[i] < num2[j]) mix[k++] = num1[i++];
            else mix[k++] = num2[j++];
        }

        while (i < m) mix[k++] = num1[i++];
        while (j < n) mix[k++] = num2[j++];

        System.out.println(Arrays.toString(mix));
    }
}
