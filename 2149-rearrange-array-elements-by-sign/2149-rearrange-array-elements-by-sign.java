class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        int p = 0;
        int q = 1;
        int i =0;
        while(i<n){
            if(nums[i]>0){
                arr[p]= nums[i];
                p=p+2;
            }  
            else if(nums[i]<0){
                arr[q]=nums[i];
                q = q+2;
            }  
            i++;
        }
        return arr;
    }
}