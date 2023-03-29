public class number_of_segment_in_a_string {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        countSegments(s);
    }
    public static void countSegments(String s) {
        String[] str = s.split(" ");
        System.out.println(str.length);
    }
}
