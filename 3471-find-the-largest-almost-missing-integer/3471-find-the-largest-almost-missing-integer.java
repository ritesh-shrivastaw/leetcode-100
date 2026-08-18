class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq = new int[51];
       for(int i :nums){
        freq[i]++;
       }
       int ans =-1;
       for(int i=0;i<nums.length;i++){
        if(k==nums.length|| (freq[nums[i]]==1 &&(k==1 || i==0 || i==nums.length-1))){
            ans = Math.max(ans,nums[i]);
        }
       
       
    }
    return ans;
}
}