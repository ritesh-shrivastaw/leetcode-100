class Solution {
    public int eraseOverlapIntervals(int[][] intr) {
        if(intr.length==1) return 0;
        Arrays.sort(intr, (a,b)-> Integer.compare(a[1],b[1]));
        int lastA= intr[0][1];
        int count =0;
        for(int i=1;i< intr.length;i++){
            if(lastA > intr[i][0]){
                count++; 
                
            }else{
                lastA = intr[i][1];
            }       
             
        }
        return count;
    }
}