import java.util.Scanner;

public class NCR_programme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of things: ");
        int n = sc.nextInt();
        System.out.print("number of things to be chosen out of n things: ");
        int r = sc.nextInt();
        int n_value_store = 1;
        int r_value_store = 1;
        int n_minus_r_value_Store = 1;

        for (int i = n; i >= 1; i--) {
            n_value_store = n_value_store * i;
        }

        for (int i = r; i >= 1; i--) {
            r_value_store = r_value_store * i;
        }

        int n_minus_r = n - r;
        for (int i = n_minus_r; i >= 1; i--) {
            n_minus_r_value_Store = n_minus_r_value_Store * i;
        }

        int result = (n_value_store) / (r_value_store * n_minus_r_value_Store);
        System.out.print("NcR is :" + result);
    }
}
