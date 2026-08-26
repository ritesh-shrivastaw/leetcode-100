class Solution {
    public int maxDistance(int[] colors) {
        int left =0, right = colors.length-1,dis =0,max=0;
       for(int i=0;i<colors.length;i++){
            left=i;
            right = colors.length-1;
             while(left<right){
            if(colors[left]!= colors[right]){
                dis = right-left;
                break;
            }
                right--;
            
        }
         max = Math.max(max,dis);
       
       }
        return max;
    }
}