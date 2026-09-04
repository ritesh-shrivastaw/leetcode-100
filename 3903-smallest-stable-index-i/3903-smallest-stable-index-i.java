class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max =0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            int min = minimum(nums,i);
            if(max-min <= k){
                return i;
            }
        }
        return -1;
    }
    public int minimum(int[] arr ,int j){
        int a =Integer.MAX_VALUE;
        for(int i=j;i<arr.length;i++){
            a= Math.min(arr[i],a);
        }
        return a;
    }
}