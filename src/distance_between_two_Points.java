import java.util.Scanner;

public class distance_between_two_Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first_input = sc.nextDouble();
        double second_input = sc.nextDouble();
        double third_input = sc.nextDouble();
        double fourth_input = sc.nextDouble();

        double distance = Math.sqrt(((second_input-first_input)*(second_input-first_input))+((fourth_input-third_input)*(fourth_input-third_input)));
        System.out.println("Distance is: "+distance);
    }
}
