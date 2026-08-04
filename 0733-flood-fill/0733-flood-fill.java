class Solution {
    int[] dr = {-1,0,1,0};
    int[] dc = {0,1,0,-1};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oc = image[sr][sc];
        if(oc == color) return image;
        dfs(image,sr,sc,oc,color);
    return image;
    }
    public void dfs(int[][] image,int r, int cl,int oc,int c){
        int n = image.length;
        int m = image[0].length;
        if(r<0 || r >=n || cl<0 || cl>=m) return;
        if(image[r][cl] != oc) return; 
        image[r][cl]=c;
        int i =0;
        while(i<4){
            dfs(image,r+dr[i],cl+dc[i],oc,c);
            i++;
        }
    }
}