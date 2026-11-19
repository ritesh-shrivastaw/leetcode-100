class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> ritesh = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            ritesh.add(nums1[i]);
        }
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(ritesh.contains(nums2[i])){
                l.add(nums2[i]);
                ritesh.remove(nums2[i]);
            }
        }
        int res[] = new int[l.size()];
        int a=0;
        for(int i : l){
            res[a]=i;
            a++;
        }
        return res;
    }
}