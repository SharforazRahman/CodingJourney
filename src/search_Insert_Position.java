public class search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = {3,4,9,10};
        int target = 5;
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                result = i;
                break;
            }
            if(nums[nums.length-1] < target && nums[i] != target){
                result = nums.length;
                break;
            }
            if(nums[i] - 1 == target){
                result = i;
            }
            if(nums[i] + 1 == target){
                result = i+1;
            }
        }
        System.out.println(result);
    }
}
