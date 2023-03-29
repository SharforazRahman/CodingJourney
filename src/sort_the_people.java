import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class sort_the_people {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        String[] res = new String[names.length];
        for (int i = 0; i < names.length; i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for(int i = heights.length - 1, j = 0; i >= 0; i--,j++){
            res[j] = map.get(heights[i]);
        }
        return res;
    }
}
