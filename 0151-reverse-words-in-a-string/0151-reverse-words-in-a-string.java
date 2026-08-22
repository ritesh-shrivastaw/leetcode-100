class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            // if(s.matches("[a-zA-Z]+")) continue;
            if(i != 0){
                sb.append(arr[i]);
                sb.append(' ');
            }else{
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}