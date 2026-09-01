import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }
        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> b - a);
        for (int f : freq) {
            if (f > 0) {
                pq.add(f);
            }
        }

        int time = 0;

        while (!pq.isEmpty()) {
            int cycle = n + 1;
            List<Integer> remaining = new ArrayList<>();

            while (cycle > 0 && !pq.isEmpty()) {

                int current = pq.poll();

                current--;

                if (current > 0) {
                    remaining.add(current);
                }

                time++;
                cycle--;
            }

            for (int f : remaining) {
                pq.add(f);
            }

            if (!pq.isEmpty()) {
                time += cycle;
            }
        }

        return time;
    }
}