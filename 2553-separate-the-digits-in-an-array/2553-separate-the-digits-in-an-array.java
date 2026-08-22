class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l1 = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
             List<Integer> l2 = new ArrayList<Integer>();
            int c = nums[i];
            while(c>0){
                l2.add(c%10);
                c =c/10;
            }
            // Collections.reverse(l2);
            // l1.addAll(l2);
            for(int a =l2.size()-1;a>=0;a--){
                l1.add(l2.get(a));
            }
        }
        int[] ans = new int[l1.size()];
        for(int i =0;i<ans.length;i++){
            ans[i] = l1.get(i);
        }
        return ans;
    }
}