class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalc=0;
        int totalg=0;
        int start=0;
        int diff=0;
        for(int i=0;i<gas.length;i++){
            totalc +=gas[i];
            totalg +=cost[i];
             diff +=gas[i]-cost[i];
        
        if(diff <0){
            start =i+1;
            diff=0;
        }
        }
        if(totalc >= totalg){
            return start;
        }
        return -1;
    }
}