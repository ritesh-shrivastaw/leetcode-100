class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> l1 = new ArrayList<>();
        int[] fre = new int[101];
        for(int i=0;i<nums.length;i++){
            fre[nums[i]]++;
        }
        int a=1,sum =0;
        while(a<target){
            sum += fre[a++];
        }
        for(int i=1;i<=fre[target];i++){
            l1.add(sum +i-1);
        }
        return l1;
    }
}