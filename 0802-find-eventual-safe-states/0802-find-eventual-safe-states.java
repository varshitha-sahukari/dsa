class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        int n = graph.length;

        List<Integer>[] reverse = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            reverse[i] = new ArrayList<>();
        }

        int[] outdegree = new int[n];

        for (int i = 0; i < n; i++) {

            outdegree[i] = graph[i].length;

            for (int next : graph[i]) {
                reverse[next].add(i);
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (outdegree[i] == 0) {
                q.offer(i);
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!q.isEmpty()) {

            int node = q.poll();

            ans.add(node);

            for (int prev : reverse[node]) {

                outdegree[prev]--;

                if (outdegree[prev] == 0) {
                    q.offer(prev);
                }
            }
        }

        Collections.sort(ans);

        return ans;
    }
}