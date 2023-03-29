public class capitalize_the_title {
    public static void main(String[] args) {
        String title = "First leTTeR of EACH Word";

        StringBuilder sb = new StringBuilder();
        for(String s : title.toLowerCase().split(" ")){
            if(s.length() > 2) sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
            else sb.append(s).append(" ");
        }
        System.out.println(sb);
    }
}
