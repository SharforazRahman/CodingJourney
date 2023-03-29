public class minimum_distance_to_the_target_element {
    public static void main(String[] args) {
        int[] num = {2202,9326,1034,4180,1932,8118,7365,7738,6220,3440};
        int target = 3440, start = 0;
        System.out.println(getMinDistance(num, target, start));
    }

    public static int getMinDistance(int[] array, int target, int start) {
        int store = Integer.MAX_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) store = i;
            min = Math.min(min, Math.abs(store - start));
        }
        return min;
    }
}
