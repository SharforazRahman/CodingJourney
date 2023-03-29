import java.util.Scanner;

public class power_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the base: ");
        double base = sc.nextDouble();
        System.out.print("Input the power: ");
        double power = sc.nextDouble();
        double input = Math.pow(base,power);

        System.out.print("so the power is: "+input);
    }
}
