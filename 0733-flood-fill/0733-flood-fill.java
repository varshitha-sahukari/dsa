class Solution {
    static void dfs(int sr,int sc,int[][] image, int original , int clr){
        int rows = image.length;
        int cols = image[0].length;

        if(sr<0 || sr>= rows || sc <0 || sc>= cols) return ;
        if(image[sr][sc] != original) return;
        image[sr][sc] = clr;
        dfs(sr-1,sc,image,original,clr);
        dfs(sr+1,sc,image,original,clr);
        dfs(sr,sc-1,image,original,clr);
        dfs(sr,sc+1,image,original,clr);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if(original == color) return image;
        dfs(sr,sc,image,original,color);
        return image;
    }
}