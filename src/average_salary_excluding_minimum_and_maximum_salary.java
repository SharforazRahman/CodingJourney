import java.text.DecimalFormat;
import java.util.Arrays;

public class average_salary_excluding_minimum_and_maximum_salary {
    public static void main(String[] args) {
        int[] salary = {48000,59000,
                99000,13000,
                78000,45000,
                31000,17000,
                39000,37000,
                93000,77000,
                33000,28000,
                4000,54000,
                67000,6000,
                1000,11000};

        Arrays.sort(salary);
        double total_salary = 0;
        double count = 0;
        for(int i = 1; i < salary.length-1; i++){
            total_salary = total_salary + salary[i];
            count++;
        }
        double result = (total_salary / count);
        System.out.printf("%.5f",result);
    }
}
