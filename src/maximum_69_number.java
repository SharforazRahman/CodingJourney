import java.util.Arrays;

public class maximum_69_number {
    public static void main(String[] args) {
        int num =  9999;
        String str = ""+num;
        int count = 0;
        String result_in_String = "";
        char[] c = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            c[i] = str.charAt(i);
        }
        for(int i = 0; i < c.length; i++){
            if (c[i] == '6') {
                c[i] = '9';
                count++;
            }
            if(count > 0){
                break;
            }
        }
        for (char value : c) {
            result_in_String = result_in_String + value;
        }
        System.out.println(result_in_String);

    }
}
