import java.util.HashMap;

public class RingAndRods {
    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
        System.out.println(countPoints(rings));
    }

    public static int countPoints(String rings) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < rings.length()-1; i+=2) {
            map.put(rings.charAt(i), rings.charAt(i+1));
        }
        System.out.println(map);
        return 0;
    }
}

