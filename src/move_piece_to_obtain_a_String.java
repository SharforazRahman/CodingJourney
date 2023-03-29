public class move_piece_to_obtain_a_String {
    public static void main(String[] args) {
        String start = "_L__R__R_", target = "L______RR";
        System.out.println(canChange(start,target));
    }
    public static boolean canChange(String start, String target) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i = 0; i < start.length(); i++){
            if(start.charAt(i) == 'L' || start.charAt(i) == 'R') sb1.append(start.charAt(i));
            if(target.charAt(i) == 'L' || target.charAt(i) == 'R') sb2.append(target.charAt(i));
            else continue;
        }
        return sb1 == sb2;
    }
}
