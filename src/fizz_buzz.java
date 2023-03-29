import java.util.ArrayList;

public class fizz_buzz {
    public static void main(String[] args) {
        int n = 15;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (!(i % 3 == 0 || i % 5 == 0)) {
                list.add(i + "");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else {
                if (i % 3 == 0) {
                    list.add("Fizz");
                }
                if (i % 5 == 0) {
                    list.add("Buzz");
                }
            }
        }
        System.out.println(list);
    }
}
