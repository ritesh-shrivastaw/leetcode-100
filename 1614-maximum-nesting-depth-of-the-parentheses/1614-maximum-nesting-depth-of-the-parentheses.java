class Solution {
    public int maxDepth(String s) {
        int depth =0;
        int maxd=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                depth ++;
                maxd = Math.max(depth,maxd);
            }
            else if(s.charAt(i)==')'){
                depth --;
            }
        }
        return maxd;
    }
}