public class a_number_double_reversal {
    public static void main(String[] args) {
        int num = 1800;
        System.out.println(isSameAfterReversals(num));
    }
    public static boolean isSameAfterReversals(int num) {
        String s = num+"";
        if(s.charAt(0) == '0') return true;
        return s.charAt(s.length() - 1) != '0';
    }
}
