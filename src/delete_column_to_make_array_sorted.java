
public class delete_column_to_make_array_sorted {
    public static void main(String[] args) {
        String[] array =  {"cba","daf","ghi"};
        System.out.println(minDeletionSize(array));
    }
    public static int minDeletionSize(String[] a) {
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 1; j < a[0].length(); j++){
                if(a[j].charAt(i) < a[j-1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
