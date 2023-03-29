public class find_the_array_concatenation_value {
    public static void main(String[] args) {
        int[] array = {5,14,13,8,12};
        System.out.println(findTheArrayConcVal(array));
    }
    public static long findTheArrayConcVal(int[] a) {
        StringBuilder sb = new StringBuilder();
        if(a.length % 2 != 0) sb.append(a[a.length / 2]).append(" ");
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            sb.append(a[i]).append(a[j]).append(" ");
            i++;
            j--;
        }
        long answer = 0;
        for(String k : sb.toString().split(" ")) answer += Integer.parseInt(k);
        return answer;
    }
}
