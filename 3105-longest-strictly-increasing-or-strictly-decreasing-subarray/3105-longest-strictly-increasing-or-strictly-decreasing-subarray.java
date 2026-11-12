class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc =1,dec =1,max =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                dec++;
                max=Math.max(dec,max);
            }else{
                dec=1;
            }
            if(nums[i]>nums[i-1]){
                inc++;
                max=Math.max(inc,max);
            }else{
                inc=1;
            }
        }
        return max;
    }
}