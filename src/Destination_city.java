import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Destination_city {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        System.out.println(destCity(paths));
    }
    public static String destCity(List<List<String>> paths) {
        HashMap<String,String>map = new HashMap<>();
        for(List<String> path : paths){
            map.put(path.get(0),path.get(1));
        }
        for (String city : map.values()){
            if(!map.containsKey(city)) return city;
        }
        return "";
    }
}
