import java.util.ArrayList;
import java.util.Arrays;

public class goal_parser_Interpretation {
    public static void main(String[] args) {
        String  command = "(al)G(al)()()G";
        char[] ch = command.toCharArray();
        String store = "";
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '(' && ch[i+1] == ')'){
                ch[i] = 'o';
                ch[i+1] = ' ';
            }
            if(ch[i] == '(' && ch[i+1] == 'a' && ch[i+2] == 'l' && ch[i+3] == ')'){
                ch[i] = 'a';
                ch[i+1] = 'l';
                ch[i+2] = ' ';
                ch[i+3] = ' ';
            }
            store = store+ch[i];
        }
        store = store.replaceAll("\\s", "");
        System.out.println(store);
    }
}
