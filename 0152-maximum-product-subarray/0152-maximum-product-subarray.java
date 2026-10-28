class Solution {
    public int maxProduct(int[] nums) {
        int pro=1;
        int suffix=1;
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(pro==0) pro=1;
            if(suffix==0) suffix=1;
           pro *=nums[i];
           suffix *=nums[n-1-i];
           if(pro>max){
            max = pro;
           }
          if(suffix>max){
            max =suffix;
          }
        }
        return max;
    }
}