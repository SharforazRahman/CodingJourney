import java.util.Arrays;
import java.util.Scanner;

public class richest_customer {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5}, {7, 3}, {3, 5}
        };
        int[] new_array = new int[100];
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                max = max + accounts[i][j];
            }
            new_array[i] = max;
            max = 0;
        }
        Arrays.sort(new_array);
        int result = new_array[new_array.length-1];
        System.out.println(result);
    }
}
