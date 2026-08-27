class Solution {
    public boolean detectCapitalUse(String word) {
        int count =0;
          for  (char ch : word.toCharArray())
            if(ch >=65 && ch<=90){
                count++;
            }
        
         if(count ==0) return true;
        if(count == word.length()) return true;
        if(count ==1 &&(word.charAt(0)<=90) ) return true;
       
        return false;
    }
}