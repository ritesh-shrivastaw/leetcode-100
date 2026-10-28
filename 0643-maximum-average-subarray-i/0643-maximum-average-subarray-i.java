class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        int currsum =sum;
        int maxsum = sum;
        for(int i=k;i<nums.length;i++){
            currsum = currsum - nums[i-k] + nums[i];
            maxsum = Math.max(maxsum,currsum);
        }
        return (double) maxsum/k;
    }
}