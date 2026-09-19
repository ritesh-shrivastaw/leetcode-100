class Solution {
    public int maximumDifference(int[] nums) {
        int diff =-1;
        int small = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>small){
                diff = Math.max(diff,nums[i]-small);
            }
            if(nums[i]<small){
                small = nums[i];
            }
        }
        return diff;
    }
}