class Solution {
    public int[] rearrangeArray(int[] nums) {
        int fre[] = new int [101];
        for(int i=0;i<nums.length;i++){
            fre[nums[i]]++;
        }
        int ans[] = new int [nums.length];
        int k=0;
        while(k<nums.length){
            int i =0;
            while(i<fre.length){
                if(fre[i]>0){
                    ans[k++]=i;
                    fre[i]--;
                }
                i++;
            }
        }
        return ans;
    }
}