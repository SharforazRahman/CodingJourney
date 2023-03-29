public class difference_between_element_sun_and_digit_sum {
    public static void main(String[] args) {
        int[] num = {1,15,6,3};
        System.out.println(differenceOfSum(num));
    }
    public static int checking(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += r;
            n = n / 10;
        }
        return sum;
    }

    public static int differenceOfSum(int[] a) {
        int elementSum = 0;
        int digitSum = 0;
        for(int i : a) elementSum += i;

        for(int i : a){
            if((int)(Math.log10(i))+1 > 1) digitSum += checking(i);
            else digitSum += i;
        }

        return elementSum - digitSum;
    }
}
