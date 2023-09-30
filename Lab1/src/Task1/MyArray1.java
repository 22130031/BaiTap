package Task1;

import java.util.ArrayList;
import java.util.TreeSet;

public class MyArray1 {
    public static int[] getMissingValues(int[] array) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : array) {
            set.add(num);
        }
        ArrayList<Integer> missing = new ArrayList<>();
        for (int i = set.first(); i <= set.last(); i++) {
            if (!set.contains(i)) {
                missing.add(i);
            }
        }
        return missing.stream().mapToInt(i -> i).toArray();
    }

    public static int[] fillMissingValues(int[] array, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : array) {
            if (num != -1) {
                set.add(num);
            }
        }
        ArrayList<Integer> filled = new ArrayList<>();
        for (int num : array) {
            if (num == -1) {
                filled.add(k);
            } else {
                filled.add(num);
            }
        }
        return filled.stream().mapToInt(i -> i).toArray();
    }
}
