class Solution {
    static void dfs(int i,int[][] isConnected,boolean[] isVisited){
        
        isVisited[i] = true;

        for(int n=0;n<isConnected.length;n++){
            if(isConnected[i][n] == 1 && !isVisited[n]){
                dfs(n,isConnected,isVisited);
                    
            }
        }

    }
    public int findCircleNum(int[][] isConnected) {
        
        int v = isConnected.length;
        
        boolean[] isVisited = new boolean[v];
        int count=0;
        for(int i=0;i<v;i++){
            if(!isVisited[i]){
                dfs(i,isConnected,isVisited);
                count++;
            }
        }
        return count;
    }
}