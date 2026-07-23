class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> pq =
            new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (char ch : map.keySet()) {
            pq.offer(ch);
        }

        StringBuilder ans = new StringBuilder();

        while (!pq.isEmpty()) {
            char ch = pq.poll();

            int freq = map.get(ch);

            while (freq-- > 0) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}