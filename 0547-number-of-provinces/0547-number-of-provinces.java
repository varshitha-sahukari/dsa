class Solution {
    static void bfs(int i,int[][] isConnected,boolean[] isVisited){
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        isVisited[i] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int n=0;n<isConnected.length;n++){
                if(isConnected[node][n] == 1 && !isVisited[n]){
                    isVisited[n]= true;
                    q.offer(n);
                }
            }
            
        }

    }
    public int findCircleNum(int[][] isConnected) {
        
        int v = isConnected.length;
        
        boolean[] isVisited = new boolean[v];
        int count=0;
        for(int i=0;i<v;i++){
            if(!isVisited[i]){
                bfs(i,isConnected,isVisited);
                count++;
            }
        }
        return count;
    }
}