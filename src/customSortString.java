public class customSortString {
    public static void main(String[] args) {
        String order = "kqep", s = "pekeq";
        System.out.println(customSortString1(order,s));
    }
    public static String customSortString1(String order, String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char i : order.toCharArray()){
            if(s.contains(i+"")) count++;
        }
        for(int i = 0; i < order.length(); i++){
            if(s.contains(order.charAt(i)+"")) sb.append(order.charAt(i));
        }
        for(int i = count; i < s.length(); i++) sb.append(s.charAt(i));
        return sb.toString();
    }
}
