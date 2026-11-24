class Solution {
    public boolean checkString(String s) {
        for(int i=s.length()-1; i>0; i--){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i-1);
            if(ch1=='a'&&ch2=='b') return false;
        }
        return true;
    }
}