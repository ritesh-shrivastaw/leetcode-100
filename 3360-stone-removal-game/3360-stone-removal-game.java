class Solution {
    public boolean canAliceWin(int n) {
       int num =10,turn =0;
       while(n>=num){
        n-=num;
        num -=1;
        turn = (turn+1)%2;
       } 
       if(turn ==0){
        return false;
       }
       return true;
    }
}