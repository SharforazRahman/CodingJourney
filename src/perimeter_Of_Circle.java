import java.util.Scanner;

public class perimeter_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double perimeter = 0;

        perimeter = 2*3.1416*radius;
        System.out.println("Area is: "+perimeter);
    }
}
