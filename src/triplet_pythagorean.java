import java.util.Scanner;

public class triplet_pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number of triplet: ");
        int input1 = sc.nextInt();
        System.out.print("Enter the second number of triplet: ");
        int input2 = sc.nextInt();
        System.out.print("Enter the third number of triplet: ");
        int input3 = sc.nextInt();

        boolean result = is_triplet_pythagorean(input1,input2,input3);
        System.out.println(result);
    }

    static boolean is_triplet_pythagorean(int input1, int input2, int input3){
        if((input1*input1)+(input2*input2) == (input3*input3)){
            return true;
        }
        if((input1*input1)+(input3*input3) == (input2*input2)){
            return true;
        }
        return (input2 * input2) + (input3 * input3) == (input1 * input1);
    }
}
