import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class hand_of_straight {
    public static void main(String[] args) {
        int[] hand = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize = 3;
        System.out.println(isNStraightHand(hand, groupSize));
    }

    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;

        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : hand) list.add(i);
        Collections.sort(list);


        int iterator = 0;

        while (iterator <= hand.length) {
            while (!(set.size() == groupSize)) {
                if (!set.contains(iterator)) {
                    set.add(iterator);
                    list.remove(iterator);
                }
            }
            set.clear();
            iterator++;
        }

        System.out.println(list);
        return true;
    }
}
