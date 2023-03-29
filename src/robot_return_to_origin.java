public class robot_return_to_origin {
    public static void main(String[] args) {
        String moves = "LLLRRL";
        int count_U_and_D = 0;
        int count_R_and_L = 0;
        boolean b = false;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                count_U_and_D++;
            }
            if (moves.charAt(i) == 'D') {
                count_U_and_D--;
            }
        }
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                count_R_and_L++;
            }
            if (moves.charAt(i) == 'L') {
                count_R_and_L--;
            }
        }
        if (count_U_and_D == 0 && count_R_and_L == 0) {
            b = true;
        }
        System.out.println(b);
    }
}
