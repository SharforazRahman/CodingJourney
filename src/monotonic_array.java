public class monotonic_array {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        int count_for_increasing = 0;
        int count_for_decreasing = 0;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                count_for_increasing++;
                break;
            }
        }

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                count_for_decreasing++;
                break;
            }
        }

        if(count_for_increasing == 0 || count_for_decreasing == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
