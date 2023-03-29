public class count_0dd_Numbers_in_Interval_Range {
    public static void main(String[] args) {
        int low = 8;
        int high = 10;
        int count = 0;

        for(int i = low; i <= high; i++){
            if(i % 2 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
