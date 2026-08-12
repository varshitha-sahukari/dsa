class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        int n = nums.length;
        int i=0;
        while(i<n){
            sum += nums[i];
            int rem = sum%k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2) return true;
            }else{
                map.put(rem,i);
            }
            i++;
        }
        return false;
    }
}