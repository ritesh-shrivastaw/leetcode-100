class Solution {
    public int missingInteger(int[] nums) {
          int sum = nums[0];
            int max =sum;
            
        for(int i=1;i<nums.length;i++){
          
            if(nums[i]-nums[i-1]==1){
           
                sum+=nums[i];
                max = Math.max(sum,max);
            }else{
               break;
            }
        }
        while(true){
            if(!found(nums,max)){
                return max;
            }
            max++;
        }
    }
    public boolean found(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }

}