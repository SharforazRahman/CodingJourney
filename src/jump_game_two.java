import java.util.ArrayList;
import java.util.Arrays;

public class jump_game_two {
    public static void main(String[] args) {
        int[] nums = {0};
        int count = 0;
        int max = 0;
        int increasing = 0;
        if (nums.length == 1) {
            System.out.println(0);
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    increasing++;
                }
            }
            if (increasing == nums.length - 1) {
                System.out.println(1);
            } else {
                for (int num : nums) {
                    if (num > max) {
                        max = num;
                    }
                    if (max > num) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}