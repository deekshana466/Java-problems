package arraylist_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArrayList {
    public ArrayList<Integer> rotateRight(ArrayList<Integer> list, int k) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        int n = list.size();
        k = k % n;
        if (k == 0) {
            return new ArrayList<>(list);
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(list.subList(n - k, n));
        result.addAll(list.subList(0, n - k));
        return result;
    }

    public static void main(String[] args) {
        RotateArrayList ra = new RotateArrayList();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(ra.rotateRight(list, 2));
    }
}

