class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=0;i<=n;i++){
            int n1=i,count =0;
            while(n1>0){
                if((n1&1) == 1){
                    count++;
                }
                n1>>=1;
            }
            ans[i]=count;
        }
        return ans;
    }
}