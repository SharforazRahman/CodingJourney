import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class sort_the_people {
    public static void main(String[] args) {
        String[] names = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        int[] heights = {17233,32521,14087,42738,46669,65662,43204,8224};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0, j = 0; i < names.length; i++, j++) {
            list.add(heights[i] + names[i]);
        }
        list.sort(Comparator.comparingInt(a -> Integer.parseInt(a.replaceAll("[a-zA-Z]", ""))));
        StringBuilder str = new StringBuilder();
        for(int i = list.size()-1; i >= 0; i--){
            str.append(list.get(i));
        }
        str = new StringBuilder(str.toString().replaceAll("\\d", " "));
        String r = str.toString().replaceAll("\\s+"," ").trim();;
        String[] ans = r.split(" ");
        System.out.println(Arrays.toString(ans));
    }
}
