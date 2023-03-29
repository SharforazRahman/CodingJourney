public class three_sum_with_multiplicity {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int target = 8;
        int count = 0;

//        for (int i = 0; i < arr.length - 2; i++) {
//            int low_pointer = i + 1;
//            int high_pointer = arr.length - 1;
//            if ((arr[i] + arr[low_pointer] + arr[high_pointer]) == target) {
//                while (low_pointer < high_pointer) {
//                count++;
//                low_pointer++;
//                high_pointer--;
//            }
//
//                else if((arr[i] + arr[low_pointer] + arr[high_pointer]) < target){
//                    low_pointer++;
//                }
//                else {
//                    high_pointer--;
//                }
//
//            }
//        }
//        System.out.println(count);
    }
}
