package problem_solving;

import java.util.PriorityQueue;

class Queue_problems {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(5);
        numbers.add(23);

        System.out.println("Priority Queue status: " + numbers);
        System.out.println("Top element: " + numbers.peek());

        while (!numbers.isEmpty()) {
            Integer removedNumber = numbers.poll();
            System.out.println("Removed: " + removedNumber);
        }
    }
}

