import java.util.ArrayList;

public class perfect_Number {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(checkPerfectNumber(n));
    }

    public static boolean checkPerfectNumber(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                list.add(i);
                list.add(num / i);
            }
        }
        list.remove(Integer.valueOf(num));
        int sum = 0;
        for(int i : list) sum += i;

        return sum == num;
    }
}
