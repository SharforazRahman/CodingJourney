import java.util.Scanner;

public class Define_TwoMethod_print_MaximumAndMinimumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int input1 = sc.nextInt();
        System.out.print("Enter second Number: ");
        int input2 = sc.nextInt();
        System.out.print("Enter third Number: ");
        int input3 = sc.nextInt();

        System.out.print("Having the MAX value ");
        max(input1,input2,input3);
        System.out.println();
        System.out.print("Having the MIN value ");
        min(input1,input2,input3);
    }
    static void max(int a,int b,int c){
        System.out.print(Math.max(c,(Math.max(a,b))));
    }
    static void min(int a,int b,int c){
        System.out.print(Math.min(c,(Math.min(a,b))));
    }
}
