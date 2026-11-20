class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int num: arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        HashSet<Integer>set = new HashSet<>();
        for(int fre:mp.values()){
            if(!set.add(fre)){
                return false;
            }
        }
        return true;
    }
}