import java.util.ArrayList;

public class number_of_common_factors {
    public static void main(String[] args) {
        int a = 25;
        int b = 30;
        ArrayList<Integer> list_a = new ArrayList<Integer>();
        ArrayList<Integer> list_b = new ArrayList<Integer>();
        for(int i = 1 ; i <= a; i++){
            if(a % i == 0){
                list_a.add(i);
            }
        }
        for(int i = 1 ; i <= b; i++){
            if(b % i == 0){
                list_b.add(i);
            }
        }
        list_a.retainAll(list_b);
        System.out.println(list_a.size());


    }
}
