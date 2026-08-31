class Solution {
    static void dfs(int r,int c, char[][]grid,boolean[][]vis){
        int rows = grid.length;
        int cols = grid[0].length;
        if(r<0 ||r>=rows || c<0 || c >=cols) return;
        if(grid[r][c]=='0' || vis[r][c]) return;
        vis[r][c]= true;
        dfs(r-1,c,grid,vis);
        dfs(r+1,c,grid,vis);
        dfs(r,c-1,grid,vis);
        dfs(r,c+1,grid,vis);

    }
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean [][] vis = new boolean[rows][cols];
        int count =0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    count++;
                    dfs(i,j,grid,vis);
                }
            }
        }
        return count;
    }
}