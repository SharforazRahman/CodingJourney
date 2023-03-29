import java.util.ArrayList;
import java.util.List;

public class self_dividing_number {
    public static void main(String[] args) {
        int left = 47;
        int right = 85;

        System.out.println(selfDividingNumbers(left, right));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if(checking(i)) list.add(i);
        }
        return list;
    }

    public static boolean checking(int number) {
        int storingNumber = number;
        while (number != 0) {
            int r = number % 10;
            if (r == 0) return false;
            if (!(storingNumber % r == 0)) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }
}
