public class divide_a_string_into_Group_of_size_k {
    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';
        //System.out.println(divideString(s,k,x));
        divideString(s, k, fill);
    }

    public static void divideString(String s, int k, char fill) {
        int len = 0, index = 0, iterator = 0;
        StringBuilder sb = new StringBuilder();
        if (s.length() % k == 0) len = s.length();
        else len = s.length() + (k - (s.length() % k));
        sb.append(String.valueOf(fill).repeat(Math.max(0, len)));

        char[] c = sb.toString().toCharArray();
        for (char i : s.toCharArray()) c[index++] = i;
        sb.setLength(0);

       for (int i = 0; i < c.length; i++){
           if(i > 0 && i % k == 0) sb.append(" ");
           sb.append(c[i]);
       }
        String[] ans = sb.toString().split(" ");
    }
}
