import java.util.ArrayList;
import java.util.List;

public class cells_in_a_range_on_an_excel_sheet {
    public static void main(String[] args) {
        String s = "A1:F1";
        System.out.println(cellsInRange(s));
    }
    public static List<String> cellsInRange(String s) {
        int max = Integer.MIN_VALUE;
        for(char i : s.toCharArray()){
            if(Character.isDigit(i)) max = Math.max(max,Integer.parseInt(String.valueOf(Character.isDigit(i))));
            else continue;
        }
        System.out.println(max);
        ArrayList<String> list = new ArrayList<>();
        return list;
    }
}
