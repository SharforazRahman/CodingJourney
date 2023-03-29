public class roman_to_integer {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                result = result + L;
            }
            if (s.charAt(i) == 'I') {
                result = result + I;
            }
            if (s.charAt(i) == 'V') {
                result = result + V;
            }
            if (s.charAt(i) == 'X') {
                result = result + X;
            }
            if (s.charAt(i) == 'C') {
                result = result + C;
            }
            if (s.charAt(i) == 'D') {
                result = result + D;
            }
            if (s.charAt(i) == 'M') {
                result = result + M;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                I = I + V - 1;
            }
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                I = I + X - 1;
            }
            if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                X = X + L - 1;
            }
            if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                X = X + C - 1;
            }
            if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                C = C + D - 1;
            }
            if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                C = C + M - 1;
            }
        }
        System.out.println(result);
    }
}
