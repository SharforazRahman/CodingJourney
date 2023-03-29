import java.util.ArrayList;

public class check_if_numbers_are_ascending_in_a_sentence {
    public static void main(String[] args) {
        String s = "hello world 5 x 5";
        String[] words = s.split(" ");

        ArrayList<Integer> list = new ArrayList<>();
        for (String word : words) {
            try {
                list.add(Integer.valueOf(word));
            } catch (Exception ignored) {
            }
        }
        boolean b = true;
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i+1) <= list.get(i)){
                b = false;
                break;
            }
        }
        System.out.println(b);
    }
}

