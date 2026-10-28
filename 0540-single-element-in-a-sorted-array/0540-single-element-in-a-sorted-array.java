class Solution {
    public int singleNonDuplicate(int[] nums) {
 HashMap<Integer,Integer>map=new HashMap<>();
        for(int e:nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(int e:nums){
            if(map.get(e)==1){
                return e;
            }
        }
        return -1;
    }
}