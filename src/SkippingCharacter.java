public class SkippingCharacter {
    public static void main(String[] args) {
        skip("","aaabbccbbdbabbababba");
    }
    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'b'){
            skip(p,up.substring(1));
        }else {
            skip(p+ch,up.substring(1));
        }
    }
}
