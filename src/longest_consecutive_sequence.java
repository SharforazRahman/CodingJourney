import java.util.HashSet;
import java.util.Set;

public class longest_consecutive_sequence {
    public static void main(String[] args) {
        int[] num = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(num));
    }

    public static int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) set.add(i);

        int longest_streak = 0;
        for (int i : arr){
            if(!set.contains(i-1)){
                int current_num = i;
                int current_streak = 1;
                while (set.contains(current_num+1)){
                    current_num += 1;
                    current_streak += 1;
                }
                longest_streak = Math.max(longest_streak,current_streak);
            }
        }
        return longest_streak;
    }
}
