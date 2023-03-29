public class watering_plants {
    public static void main(String[] args) {
        int[] plants = {1, 1, 1, 4, 2, 3};
        int capacity = 4;
        System.out.println(wateringPlants(plants, capacity));
    }

    public static int wateringPlants(int[] a, int capacity) {
        int store = capacity;
        int count = 0, result = 0;
        for (int i = 0; i < a.length; i++) {
            if (store >= a[i]) {
                store -= a[i];
                count = i;
            }
            if (store < a[i]) {
                store = capacity;
                result += (count + 1) * 2;
            }
        }
        result += (count + 1) * 2;
        return result;
    }
}
