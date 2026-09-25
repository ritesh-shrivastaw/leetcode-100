class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE,ind =0;
        for(int i=0;i<points.length;i++){
            if(points[i][0]==x || points[i][1]==y){
             int curr=   Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(curr < min ){
                    min = curr;
                    ind =i;
                   
                }
            }
        }
        if(min > 1000000000) return -1;
        return ind;
    }
}