class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n+n];
        int a=0;
        int b=n;
        for(int i=0;i<nums.length;i=i+2){
            ans[i]=nums[a];
            ans[i+1]=nums[b];
            a++;
            b++;
        
        }
        return ans;
    }
}