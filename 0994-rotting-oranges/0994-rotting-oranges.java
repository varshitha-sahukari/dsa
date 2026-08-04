class Solution {
    public int orangesRotting(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int [] dr = {-1,0,1,0};
        int [] dc = {0,1,0,-1};
        int time = 0;
        if(fresh == 0){
            return 0;
        }

        while(!q.isEmpty()){
            int size = q.size();

            while(size-- > 0){
                int[]curr = q.poll();
                int r = curr[0];
                int c = curr[1];
                for(int k=0;k<4;k++){
                    int nr = r+dr[k];
                    int nc = c +dc[k];
                    if(nr >=0 && nr <m && nc>=0 && nc <n){
                        if(grid[nr][nc] ==1){
                            grid[nr][nc] =2;
                            fresh--;
                            q.offer(new int[]{nr,nc});
                        }
                    }
                }
                
            }
            time++;
        }

    return fresh == 0 ? time - 1 : -1;
    }
}