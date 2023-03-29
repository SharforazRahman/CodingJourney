import java.util.ArrayList;
import java.util.Arrays;

public class convert_the_temperature {
    public static void main(String[] args) {
        double celsius = 36.50;
        double[] new_array = new double[2];

        new_array[0] = celsius + 273.15;
        new_array[1] = celsius * 1.80 + 32.00;

        System.out.println(Arrays.toString(new_array));

    }
}
