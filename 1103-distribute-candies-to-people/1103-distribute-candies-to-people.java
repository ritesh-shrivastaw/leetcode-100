class Solution {
    public int[] distributeCandies(int candies, int num) {
       int ans[]= new int[num];
        int i=0,j=1;
        while(candies>0){
            ans[i%num]+=Math.min(candies,j);
            i++;
            candies-=j;
            j++;
        }
        return ans; 
    }
}