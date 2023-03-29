public class validMountainArray {
    public static void main(String[] args) {
        int[] a = {1,1,1,1,1,1,1,2,1};
        System.out.println(mountainArray(a));
    }

    public static boolean mountainArray(int[] a) {
        int max = Integer.MIN_VALUE;
        int index_Max = 0, x = 0;
        boolean b = true;

        for (int i : a) max = Math.max(max, i);

        while (max != a[x++]) index_Max++;

        if(a.length < 3 || index_Max == a.length - 1 || index_Max == 0) return false;

        for (int i = 0; i < index_Max; i++) {
            if (!(a[i] < a[i + 1])) return false;
        }

        for (int i = index_Max; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1]) return false;
        }
        return b;
    }
}
