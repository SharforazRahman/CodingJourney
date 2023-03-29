import java.util.Arrays;

public class minimum_number_of_moves_to_seat_everyone {
    public static void main(String[] args) {
        int[] seats = {12,14,19,19,12};
        int[] students = {19,2,17,20,7};
        System.out.println(minMovesToSeat(seats,students));
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        int[] a = new int[seats.length * 2];

        Arrays.sort(seats);
        Arrays.sort(students);

        System.arraycopy(seats, 0, a, 0, a.length / 2);
        for(int i = seats.length,j = 0; i < a.length; i++,j++){
            a[i] = students[j];
        }
        int first_p = 0;
        int second_p = a.length/2;
        int result = 0;
        while (second_p != a.length){
            result = Math.abs(a[second_p] - a[first_p])+ result;
            first_p++;
            second_p++;
        }
        return result;
    }
}
