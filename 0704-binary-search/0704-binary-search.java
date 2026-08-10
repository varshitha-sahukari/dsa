class Solution {
    int binarySearch(int[] nums,int l,int r, int target){
        int mid = l+(r-l)/2;
        if(l>r) return -1;
        if(nums[mid] == target) return mid;
        if(nums[mid] < target ) return binarySearch(nums,mid+1,r,target);
        return binarySearch(nums,l,mid-1,target);

    }
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid = l+(r-l)/2;
        return binarySearch(nums,l,r,target);
    }
}