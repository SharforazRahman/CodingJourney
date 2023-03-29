public class largest_number_at_least_twice_of_others {
    public static void main(String[] args) {
        int[] nums = {0,0,0,1};
        int max = 0;
        int count = 0;
        int index = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        for (int num : nums) {
            if (num * 2 > max) {
                count++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(max == nums[i]){
                index = i;
            }
        }

        if(count >= 2){
            System.out.println("-1");
        }
        else {
            System.out.println(index);
        }
    }
}
