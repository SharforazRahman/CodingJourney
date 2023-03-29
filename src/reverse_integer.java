public class reverse_integer {
    public static void main(String[] args) {
        int x = 1534236469;
        double bits_32 = Math.pow(2, 31);
        if (x > bits_32 || x == 0) {
            System.out.println(0);
        } else {
            int storingValue_x = x;
            if (x < 0) {
                x = x * (-1);
            }
            StringBuilder storage = new StringBuilder();
            while (x > 0) {
                int reminder = x % 10;
                storage.append(reminder);
                x = x / 10;
            }
            System.out.println(Integer.parseInt(storage.toString()));
        }
    }
}