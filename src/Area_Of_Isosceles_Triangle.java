import java.util.Scanner;

public class Area_Of_Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double area = 0;

        area = 0.5*height*base;
        System.out.println("Area is: "+area);

    }
}
