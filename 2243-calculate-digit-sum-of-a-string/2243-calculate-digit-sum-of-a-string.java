class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k) return s;
        StringBuilder sb=new StringBuilder();
        int sum=0;
        int i=0;
        for( i=0;i<s.length()-k;i+=k){
            int a=i;
            sum =0;
            while(a<i+k){
                sum += s.charAt(a)-'0';
                a++;
            }
            sb.append(sum);
        }
        sum =0;
        while(i<s.length()){
            sum += s.charAt(i)-'0';
            i++;
        }
        sb.append(sum);
        return digitSum(sb.toString(),k);
    }
}