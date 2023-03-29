public class determine_if_string_halves_are_alike {
    public static void main(String[] args) {
        String s = "book";
        char[] c = s.toCharArray();

        int count_first_half = 0;
        int count_second_half = 0;
        for(int i = 0; i < c.length/2; i++){
            if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' ||c[i] == 'o' ||c[i] == 'u'
                    ||c[i] == 'A' ||c[i] == 'E' ||c[i] == 'I' ||c[i] == 'O' ||c[i] == 'U'){
                count_first_half++;
            }
        }

        for(int i = c.length/2; i < c.length; i++){
            if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' ||c[i] == 'o' ||c[i] == 'u'
                    ||c[i] == 'A' ||c[i] == 'E' ||c[i] == 'I' ||c[i] == 'O' ||c[i] == 'U'){
                count_second_half++;
            }
        }
        boolean b = count_first_half == count_second_half;
    }
}
