class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if(nums[0]<nums[n-1]){
            for(int i=1;i<n;i++){
                if(nums[i-1]>nums[i]){
                    return false;
                }
            }
        }
        if(nums[0]>nums[n-1]){
            for(int i=1;i<n;i++){
                if(nums[i]>nums[i-1]){
                    return false;
                }
            }
        }
        if(nums[0]==nums[n-1]){
            for(int i=0;i<n;i++){
                if(nums[i]!=nums[0]){
                    return false;
                }
            }
        }
        return true;
    }
}