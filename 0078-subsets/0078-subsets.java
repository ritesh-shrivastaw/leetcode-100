class Solution {
    public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
        int x=0;
        generatesubsets(res , nums, 0,new ArrayList<Integer>());
        return res;
    }
    void generatesubsets(List<List<Integer>> l1, int[] nums,int x,List<Integer> curr){
        l1.add(new ArrayList<Integer>(curr));
        for(int i= x;i < nums.length;i++){
            curr.add(nums[i]);
            generatesubsets(l1,nums,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
}