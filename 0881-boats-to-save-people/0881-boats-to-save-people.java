class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);
        int i=0;
        int j=p.length-1;
        int boat=0;
        while(i<=j){
            if(p[i]+p[j]<=limit){
                i++;
            }
            j--;
            boat++;
        }
        return boat;
    }
}