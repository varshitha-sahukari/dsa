class Solution {
    void bfs(int start,ArrayList<ArrayList<Integer>> adj , boolean [] visited ,Queue<Integer> q){
        q.offer(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int neighbour : adj.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
         boolean [] visited = new boolean[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        bfs(source,adj,visited,q);
        return visited[destination];

    }
}