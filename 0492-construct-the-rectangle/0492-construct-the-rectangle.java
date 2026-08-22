class Solution {
    public int[] constructRectangle(int area) {
        int a = (int) Math.sqrt(area);
        for(int i=a;i>0;i--){
            if(area % i ==0){
                return new int[] {area/i,i};
            }
        }
        return new int[]{};
    }
}