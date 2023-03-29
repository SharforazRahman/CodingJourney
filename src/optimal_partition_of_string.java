public class optimal_partition_of_string {
    public static void main(String[] args) {
        String s = "ssssss";
        System.out.println(partitionString(s));
    }

    public static int partitionString(String s) {
        char[] c = s.toCharArray();
        int count = 0;
        int max = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) count++;
            }
            max = Math.max(max, count);
            count = 0;
        }
        return max + 1;
    }
}
