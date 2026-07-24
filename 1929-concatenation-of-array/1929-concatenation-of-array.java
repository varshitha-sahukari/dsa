class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int [] ans = new int[n+n];
        for(int i=2*n-1;i>=0;i--){
            ans[i]= nums[i%n];
        }
        return ans;
    }
}