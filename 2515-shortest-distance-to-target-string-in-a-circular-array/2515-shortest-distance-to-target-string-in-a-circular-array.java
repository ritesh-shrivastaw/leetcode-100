class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int ind =-1,min =Integer.MAX_VALUE , a=0;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target) ){
                ind= Math.min(Math.abs(i-startIndex),Math.min((startIndex+1+(words.length-1-i)),(words.length-1-startIndex + 1 +i)));
                min = Math.min(ind,min);
                a=1;
            }
             
        }
        if(a==0){
            return -1;
        }
        return min;
    }
}