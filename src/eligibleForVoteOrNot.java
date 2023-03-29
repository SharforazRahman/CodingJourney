import java.util.Scanner;

public class eligibleForVoteOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int input = sc.nextInt();
        System.out.println(eligible_for_Vote(input));
    }
    static boolean eligible_for_Vote(int age){
        return age >= 18;
    }
}
