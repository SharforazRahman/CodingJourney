import java.util.Arrays;

public class find_the_highest_altitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int[] new_array = new int[gain.length];
        int compare = 0;
        for (int i = 0; i < gain.length; i++) {
            compare = compare + gain[i];
            new_array[i] = compare;
        }
        Arrays.sort(new_array);
        int max = 0;

        for (int j : new_array) {
            max = Math.max(max,j);
        }

        if(max < 0){
            System.out.println(0);
        }
        else {
            System.out.println(max);
        }
    }
}
