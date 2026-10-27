class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
        boolean low=false;
        boolean up = false;
        boolean digit=false;
        boolean sp = false;
      
        String schar= "!@#$%^&*()-+";
        for( int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            char pre = ch;
            if( ch >= 'a' && ch <='z'){
                low = true;
            }else if(ch >='A' && ch <='Z'){
                up = true;
            }else if(ch >='0' && ch<='9'){
                digit = true;
            }else if( schar.indexOf(ch) != -1){
                sp = true;
            }
            if(i > 0 && password.charAt(i)== password.charAt(i-1)){
                return false;
            }

           
        }
        return up && low && sp && digit ;
    }
}