class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int total = 0;
        int rotten =0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]!=0) total++;
                if(grid[i][j]==2){
                    rotten++;
                    q.offer(new int[]{i,j});
                }
            }
        }
        int []dr = {-1,1,0,0};
        int []dc = {0,0,-1,1};
        int time =0;
        while(!q.isEmpty() && rotten < total){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] cell = q.poll();
                int r = cell[0];
                int c = cell[1];
                for(int k=0;k<4;k++){
                    int nr = r + dr[k];
                    int nc = c + dc[k];
                    if(nr >=0 && nr < rows && nc >=0 && nc < cols && grid[nr][nc] == 1){
                        rotten++;
                        grid[nr][nc] = 2;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
            time++;
        }
        return rotten==total ? time : -1;
    }
}