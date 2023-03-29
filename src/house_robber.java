public class house_robber {
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        int maximum_amount_of_money = 0;
        if (nums.length == 2) {
            System.out.println(Math.max(nums[0], nums[1]));
        }

        else if (nums.length == 3 && nums[0] != nums[1] ||
                nums.length == 3 && nums[1] != nums[2] ||
                nums.length == 3 && nums[0] != nums[2]) {
            int mx = (Math.max(nums[0], nums[1]));
            if((Math.max(mx,nums[2]) > nums[0]+nums[2])){
                System.out.println((Math.max(mx,nums[2])));
            }
            else {
                System.out.println(nums[0]+nums[2]);
            }
        }

        else {
            for (int i = 0; i < nums.length; i++) {
                if (i % 2 == 0) {
                    maximum_amount_of_money = maximum_amount_of_money + nums[i];
                }
            }
           System.out.println(maximum_amount_of_money);
        }
    }
}