class Solution {
    public int arrangeCoins(int n) {
        if (n==0) return 0;
        int i=1;
        int ans =0;
        while(n>i){
            n-=i;
            ans++;
            i++;
            
        }
        if(n==i) return ans+1;
        return ans;
    }
}