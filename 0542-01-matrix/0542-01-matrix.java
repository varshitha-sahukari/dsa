class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] dist = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                    dist[i][j]=0;
                }else{
                    dist[i][j]=-1;
                }
            }
        }
        int [] dr = {-1,1,0,0};
        int [] dc = {0,0,-1,1};
        while(!q.isEmpty()){
            int [] cell = q.poll();
            int r = cell[0];
            int c = cell[1];
            for(int k=0;k<4;k++){
                int nr = r+dr[k];
                int nc = c+dc[k];
                if(nr<0 || nr>=rows || nc < 0 || nc >=cols) continue;
                if(dist[nr][nc]==-1){
                    dist[nr][nc]= dist[r][c]+1;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
        return dist;

    }
}