class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int l=0;
        int b= n-1;
        while(l<b){
            int mid = l+(b-l)/2;
        if(nums[mid] <nums[mid +1]){
            l = mid + 1;
        }else {
            b= mid;
        }
        }
        return l;
    }
}