import java.util.Scanner;

public class volume_Of_Cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volumeOf_Cone = 0;

        volumeOf_Cone = 3.1416*(radius*radius)*(height/3);
        System.out.println("Area is: "+volumeOf_Cone);
    }
}
