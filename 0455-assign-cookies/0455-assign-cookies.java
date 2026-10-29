class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int childcount =0;
        int choccount=0;
        int m=g.length;
        int n=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
    while(childcount<m && choccount<n){
        if(g[childcount] <=s[choccount]){
            childcount ++;
        }
        choccount++;
    }
    return childcount;
    }
}