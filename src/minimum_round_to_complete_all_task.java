import java.util.HashMap;

public class minimum_round_to_complete_all_task {
    public static void main(String[] args) {
        int[] tasks = {9, 9, 9, 11, 11, 22, 22, 22, 22, 55, 55};
        System.out.println(minimumRounds(tasks));
    }

    public static int minimumRounds(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int value = 0;
        int reminder = 0;
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

        for (int i : map.keySet()) {
            if (map.get(i) < 2) return -1;
            else value = value + map.get(i);
        }
        reminder = value % 3;
        if (reminder == 0 && value > 2) return (value / 3) + reminder;
        else return (value / 3) + 1;
    }
}
