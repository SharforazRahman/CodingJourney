import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class uncommon_words_from_two_sentences {
    public static void main(String[] args) {
        String s1 = "apple apple";
        String s2 = "banana";

        String[] first_string = s1.split(" ");
        String[] second_string = s2.split(" ");


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(first_string));
        arrayList.addAll(Arrays.asList(second_string));
        String[] list_to_array = new String[arrayList.size()];
        for(int i = 0; i < arrayList.size(); i++){
            list_to_array[i] = arrayList.get(i);
        }
        HashMap<String,Integer> hm = new HashMap<>();

        for (String i : list_to_array) {
            if (hm.containsKey(i)) {
                int old_frequency = hm.get(i);
                int new_frequency = old_frequency + 1;
                hm.put(i, new_frequency);
            } else {
                hm.put(i, 1);
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry entry : hm.entrySet()){
            if(entry.getValue().equals(1)){
                list.add((String) entry.getKey());
            }
        }
        String[] result = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        System.out.println(Arrays.toString(result));
    }
}
