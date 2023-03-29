public class student_record_one {
    public static void main(String[] args) {
        String s = "LLLALL";
        int count_for_A = 0;
        int count_for_L = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') { //counting the number of A
                count_for_A++;
            }
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                count++;               //checking the number of L
                if(count >= 3){
                    break;         // if L is already greater than 3 then breaking the loop
                }
            } else {
                count = 0;        // if without L, if there comes another element then turn the COUNT into 0 again
            }
        }

        if (count < 3) {
            count_for_L = 1;   // if count is still less than 3 after the loop traversal then giving a statement
        }


        if (count_for_A < 2 && count_for_L == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
