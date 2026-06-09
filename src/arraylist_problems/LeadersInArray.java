package arraylist_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeadersInArray {
    public ArrayList<Integer> findLeaders(ArrayList<Integer> list) {
        ArrayList<Integer> leaders = new ArrayList<>();
        if (list == null || list.isEmpty()) {
            return leaders;
        }
        int maxFromRight = Integer.MIN_VALUE;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > maxFromRight) {
                leaders.add(list.get(i));
                maxFromRight = list.get(i);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        LeadersInArray la = new LeadersInArray();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(16, 17, 4, 3, 5, 2));
        System.out.println(la.findLeaders(list));
    }
}

