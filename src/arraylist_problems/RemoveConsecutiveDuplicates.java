package arraylist_problems;

import java.util.*;

public class RemoveConsecutiveDuplicates {
    public static ArrayList<Integer> removeConsecutiveDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();

        if (list.size() == 0) {
            return result;
        }

        result.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(i - 1))) {
                result.add(list.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 1, 2, 2, 2, 3, 1, 1, 4));

        System.out.println(removeConsecutiveDuplicates(list));
    }
}

