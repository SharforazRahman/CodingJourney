public class find_closest_number_to_zero {
    public static void main(String[] args) {
        int[] num = {2,1,1,-1,100000};
        System.out.println(findClosestNumber(num));
    }

    public static int findClosestNumber(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i : a) {
            min = Math.min(min,Math.abs(i));
        }
        int min_positive = Math.abs(min);
        for(int i : a){
            if((min * -1) == i) min = min * -1;
            if(min_positive == i) return  min_positive;
        }
        return min;
    }
}
