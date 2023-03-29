import java.util.Objects;

public class reformat_date {
    public static void main(String[] args) {
        String date = "4th Jun 1933";
        reformatDate(date);
    }

    public static void reformatDate(String date) {
        String month = "";
        String day = "";
        StringBuilder d = new StringBuilder();
        String[] s = date.split(" ");

        if(Objects.equals(s[1], "Jan")) month = "01";
        if(Objects.equals(s[1], "Feb")) month = "02";
        if(Objects.equals(s[1], "Mar")) month = "03";
        if(Objects.equals(s[1], "Apr")) month = "04";
        if(Objects.equals(s[1], "May")) month = "05";
        if(Objects.equals(s[1], "Jun")) month = "06";
        if(Objects.equals(s[1], "Jul")) month = "07";
        if(Objects.equals(s[1], "Aug")) month = "08";
        if(Objects.equals(s[1], "Sep")) month = "09";
        if(Objects.equals(s[1], "Oct")) month = "10";
        if(Objects.equals(s[1], "Nov")) month = "11";
        if(Objects.equals(s[1], "Dec")) month = "12";

        char[]c = s[0].toCharArray();
        for(char ch : c){
            if (Character.isDigit(ch))
            {
                d.append(ch);
            }
        }
        int check = Integer.parseInt(d.toString());
        if(check < 10)  day = 0+""+d;
        else day = String.valueOf(d);
        System.out.println(s[2]+"-"+month+"-"+day);
    }
}
