class Solution {
    void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        visited[node] = true;
        for(int neighbours : adj.get(node)){
            if(!visited[neighbours]){
                dfs(neighbours, adj, visited);
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean pathExists = false;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        dfs(source,adj,visited);
        return visited[destination];
        

    }
}