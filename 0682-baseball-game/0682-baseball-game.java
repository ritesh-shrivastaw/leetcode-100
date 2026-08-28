class Solution {
    public int calPoints(String[] operations) {
        
        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                l1.remove(l1.size()-1);
            }else if(operations[i].equals("D")){
                l1.add(l1.get(l1.size()-1) *2);
            }else if(operations[i].equals("+")){
                l1.add(l1.get(l1.size()-1)+ l1.get(l1.size()-2));
            }else{
                l1.add(Integer.valueOf(operations[i]));
            }
        }
        int sum=0;
        for(int a : l1){
            sum += a;
        }
        return sum;
    }
}